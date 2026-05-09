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

## Postman 

## postQuiz
<img width="1918" height="486" alt="image" src="https://github.com/user-attachments/assets/6a47ba8d-80fe-407e-8767-6728fcc0166d" />

## GetAllQuiz
<img width="1892" height="732" alt="image" src="https://github.com/user-attachments/assets/e958cd32-3951-4f21-aee4-0c8cee1bb007" />

## GetSingleQuiz
<img width="1909" height="712" alt="image" src="https://github.com/user-attachments/assets/7b07d447-18f3-4822-b92f-880c946ca406" />

## 2️⃣ Question Service
<pre>
This service manages all quiz questions.
</pre>

## ✨ Features
<pre>
-Add Question
-Get All Questions
-Get Question By ID
-Delete Question
-Update Question
</pre>

## 📸 Screenshots

## 🔹 1. Question  main class
<img width="1884" height="425" alt="image" src="https://github.com/user-attachments/assets/450806bb-5b03-45a8-8669-a9a9cd11f232" />

## 🔹 2. Controller
<img width="1825" height="752" alt="image" src="https://github.com/user-attachments/assets/875c7938-d6c2-4469-884f-b9b44bbe87c3" />

## 🔹 3. Repository
<img width="1889" height="473" alt="image" src="https://github.com/user-attachments/assets/f6ac5074-cab5-47aa-b249-0b89b79bc13d" />

## 🔹 4. Entity
<img width="1845" height="875" alt="image" src="https://github.com/user-attachments/assets/0946d864-55d2-40cc-86ab-c851c34e0997" />

## 🔹 5. Service

## QuestionService
<img width="1900" height="501" alt="image" src="https://github.com/user-attachments/assets/012beec7-a274-4480-9c7a-313849f59112" />

## QuestionServiceImpl
<img width="1884" height="850" alt="image" src="https://github.com/user-attachments/assets/d9811fb5-7208-4e56-b73d-91d2546fade1" />

## 🔹 6. Application.properties
<img width="1853" height="376" alt="image" src="https://github.com/user-attachments/assets/a88cd14a-e5e5-42a2-91ee-fe456ac899ad" />

## Postman 

## postQuestion
<img width="1879" height="522" alt="image" src="https://github.com/user-attachments/assets/d4c07e52-15ea-41ad-82ff-0c16d5ce2874" />

## GetAllQuestion
<img width="1877" height="890" alt="image" src="https://github.com/user-attachments/assets/d4f0023e-b725-47e0-8229-303bc0281ecf" />

## GetSingleQuestion
<img width="1915" height="909" alt="image" src="https://github.com/user-attachments/assets/8796edcf-be44-40be-954b-c883c1ad180e" />

## 📊 Database Table

## ❓ Question Service

<pre>
+---------+------+------------------------------------------------------------+
| ques_id | qid  | question                                                   |
+---------+------+------------------------------------------------------------+
|       1 |    1 | what is java                                               |
|       2 |    1 | what is  Hibernate                                         |
|       3 |    1 | what is  spring boot                                       |
|       4 |    2 | What is the capital of India?                              |
|       5 |    2 | Which is the longest river in the world?                   |
|       6 |    2 | Who invented the bulb?                                     |
|       7 |    3 | What is the minimum age to become Prime Minister of India? |
|       8 |    3 | What is the lower house of Parliament called?              |
|       9 |    3 | How many members are there in Lok Sabha?                   |
|      10 |    4 | Which player is known as King Kohli?                       |
|      11 |    4 | Who is called Captain Cool?                                |
|      12 |    4 | Which Indian player is known as the Hitman?                |
+---------+------+------------------------------------------------------------+
</pre>

##  🧠 Quiz Service

<pre>
+-----+-------------+
| qid | title       |
+-----+-------------+
|   1 | Programming |
|   2 | GK          |
|   3 | Politics    |
|   4 | Cricket     |
+-----+-------------+
</pre>













