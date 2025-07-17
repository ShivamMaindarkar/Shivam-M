create database country;
use country;
CREATE TABLE citys (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    pincode VARCHAR(10),
    state VARCHAR(100),
    country VARCHAR(100),
    population INT,
    area_sq_km DECIMAL(10,2)
);
INSERT INTO citys (name, pincode, state, country, population, area_sq_km)
VALUES 
('Mumbai', '400001', 'Maharashtra', 'India', 20411000, 603.40),
('Delhi', '110001', 'Delhi', 'India', 16787941, 1484.00),
('New York', '10001', 'New York', 'USA', 8419600, 783.80),
('London', 'EC1A', 'England', 'UK', 8982000, 1572.00),
('Tokyo', '100-0001', 'Tokyo', 'Japan', 13929286, 2194.07);
SHOW TABLES;
SELECT * FROM citys;