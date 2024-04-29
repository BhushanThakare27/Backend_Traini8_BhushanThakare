# Training Center Management System

Name = Bhushan Thakare
Email = bhushanthakare.11716811@gmail.com
Phone = 9545596086 

This project provides a Spring Boot application for managing training centers.

## Project Structure

The project structure is organized as follows:

- **com.Traini8.Training_Center.Controllers**: Contains REST controllers for handling HTTP requests.
- **com.Traini8.Training_Center.Models**: Contains entity classes representing the data model.
- **com.Traini8.Training_Center.Repository**: Contains interfaces for database interaction.
- **com.Traini8.Training_Center.Services**: Contains service classes for business logic.

## Dependencies

The project has the following dependencies:

- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- Spring Boot Starter Validation
- MySQL Connector
- Spring Boot Starter Test

## Setup Instructions

Follow these steps to set up and run the project:

### Step 1: Clone the Repository

```bash
git clone <repository-url>
cd Training_Center

###  Step 2: Set up Database

Create a MySQL database.
Update the application.properties file with your database configuration.


spring.datasource.url=jdbc:mysql://localhost:3306/Training_Center
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update

###   Step 3: Run the Application
Open the project in your IDE.
Build and run the application using Maven, or run the main class TrainingCenterApplication.


###   Step 4: Test the APIs
Use tools like Postman to test the provided APIs.

Create Training Center:
Endpoint: POST /Api/Add
Request Body: JSON object representing the Training Center.

{
    "CenterName": "Example Training Center",
    "CenterCode": "TC123",
    "address": {
        "detailedAddress": "123 Main St",
        "city": "Example City",
        "state": "Example State",
        "pincode": 12345
    },
    "studentCapacity": 100,
    "coursesOffered": ["Course1", "Course2"],
    "contactEmail": "example@example.com",
    "contactPhone": "1234567890"
}

Get All Training Centers:
Endpoint: GET /Api/GetAllCenters

#####


This README provides detailed setup instructions for configuring the project, setting up the database, running the application, testing the APIs, and reviewing potential enhancements.


 Thank You !