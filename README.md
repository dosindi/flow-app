# Technology
- Frontend: ui5 / react
- Backend: spring java
- Database: mysql

## Database

```sql
USE DATABASE flow_db;
-- ============================================
-- Process Flow Database Schema
-- ============================================

-- Drop existing tables if they exist
DROP TABLE IF EXISTS node_children;
DROP TABLE IF EXISTS node_texts;
DROP TABLE IF EXISTS nodes;
DROP TABLE IF EXISTS lanes;

-- ============================================
-- Lanes Table
-- ============================================
CREATE TABLE lanes (
    id VARCHAR(10) PRIMARY KEY,
    icon VARCHAR(100) NOT NULL,
    label VARCHAR(100) NOT NULL,
    position INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    INDEX idx_position (position)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ============================================
-- Nodes Table
-- ============================================
CREATE TABLE nodes (
    id VARCHAR(10) PRIMARY KEY,
    lane_id VARCHAR(10) NOT NULL,
    title VARCHAR(255) NOT NULL,
    title_abbreviation VARCHAR(20) NOT NULL,
    state ENUM('Positive', 'Negative', 'Critical', 'Neutral', 'Planned') NOT NULL,
    state_text VARCHAR(100),
    focused BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (lane_id) REFERENCES lanes(id) ON DELETE CASCADE,
    INDEX idx_lane (lane_id),
    INDEX idx_state (state),
    INDEX idx_focused (focused)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ============================================
-- Node Children (Relationships)
-- ============================================
CREATE TABLE node_children (
    parent_id VARCHAR(10) NOT NULL,
    child_id VARCHAR(10) NOT NULL,
    sequence_order INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (parent_id, child_id),
    FOREIGN KEY (parent_id) REFERENCES nodes(id) ON DELETE CASCADE,
    FOREIGN KEY (child_id) REFERENCES nodes(id) ON DELETE CASCADE,
    INDEX idx_parent (parent_id),
    INDEX idx_child (child_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ============================================
-- Node Texts (Additional Information)
-- ============================================
CREATE TABLE node_texts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    node_id VARCHAR(10) NOT NULL,
    text_content VARCHAR(500) NOT NULL,
    sequence_order INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (node_id) REFERENCES nodes(id) ON DELETE CASCADE,
    INDEX idx_node (node_id),
    UNIQUE KEY unique_node_text (node_id, sequence_order)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ============================================
-- Insert Sample Data from JSON
-- ============================================

-- Insert Lanes
INSERT INTO lanes (id, icon, label, position) VALUES
('0', 'sap-icon://cart-3', 'Order', 0),
('1', 'sap-icon://factory', 'Manufacturing', 1),
('2', 'sap-icon://puzzle', 'Assembly', 2),
('3', 'sap-icon://marketing-campaign', 'Marketing', 3),
('4', 'sap-icon://shipping-status', 'Delivery', 4),
('5', 'sap-icon://payment-approval', 'Payment', 5);

-- Insert Nodes
INSERT INTO nodes (id, lane_id, title, title_abbreviation, state, state_text, focused) VALUES
('1', '0', 'Raw material: From stock', 'RMS', 'Positive', 'Delivered', FALSE),
('2', '0', 'Raw material: Purchased', 'RMP', 'Positive', 'Delivered', FALSE),
('3', '0', 'Spare parts: Purchased', 'SPP', 'Negative', 'Not delivered', TRUE),
('10', '1', 'Manufacturing: Freezer', 'MAF', 'Positive', 'Finished', FALSE),
('11', '1', 'Manufacturing: Electronic parts', 'MAE', 'Positive', 'Finished', FALSE),
('12', '1', 'Manufacturing: Case', 'MAC', 'Positive', 'Finished', FALSE),
('13', '1', 'Manufacturing: Ice dispenser', 'MAID', 'Negative', 'Not finished', FALSE),
('20', '2', 'Assembly: Main unit', 'AMU', 'Positive', 'Finished', FALSE),
('21', '2', 'Assembly: Case with dispenser', 'ASP', 'Critical', 'At risk', FALSE),
('22', '2', 'Assembly: Final', 'ASF', 'Critical', 'At risk', FALSE),
('30', '3', 'Marketing campaign', 'MC', 'Positive', 'Done', FALSE),
('31', '3', 'Campaign evaluation', 'CE', 'Neutral', 'Pending', FALSE),
('41', '4', 'Delivery', 'DEL', 'Critical', 'At risk', TRUE),
('51', '5', 'Invoice', 'INV', 'Planned', NULL, FALSE);

-- Insert Node Children (Relationships)
INSERT INTO node_children (parent_id, child_id, sequence_order) VALUES
('1', '10', 1),
('1', '11', 2),
('2', '10', 1),
('2', '11', 2),
('3', '41', 1),
('10', '20', 1),
('11', '20', 1),
('12', '21', 1),
('13', '21', 1),
('20', '22', 1),
('21', '22', 1),
('22', '41', 1),
('30', '41', 1),
('31', '41', 1),
('41', '51', 1);

-- Insert Node Texts
INSERT INTO node_texts (node_id, text_content, sequence_order) VALUES
('1', 'Raw material from stock', 1),
('2', 'Raw material from purchase', 1),
('3', 'Spare parts for ice dispenser', 1),
('10', 'Vaporizer', 1),
('10', 'Compressor', 2),
('11', 'Control unit', 1),
('11', 'Cabling', 2),
('12', 'Case', 1),
('12', 'Mechanical parts', 2),
('20', 'Freezer', 1),
('20', 'Electronic parts', 2),
('21', 'Assembly ice dispenser', 1),
('21', 'with the case', 2),
('31', 'Results not completed', 1);

-- ============================================
-- Useful Views
-- ============================================

-- View: Complete node information with lane details
CREATE OR REPLACE VIEW v_nodes_complete AS
SELECT 
    n.id,
    n.title,
    n.title_abbreviation,
    n.state,
    n.state_text,
    n.focused,
    l.label AS lane_label,
    l.icon AS lane_icon,
    l.position AS lane_position,
    GROUP_CONCAT(DISTINCT nt.text_content ORDER BY nt.sequence_order SEPARATOR '|') AS texts
FROM nodes n
INNER JOIN lanes l ON n.lane_id = l.id
LEFT JOIN node_texts nt ON n.id = nt.node_id
GROUP BY n.id, n.title, n.title_abbreviation, n.state, n.state_text, n.focused, 
         l.label, l.icon, l.position;

-- View: Node relationships (parent-child)
CREATE OR REPLACE VIEW v_node_relationships AS
SELECT 
    nc.parent_id,
    pn.title AS parent_title,
    nc.child_id,
    cn.title AS child_title,
    nc.sequence_order
FROM node_children nc
INNER JOIN nodes pn ON nc.parent_id = pn.id
INNER JOIN nodes cn ON nc.child_id = cn.id
ORDER BY nc.parent_id, nc.sequence_order;

-- ============================================
-- Useful Queries (Examples)
-- ============================================

-- Query: Get all nodes in a specific lane
-- SELECT * FROM nodes WHERE lane_id = '1';

-- Query: Get all critical or at-risk nodes
-- SELECT * FROM nodes WHERE state IN ('Critical', 'Negative');

-- Query: Get all focused nodes
-- SELECT * FROM nodes WHERE focused = TRUE;

-- Query: Get complete process flow with children
-- SELECT DISTINCT
--     n.id,
--     n.title,
--     n.state,
--     l.label AS lane,
--     GROUP_CONCAT(DISTINCT nc.child_id ORDER BY nc.sequence_order) AS children
-- FROM nodes n
-- INNER JOIN lanes l ON n.lane_id = l.id
-- LEFT JOIN node_children nc ON n.id = nc.parent_id
-- GROUP BY n.id, n.title, n.state, l.label
-- ORDER BY l.position, n.id;

-- Query: Get nodes with their texts
-- SELECT 
--     n.id,
--     n.title,
--     n.state,
--     nt.text_content
-- FROM nodes n
-- LEFT JOIN node_texts nt ON n.id = nt.node_id
-- ORDER BY n.id, nt.sequence_order;

```

