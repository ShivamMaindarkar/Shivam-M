CREATE DATABASE IF NOT EXISTS StudentManagementSystem;
USE StudentManagementSystem;

DROP TABLE IF EXISTS Enrollment;
DROP TABLE IF EXISTS Student;
DROP TABLE IF EXISTS Course;

CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Gender VARCHAR(10),
    Email VARCHAR(100),
    Phone VARCHAR(15)
);

CREATE TABLE Course (
    CourseID INT PRIMARY KEY,
    CourseTitle VARCHAR(100),
    Credits INT
);

CREATE TABLE Enrollment (
    EnrollmentID INT AUTO_INCREMENT PRIMARY KEY,
    StudentID INT,
    CourseID INT,
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID)
);

INSERT INTO Student (StudentID, FirstName, LastName, DateOfBirth, Gender, Email, Phone) VALUES
(1, 'Alice', 'Smith', '2001-05-21', 'Female', 'alice@example.com', '1234567890'),
(2, 'Bob', 'Johnson', '2000-11-13', 'Male', 'bob@example.com', '0987654321'),
(3, 'Charlie', 'Williams', '2002-03-17', 'Male', 'charlie@example.com', '1122334455');

INSERT INTO Course (CourseID, CourseTitle, Credits) VALUES
(101, 'Mathematics', 4),
(102, 'Computer Science', 3),
(103, 'English', 2);

INSERT INTO Enrollment (StudentID, CourseID) VALUES
(1, 101),
(1, 102),
(2, 101),
(3, 103),
(2, 103);

SELECT 
    Course.CourseTitle,
    COUNT(Enrollment.StudentID) AS Total_Students
FROM 
    Enrollment
JOIN Course ON Enrollment.CourseID = Course.CourseID
GROUP BY 
    Enrollment.CourseID;
