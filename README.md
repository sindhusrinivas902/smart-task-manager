# 📌 Smart Task Manager

Smart Task Manager is a full-stack web application built using Spring Boot that allows users to efficiently manage daily tasks. It provides RESTful APIs for performing CRUD operations and includes a dynamic frontend dashboard for task visualization and management.

## ✨ Features

- Create, Read, Update, Delete tasks (CRUD)
- RESTful API design
- MySQL database integration
- Task prioritization and deadline tracking
- Clean layered architecture (Controller, Repository, Entity)

## 🛠️ Tech Stack

- Backend: Spring Boot (Java)
- Database: MySQL
- Frontend: HTML, CSS, JavaScript
- API Testing: Postman
- Build Tool: Maven
- IDE: IntelliJ IDEA / VS Code

## 🏗️ Architecture

Controller Layer → Handles HTTP requests
Repository Layer → Handles database operations
Entity Layer → Represents database tables

## 🚀 API Endpoints

| Method | Endpoint        | Description        |
|-------|----------------|--------------------|
| GET   | /tasks         | Get all tasks      |
| GET   | /tasks/{id}    | Get task by ID     |
| POST  | /tasks         | Create new task    |
| PUT   | /tasks/{id}    | Update task        |
| DELETE| /tasks/{id}    | Delete task        |

## 📌 Sample Request

POST /tasks

```json
{
  "title": "Learn Spring Boot",
  "description": "Build API",
  "status": "Pending",
  "priority": "High",
  "deadline": "2026-04-01"
}

## ▶️ How to Run

1. Clone the repository
2. Open in IntelliJ IDEA / VS Code
3. Configure MySQL in application.properties:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=yourpassword
```
4. Run the application
5. Open Postman and test APIs

## 📌 Project Highlights

Built a full-stack CRUD application from scratch
Designed REST APIs and tested using Postman
Integrated MySQL database with Spring Boot
Implemented deadline-based task tracking

## 🔮 Future Enhancements

Add authentication using Spring Security
Build frontend using React
Deploy using AWS / Render

## 👩‍💻 Author
Sindhu M S