### Maven plugin 
add dependency for the generator plugin:

```xml
<plugin>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-generator-maven-plugin</artifactId>
    <version>7.16.0</version>
    <executions>
        <execution>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <inputSpec>
                    ${project.basedir}/src/main/resources/petstore.yml
                </inputSpec>
                <generatorName>spring</generatorName>
                <apiPackage>com.baeldung.openapi.api</apiPackage>
                <modelPackage>com.baeldung.openapi.model</modelPackage>
                <supportingFilesToGenerate>
                    ApiUtil.java
                </supportingFilesToGenerate>
                <configOptions>
                    <delegatePattern>true</delegatePattern>
                </configOptions>
            </configuration>
        </execution>
    </executions>
</plugin>
```

As we can see, we passed in the YAML file as inputSpec. After that, since we needed a Spring-based server, we used the generatorName as spring.

Then apiPackage specifies the package name where the API will be generated into.

Next, we have the modelPackage where the generator places the data models.

With delegatePattern set to true, we’re asking to create an interface that can be implemented as a customized @Service class

### Maven dependency

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>3.5.7</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.data</groupId>
        <artifactId>spring-data-jpa</artifactId>
        <version>3.5.7</version>
    </dependency>
</dependencies>
```

### Code Generation

mvn clean install

###  spring version 3.0 and jakarta namespace

```
<configOptions>
     // ... 
    <useSpringBoot3>true</useSpringBoot3>
     // ...
    <useJakartaEe>true</useJakartaEe>
</configOptions>
```

### Run

Open in browser:

Swagger UI: http://localhost:8080/swagger-ui.html
OpenAPI JSON: http://localhost:8080/v3/api-docs