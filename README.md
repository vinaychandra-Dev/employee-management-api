# Employee CRUD API (Spring Boot + H2)

A simple RESTful API for managing employees using **Spring Boot**, **Maven**, and **H2 in-memory database**. This project showcases basic CRUD operations with clean and maintainable architecture.

## 📌 Features

- Create, Read, Update, and Delete Employees
- RESTful API using Spring Boot
- In-memory H2 Database for quick testing
- JPA/Hibernate for ORM
- Maven for build automation
- Lombok for boilerplate reduction

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Lombok

## 🚀 Getting Started

### Prerequisites

- Java JDK 17+
- Maven 3.6+
--
### Clone the Repository

git clone https://github.com/your-username/employee-crud-spring.git
cd employee-crud-spring
---
#Build and Run
mvn clean install
mvn spring-boot:run
Application runs at:
http://localhost:8080

#Access H2 Console
H2 Console is available at:
http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (leave blank)

#📦 API Endpoints
Method	Endpoint	Description
GET	/api/employees	Get all employees
GET	/api/employees/{id}	Get employee by ID
POST	/api/employees	Create a new employee
PUT	/api/employees/{id}	Update existing employee
DELETE	/api/employees/{id}	Delete an employee

Sample JSON (POST/PUT)

json
Copy
Edit
{
  "firstName": "Alice",
  "lastName": "Smith",
  "email": "alice.smith@example.com"
}

#🧪 Testing

Use Postman or curl to test endpoints.

Example:

curl -X GET http://localhost:8080/api/employee

#⚙️ Configuration - application.properties

# H2 Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# JPA Configuration
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
