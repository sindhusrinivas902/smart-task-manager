
📌 Project Description

Smart Task Manager is a backend application built using Spring Boot that allows users to manage their daily tasks efficiently. It provides RESTful APIs to perform CRUD operations like creating, updating, retrieving, and deleting tasks. The application is connected to a MySQL database for persistent storage.

🚀 Features
✅ Create new tasks
📋 View all tasks
✏️ Update existing tasks
❌ Delete tasks
🔗 REST API integration
💾 Data stored in MySQL database
🛠️ Tech Stack
Backend: Spring Boot (Java)
Database: MySQL
API Testing: Postman
Build Tool: Maven
IDE: IntelliJ IDEA / VS Code
⚙️ How to Run the Project
🔹 1. Clone the repository
git clone https://github.com/sindhusrinivas902/smart-task-manager.git
🔹 2. Open in IDE
Open the project in IntelliJ / VS Code
🔹 3. Configure Database
Create a MySQL database (e.g., taskdb)
Update application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
🔹 4. Run the application
Run the main Spring Boot class
📡 API Endpoints (Sample)
Method	Endpoint	Description
GET	/tasks	Get all tasks
POST	/tasks	Create new task
PUT	/tasks/{id}	Update task
DELETE	/tasks/{id}	Delete task
🎯 Future Improvements
🔍 Search and filter tasks
📅 Add deadlines & sorting
🔐 User authentication (Spring Security)
🌐 Frontend integration (React)
👨‍💻 Author
Sindhu Srinivas

