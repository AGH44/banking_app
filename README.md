
# **Banking System**

A REST API application for managing a simple banking system, developed using Spring Boot, Spring Data JPA (Hibernate), and a MySQL database.  
This project includes basic functionalities:
- Creating a bank account
- Fetching account details
- Performing deposit and withdrawal operations

---

## **Table of Contents**

1. [About](#about)  
2. [Getting Started](#getting-started)  
   - [Prerequisites](#prerequisites)  
   - [Installation](#installation)  
3. [Usage](#usage)  

---

## **About**

This project demonstrates how to build REST APIs for a simple Banking application using **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
It covers essential functionalities like account creation, fetching account details, and handling transactions such as deposits and withdrawals.

---

## **Getting Started**

### **Prerequisites**
Before running the project, ensure you have the following installed:  
- **Java 17** or higher  
- **MySQL Database**  
- **Maven** (or **Gradle**, depending on your choice of build tool)  
- An IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code  

Dependencies used in the project:
- **Spring Web**
- **Spring Data JPA**
- **MySQL Driver**
- **Lombok**

---

### **Installation**

1. **Clone the repository**  
   Open your terminal and run:  
   ```bash
   git clone https://github.com/AGH44/banking_app.git
   cd banking_app
   ```

2. **Configure the MySQL database**  
   Update the `application.properties` file with your MySQL credentials:  
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/banking_app
   spring.datasource.username=root
   spring.datasource.password=your_password_here
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Import the project**  
   - Open your favorite IDE.  
   - Import the project as a **Maven** or **Gradle** project.

4. **Build and run the project**  
   Use the terminal or IDE's build tool to start the application:  
   ```bash
   mvn spring-boot:run
   ```

---

## **Usage**

### Endpoints
Below are the core endpoints you can use with the Banking System API:

- **Create a Bank Account**:  
  `POST /api/accounts`  
  Request Body Example:  
  ```json
  {
    "accountHolderName": "Test Name",
    "initialDeposit": 500
  }
  ```

- **Get Account Details**:  
  `GET /api/accounts/{accountId}`  

- **Deposit Money**:  
  `POST /api/accounts/{accountId}/deposit`  
  Request Body Example:  
  ```json
  {
    "amount": 200
  }
  ```

- **Withdraw Money**:  
  `POST /api/accounts/{accountId}/withdraw`  
  Request Body Example:  
  ```json
  {
    "amount": 100
  }
  ```

---

