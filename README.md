# Janitri Backend Assignment

This is a Spring Boot backend application designed to manage users, patients, and heart rate data for the Janitri assignment. It provides RESTful APIs for user registration, patient management, and heart rate tracking.

---

## Features
- **User Management**: Register and login users.
- **Patient Management**: Add and retrieve patient details.
- **Heart Rate Tracking**: Record and retrieve patient heart rate data.

---

## Prerequisites
1. Java 17 or higher
2. Maven 3.6 or higher
3. MySQL Server
4. Postman (optional, for testing API endpoints)
5. Git (for version control)

---

## Installation and Setup

1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd janitri-backend

2. Set Up MySQL
	•	Create a database named janitri_db.
	•	(Optional) Create a user with access to the database.
3.	Configure Database in application.properties
Update the following file: src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/janitri_db
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update


4.	Build the Project

mvn clean install


5.	Run the Project

mvn spring-boot:run


6.	Access the Application
	•	The application runs on http://localhost:8080 by default.

API Documentation

User Management

1. Register a User
	•	Endpoint: POST /users/register
	•	Request Body:

{
    "email": "example@gmail.com",
    "password": "password123"
}


	•	Response:

{
    "message": "User registered successfully"
}



2. Login User
	•	Endpoint: POST /users/login
	•	Request Body:

{
    "email": "example@gmail.com",
    "password": "password123"
}


	•	Response:

{
    "message": "Login successful"
}

Patient Management

1. Add a Patient
	•	Endpoint: POST /patients
	•	Request Body:

{
    "name": "John Doe",
    "age": 45,
    "gender": "Male"
}


	•	Response:

{
    "message": "Patient added successfully"
}



2. Retrieve All Patients
	•	Endpoint: GET /patients
	•	Response:

[
    {
        "id": 1,
        "name": "John Doe",
        "age": 45,
        "gender": "Male"
    }
]

Heart Rate Tracking

1. Record Heart Rate
	•	Endpoint: POST /heart-rate
	•	Request Body:

{
    "patientId": 1,
    "bpm": 72
}


	•	Response:

{
    "message": "Heart rate recorded successfully"
}



2. Retrieve Heart Rate Data for a Patient
	•	Endpoint: GET /heart-rate/{patientId}
	•	Response:

[
    {
        "id": 1,
        "bpm": 72,
        "recordedAt": "2025-01-07T12:34:56"
    }
]

Assumptions
	1.	The database is running locally on port 3306.
	2.	No authentication or authorization protocols are implemented, as specified in the requirements.

Technologies Used
	•	Java: Programming language
	•	Spring Boot: Framework for backend development
	•	MySQL: Database
	•	Maven: Build tool

Running Tests (Optional)

You can write and run unit tests for the project using JUnit:

mvn test

Contributing

Feel free to fork this repository and make contributions!
