CREATE DATABASE IF NOT EXISTS StudentManagementSystem;
USE StudentManagementSystem;

DROP TABLE IF EXISTS Student;

CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Gender VARCHAR(10),
    Email VARCHAR(100),
    Phone VARCHAR(15)
);

INSERT INTO Student (StudentID, FirstName, LastName, DateOfBirth, Gender, Email, Phone) VALUES
(1, 'Alice', 'Smith', '2008-05-21', 'Female', 'alice@example.com', '1234567890'),
(2, 'Bob', 'Johnson', '2010-07-12', 'Male', 'bob@example.com', '0987654321'),
(3, 'Jack', 'Williams', '2011-03-15', 'Male', 'jack@example.com', '1122334455'),
(4, 'Anna', 'Taylor', '2009-06-17', 'Female', 'anna@example.com', '5566778899'),
(5, 'John', 'Doe', '2012-09-10', 'Male', 'john@example.com', '6677889900'),
(6, 'Emma', 'Brown', '2007-02-28', 'Female', 'emma@domain.com', '3344556677');

SELECT * FROM Student
WHERE DateOfBirth > '2009-06-16';

SELECT * FROM Student
WHERE FirstName LIKE 'A%' OR FirstName LIKE 'J%';

SELECT * FROM Student
WHERE FirstName != 'Alice' AND Email LIKE '%@example.com';

