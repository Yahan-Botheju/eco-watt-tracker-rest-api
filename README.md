# ⚡ Electricity Consumption System

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Build](https://img.shields.io/badge/build-passing-success)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

📌 Overview

This project is a Spring Boot REST API built using Clean Architecture principles.
It manages electricity usage data and demonstrates proper layered design, DTO mapping, and business logic handling such as carbon footprint calculation.

---

## 📌 Features

- Track daily electricity usage
- Retrieve highest consumption day
- Carbon footprint calculation
- Soft delete support
- Pagination for large datasets
- Full CRUD operations
- Clean layered architecture
- DTO + Mapper (MapStruct)

---

## 🛠️ Tech Stack

| Category    | Technology                  |
| ----------- | --------------------------- |
| Language    | Java 21                     |
| Framework   | Spring Boot                 |
| Database    | PostgreSQL / H2             |
| ORM         | Spring Data JPA             |
| Mapping     | MapStruct                   |
| Build Tool  | Maven                       |
| Boilerplate | Lombok                      |
| API Docs    | Swagger (Springdoc OpenAPI) |

---

## 🏗️ Architecture Overview

The project follows a **Clean Architecture approach:**

Controller → UseCase → Repository → Database

Layers:

- Controller Layer
  - Handles HTTP requests and responses
- UseCase Layer
  - Contains business logic (e.g., carbon footprint calculation)
- Domain Layer
  - Core business models
- Repository Layer
  - Handles data persistence (via JPA)
- Infrastructure Layer
  - Database implementation and configurations

---

🚀 Features

-  CRUD operations for electricity usage
-  Pagination support for listing usage data
-  Soft delete using Hibernate
-  Auditing (createdAt, updatedAt)
-  Clean Architecture implementation
-  DTO-based request/response handling
-  MapStruct for object mapping
-  Derived field: Carbon Footprint Calculation

---

## 📂 Project Structure

```bash
electricity-consumption-system/
├── src/
│   ├── main/
│   │   ├── java/lk/simple/electricity_consumption_system/
│   │   │   ├── domain/
│   │   │   │   ├── model/
│   │   │   │   │   └── ElectricityUsage.java
│   │   │   │   └── repository/
│   │   │   │       └── ElectricityUsageRepository.java
│   │   │   │
│   │   │   ├── usecase/
│   │   │   │   ├── ElectricityUsageUseCase.java
│   │   │   │   └── ElectricityUsageUseCaseImpl.java
│   │   │   │
│   │   │   ├── infrastructure/
│   │   │   │   ├── config/
│   │   │   │   │   └── BeanConfig.java
│   │   │   │   └── persistence/
│   │   │   │       ├── ElectricityUsageEntity.java
│   │   │   │       ├── ElectricityUsageImpl.java
│   │   │   │       └── JpaElectricityUsageRepository.java
│   │   │   │
│   │   │   ├── web/
│   │   │   │   ├── controllers/
│   │   │   │   │   └── ElectricityUsageController.java
│   │   │   │   ├── DTOs/
│   │   │   │   │   ├── ElectricityUsageRequestDTO.java
│   │   │   │   │   └── ElectricityUsageResponseDTO.java
│   │   │   │   └── mappers/
│   │   │   │       └── ElectricityUsageMapper.java
│   │   │   │
│   │   │   └── ElectricityConsumptionApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       └── example-application.properties
│   │
│   └── test/
│       └── ElectricityConsumptionApplicationTests.java
│
├── pom.xml
├── mvnw
└── mvnw.cmd
```

---

## 🧠 Structure Explanation

- **domain** → Core business models and repository interfaces
- **usecase** → Business logic and application rules
- **infrastructure** → Database layer and implementations
- **web** → Controllers, DTOs, and API layer

---

## 🚀 API Endpoints

| Method | Endpoint                            | Description                |
| ------ | ----------------------------------- | -------------------------- |
| GET    | `/api/v1/usage/all`                 | Get all usage (pagination) |
| POST   | `/api/v1/usage`                     | Create new usage           |
| PUT    | `/api/v1/usage/{id}`                | Update usage               |
| DELETE | `/api/v1/usage/{id}`                | Soft delete                |
| GET    | `/api/v1/usage/highest-consumption` | Highest usage day          |

---

## 📥 Sample Request

```json
{
	"date": "2026-04-01",
	"unitConsumed": 120,
	"category": "Household"
}
```

---

## 📤 Sample Response

```json
{
	"id": 1,
	"date": "2026-04-01",
	"unitConsumed": 120,
	"category": "Household",
	"carbonFootPrint": 54.0
}
```

---

## 🌱 Carbon Footprint Logic

```
Carbon Footprint = unitConsumed × 0.45
```

---

## ▶️ How to Run

### 1. Clone repository

```
git clone https://github.com/yahan-botheju/electricity-consumption-system.git
```

### 2. Navigate to project

```
cd electricity-consumption-system
```

### 3. Run application

```
mvn spring-boot:run
```

### 4. Access API

```
http://localhost:5000/api/v1/usage
```

---

## 📚 API Documentation

Swagger UI available at:

```
http://localhost:5000/swagger-ui.html
```

---

📌 Key Concepts Demonstrated

- Clean Architecture principles
- Separation of concerns
- Dependency inversion
- DTO pattern
- Business logic isolation
- Mapping with MapStruct

---

## 👨‍💻 Author

This project was built as part of learning & practicing modern backend development with Java & Spring Boot, focusing on writing clean,
maintainable, & scalable code.

---

## ⭐ Project Purpose

This project was built to practice:

- Clean Architecture
- REST API development
- Backend best practices

---

## 📌 Note

This is a learning project designed with **real-world architecture in mind** and can be extended into a production-ready system.
