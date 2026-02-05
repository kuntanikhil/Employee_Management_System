# Employee Management System

A **Spring Boot based Employee Management System** that performs basic CRUD (Create, Read, Update, Delete) operations on employee data using RESTful APIs.

This project is designed for learning and demonstrating backend development using **Java + Spring Boot**, and it is suitable for beginners and freshers to showcase in their resumes.

---

## 📌 Project Overview

The Employee Management System allows users to manage employee records efficiently.  
It provides REST APIs to create, retrieve, update, and delete employee details stored in a database.

---

## ✨ Features

- Add a new employee
- View all employees
- View employee by ID
- Update employee details
- Delete employee records
- RESTful API architecture
- Clean and simple Spring Boot project structure

---

## 🛠️ Technologies Used

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **REST APIs**
- **Maven**
- **Database**: MySQL / H2 (configurable)

---

## 📂 Project Structure

Employee_Management_System/
├── .mvn/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ └── employeemanagement/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ ├── service/
│ │ │ └── EmployeeManagementApplication.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── static/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md


---

## 📥 Prerequisites

Make sure you have the following installed on your system:

- Java JDK 8 or higher
- Maven
- Git
- MySQL (optional, if not using H2)
- IntelliJ IDEA / Eclipse / VS Code

---

## 🚀 How to Run the Project Locally

### 
1️⃣ Clone the Repository : using the link

Move into the project directory:

cd Employee_Management_System

2️⃣ Configure the Database
Option A: Using MySQL

Create a database:
CREATE DATABASE employee_db;

Update src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

3️⃣ Build and Run the Application

Using Maven:
mvn clean install
mvn spring-boot:run

🌐 Access the Application

Once the application starts successfully, it will run on:

http://localhost:8080

📡 API Endpoints


| HTTP Method | Endpoint          | Description        |
| ----------- | ----------------- | ------------------ |
| GET         | `/employees`      | Get all employees  |
| GET         | `/employees/{id}` | Get employee by ID |
| POST        | `/employees`      | Add a new employee |
| PUT         | `/employees/{id}` | Update employee    |
| DELETE      | `/employees/{id}` | Delete employee    |


🧪 Sample JSON for POST Request

{
  "name": "John Doe",
  "department": "Engineering",
  "email": "john.doe@example.com",
  "salary": 50000
}






