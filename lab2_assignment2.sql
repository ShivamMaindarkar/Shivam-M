CREATE DATABASE IF NOT EXISTS CompanyDB;
USE CompanyDB;

CREATE TABLE IF NOT EXISTS Employee (
    emp_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT,
    email VARCHAR(100)
);

INSERT INTO Employee (first_name, last_name, age, email) VALUES
('John', 'Doe', 30, 'john.doe@example.com'),
('Jane', 'Smith', 28, 'jane.smith@example.com'),
('Mike', 'Johnson', 35, 'mike.johnson@example.com'),
('Emily', 'Davis', 26, 'emily.davis@example.com');

SELECT * FROM Employee;
