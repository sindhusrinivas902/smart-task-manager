📌 Smart Task Manager

Smart Task Manager is a full-stack web application built using Spring Boot that allows users to efficiently manage daily tasks. It provides RESTful APIs for performing CRUD operations and includes a dynamic frontend dashboard for task visualization and management.

 🚀 Features

- ✅ Create new tasks  
- 📋 View all tasks  
- ✏️ Update existing tasks  
- ❌ Delete tasks  
- 🟡 Mark tasks as completed  
- 📅 Categorize tasks based on deadline (Today / Tomorrow / Others)  
- 🔗 REST API integration  
- 💾 Persistent storage using MySQL database  

🛠️ Tech Stack

- Backend: Spring Boot (Java)  
- Database: MySQL  
- Frontend: HTML, CSS, JavaScript  
- API Testing: Postman  
- Build Tool: Maven  
- IDE: IntelliJ IDEA / VS Code

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









