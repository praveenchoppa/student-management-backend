# Student Management Backend
> This is a backend-only project focused on REST API development.


A Spring Boot REST API for managing students with full CRUD operations, search functionality,
global exception handling, and proper HTTP status codes.

This project was built to understand backend fundamentals, REST API design,
Spring Boot architecture, and database integration.

---

##  Features

- Add a new student
- Get all students
- Search students by name
- Get student by ID
- Update student details
- Delete student
- Global exception handling
- Proper REST-compliant HTTP status codes

---

##  Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

##  Project Architecture

The application follows a clean layered architecture:
Controller → Service → Repository → Database


- **Controller**: Handles HTTP requests and responses
- **Service**: Contains business logic
- **Repository**: Handles database operations
- **Database**: MySQL



##  API Endpoints

| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/addStudent` | Add a new student |
| GET | `/students` | Get all students |
| GET | `/students/search?name={name}` | Search students by name |
| GET | `/students/{id}` | Get student by ID |
| PUT | `/students` | Update student |
| DELETE | `/students/{id}` | Delete student |


##  Database

- MySQL database
- Tables are auto-created using Hibernate
- Primary keys are auto-generated
- ID gaps after delete are expected and handled correctly


##  Exception Handling

- Custom exceptions for error scenarios
- Global exception handler using `@RestControllerAdvice`
- Returns meaningful error messages with proper HTTP status codes


## How to Run the Project

1. Clone the repository
2. Configure MySQL details in `application.properties`
3. Run the application
4. Test APIs using Postman or browser

---

##  Learning Outcomes

- REST API design
- Dependency Injection
- Spring Boot fundamentals
- ORM with Hibernate
- Clean backend architecture
- Exception handling best practices


