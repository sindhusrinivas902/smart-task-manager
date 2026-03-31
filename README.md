📌 Smart Task Manager

Smart Task Manager is a full-stack web application built using Spring Boot that allows users to efficiently manage daily tasks. It provides RESTful APIs for performing CRUD operations and includes a dynamic frontend dashboard for task visualization and management.

 ✨ Features

- Create, Read, Update, Delete tasks (CRUD)
- RESTful API design
- MySQL database integration
- Task prioritization and deadline tracking
- Backend structured using Spring Boot 

🛠️ Tech Stack

- Backend: Spring Boot (Java)  
- Database: MySQL  
- Frontend: HTML, CSS, JavaScript  
- API Testing: Postman  
- Build Tool: Maven  
- IDE: IntelliJ IDEA / VS Code

🏗️ Architecture

- Controller Layer → Handles API requests
- Service Layer → Business logic (optional improvement)
- Repository Layer → Database interaction
- Entity Layer → Data model

 📌 Project Highlights
- Built a full-stack CRUD application from scratch
- Designed REST APIs and integrated with frontend
- Implemented task categorization based on deadlines and completion status

🚀 How to Run the Project

1. Clone the repository
2. Open in IntelliJ / VS Code
3. Configure MySQL in application.properties:
   spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
   spring.datasource.username=root
   spring.datasource.password=yourpassword

4. Run the application
5. Open Postman and test APIs:
   - GET /tasks
   - POST /tasks
   - PUT /tasks/{id}
   - DELETE /tasks/{id}

📌 Sample API Request

POST /tasks

{
  "title": "Learn Spring Boot",
  "description": "Build API",
  "status": "Pending",
  "priority": "High",
  "deadline": "2026-04-01"
}

🔮 Future Enhancements

- Add authentication (Spring Security)
- Build frontend using React
- Deploy using AWS / Render








