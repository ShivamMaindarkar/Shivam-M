CREATE DATABASE EduTrackDB;
USE EduTrackDB;
CREATE TABLE Learner (
    LearnerID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Gender VARCHAR(10),
    Email VARCHAR(100),
    Phone VARCHAR(15)
);
CREATE TABLE Subject (
    SubjectID INT PRIMARY KEY,
    Title VARCHAR(100),
    Credit INT
);
CREATE TABLE Trainer (
    TrainerID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100)
);
CREATE TABLE Registration (
    RegistrationID INT PRIMARY KEY,
    RegistrationDate DATE,
    LearnerID INT,
    SubjectID INT,
    TrainerID INT,
    FOREIGN KEY (LearnerID) REFERENCES Learner(LearnerID),
    FOREIGN KEY (SubjectID) REFERENCES Subject(SubjectID),
    FOREIGN KEY (TrainerID) REFERENCES Trainer(TrainerID)
);
CREATE TABLE Assessment (
    AssessmentID INT PRIMARY KEY,
    SubjectID INT,
    LearnerID INT,
    ExamDate DATE,
    CreditScored INT,
    FOREIGN KEY (SubjectID) REFERENCES Subject(SubjectID),
    FOREIGN KEY (LearnerID) REFERENCES Learner(LearnerID)
);
CREATE TABLE Review (
    ReviewID INT PRIMARY KEY,
    LearnerID INT,
    FOREIGN KEY (LearnerID) REFERENCES Learner(LearnerID)
);
show tables




