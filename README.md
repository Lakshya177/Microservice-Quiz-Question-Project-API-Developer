# Microservice-Quiz-Question-Project-API-Developer
## 📌 Introduction
<pre>
The Microservice Quiz & Question Project is a Spring Boot-based application developed using Microservice 
Architecture. It provides REST APIs to manage quizzes and questions efficiently. The project uses 
Spring Data JPA, MySQL, OpenFeign,and Postman for API development, database operations, service 
communication, and testing.
</pre>

## 🎯 Objectives
<pre>
-Develop REST APIs using Spring Boot
-Implement Microservice Architecture
-Perform CRUD operations for Quiz and Question modules
-Enable service-to-service communication using OpenFeign
-Manage database operations using Spring Data JPA and MySQL
-Test APIs using Postman
</pre>

## 🛠️ Technologies Used
<pre>
-Java
-Spring Boot
-Spring Data JPA
-MySQL
-OpenFeign
-REST API
-Postman
</pre>

## 📂 Project Structure

## Quiz
<pre>
quiz
  ├─src/main/java
  |    ├──com.mycompany
  |    |     └──QuizApplication.java
  |    ├──com.mycompany.controller
  |    |     └──MyController.java
  |    ├──com.mycompany.dao
  |    |     └──QuizRepository.java
  |    ├──com.mycompany.entity
  |    |     ├──Question.java
  |    |     └── Quiz.java
  |    └──com.mycompany.service
  |           ├──QuestionClient.java
  |           ├──QuizService.java
  |           └──QuizServiceImpl.java
  └── src/main/resources
        └──application.properties
</pre>

## Question
<pre>
question
  ├─src/main/java
  |    ├──com.mycompany
  |    |     └──QuestionApplication.java
  |    ├──com.mycompany.controller
  |    |     └──MyController.java
  |    ├──com.mycompany.dao
  |    |     └──QuestionRepository.java
  |    ├──com.mycompany.entity
  |    |     └── Question.java
  |    └──com.mycompany.service
  |           ├──QuestionService.java
  |           └──QuestionServiceImpl.java
  └── src/main/resources
        └──application.properties
</pre>

## 🏗️ Microservices Used
## 1️⃣ Quiz Service
<pre>
This service manages quiz and communicates with Question Service using Feign Client.
</pre>
## ✨ Features
<pre>
-Create Quiz
-Get Quiz By ID
-Get All Quizzes
-Connect with Question Service
</pre>

## 📸 Screenshots

## 🔹 1. Quiz main class
<img width="1818" height="865" alt="Screenshot 2026-05-09 135732" src="https://github.com/user-attachments/assets/4aa704c2-8e52-4e7d-8527-b72f683f7b13" />

## 🔹 2. Controller
<img width="1860" height="899" alt="image" src="https://github.com/user-attachments/assets/a63c0cd2-eb4d-458b-9126-66f48052b710" />

## 🔹 3. Repository
<img width="1866" height="883" alt="image" src="https://github.com/user-attachments/assets/97776062-4639-4fd7-ae53-08a4b69d401b" />

## 🔹 4. Entity

## Question
<img width="1860" height="869" alt="image" src="https://github.com/user-attachments/assets/8e33e520-900f-45f5-9dd7-4ec056be66c8" />

## Quiz
<img width="1845" height="794" alt="image" src="https://github.com/user-attachments/assets/8a550745-0fca-4835-a58c-6a170e2ef8db" />

## 🔹 5. Service

## QuestionClient 
<img width="1860" height="716" alt="image" src="https://github.com/user-attachments/assets/0bdef164-7415-41a5-b56f-d9a0993492ce" />

## QuizService
<img width="1872" height="626" alt="image" src="https://github.com/user-attachments/assets/d6976b44-0d56-4311-99fd-8c78e4cc35b4" />

## QuizServiceImpl
<img width="1897" height="870" alt="image" src="https://github.com/user-attachments/assets/025affb8-88c6-4051-9d0b-6a037752b925" />

## 🔹 6. Application.properties
<img width="1859" height="547" alt="image" src="https://github.com/user-attachments/assets/f360cd2f-7144-4683-bc4a-03ee62f8ec0a" />








