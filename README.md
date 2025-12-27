# 🚆 Yatra.io | The Next-Gen Railway Booking Engine

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![JSON](https://img.shields.io/badge/JSON-Persistence-black?style=for-the-badge&logo=json&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

> **"Seamlessly connecting travelers to destinations with a robust, persistent backend core."**

---

## 📖 Table of Contents
- [About the Project](#-about-the-project)
- [Key Features](#-key-features)
- [System Architecture](#-system-architecture)
- [Tech Stack](#-tech-stack)
- [Getting Started](#-getting-started)
- [Project Structure](#-project-structure)
- [Future Roadmap](#-future-roadmap)
- [Contact](#-contact)

---

## 💡 About the Project

**Yatra.io** is a high-performance, console-based railway reservation system built to simulate the core backend logic of major booking platforms like IRCTC. 

Unlike simple student projects that lose data when the program closes, **Yatra.io features a persistent local database system**. It leverages **Service-Oriented Architecture (SOA)** to ensure clean separation between the user interface, business logic, and data storage layers.

---

## 🚀 Key Features

* **🔐 Secure Authentication:** User sign-up and login with hashed password security.
* **💾 Data Persistence:** Custom JSON-based local database ensures user and booking data survives application restarts.
* **🔎 Smart Search:** Dynamic train search functionality between source and destination stations.
* **🎫 Live Booking:** Real-time seat availability checking and booking confirmation.
* **⚡ Concurrency Handling:** (Optional: Mention if you added thread safety) Built to handle sequential user requests efficiently.

---

## 🏗 System Architecture

The application follows a modular **Service-Oriented Architecture**:

1.  **Presentation Layer (`App.java`):** Handles CLI inputs and menu navigation.
2.  **Service Layer (`UserBookingService`):** Contains core business logic (validations, booking algorithms).
3.  **Data Layer (`localDb/*.json`):** Acts as a NoSQL-style document store.
4.  **Entity Layer (`Train`, `User`, `Ticket`):** POJOs that map JSON data to Java Objects.

**Data Flow:**
`User Input` -> `Controller` -> `Service` -> `Jackson Parser` -> `JSON Database`

---

## 🛠 Tech Stack

* **Core Language:** Java 17 (OpenJDK)
* **Build System:** Gradle
* **Serialization:** Jackson Databind (for JSON parsing)
* **Boilerplate Reduction:** Lombok (Annotations)
* **Version Control:** Git & GitHub

---

## ⚡ Getting Started

### Prerequisites
* Java JDK 17 or newer
* Git installed

### Installation

1.  **Clone the Repository**
    ```bash
    git clone [https://github.com/hemant2725/yatra.io.ticket-booking.git](https://github.com/hemant2725/yatra.io.ticket-booking.git)
    cd yatra.io.ticket-booking
    ```

2.  **Build the Project**
    ```bash
    ./gradlew build
    ```

3.  **Run the Application**
    ```bash
    ./gradlew run
    ```
    *(Or run the `App.java` file directly via IntelliJ/Eclipse)*

---

## 📂 Project Structure

```text
src/main/java/ticket/booking/
├── 📄 App.java                 // Main Entry Point
├── 📂 entities/                // Data Models (User, Train, Ticket)
├── 📂 services/                // Business Logic (Booking, Search)
├── 📂 util/                    // Helpers (Password Hashing)
└── 📂 localDb/                 // Local Database (JSON Files)
