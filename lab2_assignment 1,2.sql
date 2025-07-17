-- Lab-2 Assignment-1
CREATE DATABASE IF NOT EXISTS CollegeDB;
USE CollegeDB;

CREATE TABLE IF NOT EXISTS Student (
    StudentID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS Instructor (
    InstructorID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100)
);

INSERT INTO Student (FirstName, LastName, Email) VALUES
('Jane', 'Smith', 'old_jane_smith@example.com'),
('John', 'Doe', 'john.doe@example.com'),
('Jack', 'Brown', 'jack.brown@example.com'),
('Julia', 'Taylor', 'julia.taylor@example.com');

INSERT INTO Instructor (FirstName, LastName, Email) VALUES
('Sunil', 'Rawat', 'old_sunil.rawat@example.com'),
('Anita', 'Sharma', 'anita.sharma@example.com');

SET SQL_SAFE_UPDATES = 0;

UPDATE Student
SET Email = 'jane_Smith@example.com'
WHERE FirstName = 'Jane' AND LastName = 'Smith';

UPDATE Instructor
SET Email = 'sunilrawat@example.com'
WHERE FirstName = 'Sunil' AND LastName = 'Rawat';

DELETE FROM Student
WHERE LastName = 'Smith';

SELECT *
FROM Student
WHERE FirstName LIKE 'J%';

SET SQL_SAFE_UPDATES = 1;

-- Lab-2 Assignment-2
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

