CREATE DATABASE COGNIZANT;
USE COGNIZANT;

CREATE TABLE Users (
user_id INT PRIMARY KEY AUTO_INCREMENT,
full_name VARCHAR(100) NOT NULL ,
email VARCHAR(100) UNIQUE NOT NULL, 
city VARCHAR(100) NOT NULL ,
registration_date DATE NOT NULL 
);

CREATE TABLE Events (
event_id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(200) NOT NULL,
city VARCHAR(100) NOT NULL ,
start_date DATETIME NOT NULL ,
end_date DATETIME NOT NULL ,
status ENUM ('upcoming','completed','cancelled'),
organizer_id INT ,
FOREIGN KEY(organizer_id) references Users(user_id) 
);

CREATE TABLE Sessions (
session_id INT PRIMARY KEY AUTO_INCREMENT ,
event_id INT , FOREIGN KEY(event_id) references Events(event_id) ,
title VARCHAR(200) NOT NULL ,
speaker_name VARCHAR(100) NOT NULL ,
start_time DATETIME NOT NULL ,
end_time DATETIME NOT NULL
);

CREATE TABLE Registrations (
registration_id INT PRIMARY KEY AUTO_INCREMENT,
user_id INT , FOREIGN KEY (user_id) references Users(user_id) ,
event_id INT , FOREIGN KEY(event_id) references Events(event_id) ,
registration_date DATE NOT NULL 
);

CREATE TABLE Feedback (
feedback_id INT PRIMARY KEY AUTO_INCREMENT ,
user_id INT, FOREIGN KEY (user_id) references Users(user_id) ,
event_id INT, FOREIGN KEY (event_id) references Events(event_id) ,
rating INT CHECK (rating BETWEEN 1 AND 5) , 
comments TEXT ,
feedback_date DATE NOT NULL 
);

CREATE TABLE Resources (
resource_id INT PRIMARY KEY AUTO_INCREMENT ,
event_id INT, FOREIGN KEY (event_id) references Events(event_id),
resource_type ENUM ('pdf','image','link') ,
resource_url VARCHAR(255) NOT NULL,
uploaded_at DATETIME NOT NULL
); 