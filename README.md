# lets-play
# 🌟 Spring Boot MongoDB Microservices CRUD API

This project is a microservices-based RESTful CRUD API built with Spring Boot and MongoDB, focusing on user and product management with centralized authentication and authorization.

## 🏗️ Architecture Overview

Our application is composed of the following microservices:

1. 🔐 Auth Service: Handles authentication and authorization
2. 👤 User Service: Manages user-related operations
3. 🛍️ Product Service: Manages product-related operations
4. 🌉 API Gateway: Entry point for all client requests, handles routing and load balancing

## ✨ Features

- 🔀 Microservices Architecture
- 🌐 RESTful API design
- 👤 User Management (CRUD operations)
- 🛍️ Product Management (CRUD operations)
- 🔐 Centralized Authentication Service
- 🔑 Role-based Authorization (Admin and User roles)
- 🗄️ MongoDB database for each service
- 🔒 Password hashing and salting
- 🛡️ Input validation and security measures

## 🛠️ Technology Stack

- ☕ Java
- 🍃 Spring Boot
- 🔒 Spring Security
- 🍃 Spring Cloud (for microservices communication)
- 🚪 Spring Cloud Gateway
- 🍃 MongoDB
- 🏗️ Maven

## 🔗 API Endpoints

All requests go through the API Gateway (`http://localhost:8080`)

### 🔐 Auth Service

- `POST /auth/login`: User login
- `POST /auth/logout`: User logout

### 👤 User Service

- `POST /users`: Create a new user
- `GET /users`: Get all users (Admin only)
- `GET /users/{id}`: Get a specific user
- `PUT /users/{id}`: Update a user
- `DELETE /users/{id}`: Delete a user

### 🛍️ Product Service

- `POST /products`: Create a new product
- `GET /products`: Get all products (No authentication required)
- `GET /products/{id}`: Get a specific product
- `PUT /products/{id}`: Update a product
- `DELETE /products/{id}`: Delete a product

## 🚀 Setup and Installation

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/spring-boot-mongodb-microservices-api.git
   ```

2. Navigate to the project directory:
   ```
   cd spring-boot-mongodb-microservices-api
   ```

3. Install dependencies for each service:
   ```
   mvn clean install -DskipTests
   ```

4. Set up MongoDB:
   - Install MongoDB if you haven't already
   - Create separate databases for each service
   - Update the `application.properties` file in each service with the corresponding MongoDB connection details

5. Run the services:
   ```
   mvn spring-boot:run -pl auth-service,user-service,product-service,api-gateway
   ```

The API Gateway will be available at `http://localhost:8080`.

## 🛡️ Security Measures

- 🔒 Passwords are hashed and salted before storing in the database
- 🛡️ Input validation is implemented to prevent MongoDB injection attacks
- 🔐 Sensitive user information is protected and not returned in API responses
- 🔒 HTTPS is used to protect data in transit
- 🎫 JWT tokens are used for maintaining user sessions across microservices

## 🔀 Inter-Service Communication

- 🚌 Services communicate with each other using REST API calls
- 🔍 Service discovery is handled by Eureka Server
- 🔀 Load balancing is managed by Spring Cloud LoadBalancer

## ⚠️ Error Handling

Each microservice is designed to handle exceptions gracefully and return appropriate HTTP status codes and error messages. The API Gateway provides an additional layer of error handling and response normalization.

## 🔍 Monitoring and Logging

- 📊 Distributed tracing is implemented using Spring Cloud Sleuth and Zipkin
- 📈 Metrics are collected using Micrometer and visualized with Prometheus and Grafana

## 🧪 Testing

Each microservice has its own set of unit and integration tests. Additionally, end-to-end tests are implemented to ensure the correct functioning of the entire system.

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
