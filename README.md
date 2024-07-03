# User Registration With Spring Security

This project is a Java Spring application that demonstrates a secure login and mail activation system. It provides endpoints for user registration, email confirmation, and user authentication. The project consists of several Java classes and configurations that work together to achieve the desired functionality. For a detailed explanation:

<a href="https://medium.com/@hcaslan/user-registration-with-spring-security-backend-5a8261148657"><img src="https://img.shields.io/badge/Medium-000000.svg?style=for-the-badge&logo=Medium&logoColor=white" alt="Medium"></img></a>

## Features

- User Registration: Users can sign up by providing their personal information, including first name, last name, email, and password. The registration process is handled by the `RegistrationController` class.
- Email Confirmation: Upon registration, users receive an email with a confirmation link. Clicking the link verifies their email address and activates their account. The email sending functionality is implemented in the `EmailService` class, and the `ConfirmationToken` class represents the token generated for email confirmation.
- User Authentication: Registered users can authenticate themselves using their email and password. The authentication process is managed by the `WebSecurityConfig` class, which provides security configurations and authentication manager setup.

## Technologies Used

- Java: The programming language used to develop the application.
- Spring Framework: The framework used for building the Java application.
- Spring Security: The security framework used for user authentication and authorization.
- Spring Data JPA: The library used for database access and management.
- Lombok: A Java library for reducing boilerplate code in model classes.
- BCryptPasswordEncoder: A password encoder used for securely storing user passwords.
- JavaMailSender: A Java library for sending emails.

## Setup and Installation

To set up and run the project locally, follow these steps:

1. Clone the repository to your local machine.
2. Install Java and Maven if they are not already installed on your system.
3. Configure the database connection in the `application.yml` file.
4. Build the project using Maven: `mvn clean install`.
5. Run the application: `mvn spring-boot:run`.
6. The application will start running on `http://localhost:9090`.

## API Endpoints

The project provides the following API endpoints for interacting with the application:

- `POST /registration`: Register a new user. Requires a JSON request body with the following fields: `firstName`, `lastName`, `email`, and `password`. This endpoint is handled by the `RegistrationController` class.
  
  <img src="https://i.imgur.com/hmeiyrZ.png"/>
- `GET /registration/confirmation?token={token}`: Confirm the user's email address using the provided token. The token is sent to the user's email upon registration. This endpoint is also handled by the `RegistrationController` class.
  
  <img src="https://i.imgur.com/h6Vo9n9.png"/>
- `POST /auth/login`: Authenticate the user by providing their email and password. Returns a JSON response with an authentication token. This endpoint is managed by the `WebSecurityConfig` class.
  
  <img src="https://i.imgur.com/18IWTb6.png"/>

## Contributing

Contributions to this project are welcome! If you find any issues or have suggestions for improvements please contact with [me](mailto:hcaslan.ozen@gmail.com).
