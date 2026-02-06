# Software Requirements Specification (SRS)

## 1. Introduction

### 1.1 Purpose

The purpose of this document is to define the software requirements for the **Emergency Dispatch & Routing Engine**. This system is a backend-focused application designed to simulate and optimize emergency response operations using core Data Structures and Algorithms (DSA) implemented in Java with Spring Boot.

The SRS serves as a reference for system design, development, testing, and future enhancements.

### 1.2 Scope

The system manages emergency requests, allocates limited emergency resources (such as ambulances), computes optimal routes using graph algorithms, and provides basic analytics on emergency trends.

The project is intended for learning and experimentation, with emphasis on:

* Practical implementation of DSA
* Algorithm-driven decision making
* Clean backend architecture
* GitHub-based development and version control

### 1.3 Definitions, Acronyms, and Abbreviations

* API: Application Programming Interface
* DSA: Data Structures and Algorithms
* DAG: Directed Acyclic Graph
* ETA: Estimated Time of Arrival

---

## 2. Overall Description

### 2.1 Product Perspective

The Emergency Dispatch & Routing Engine is a standalone backend system developed using Java Spring Boot. It does not depend on any external emergency infrastructure and operates using simulated data such as city maps, resources, and emergency requests.

### 2.2 Product Functions

* Register and manage emergency requests
* Prioritize emergencies based on severity and time
* Allocate nearest available emergency resources
* Compute optimal routes using graph algorithms
* Track resource availability and status
* Generate analytics on emergency patterns

### 2.3 User Classes and Characteristics

* **System Developer (User)**: Creates, configures, and tests the system using APIs and logs. Technical knowledge of Java and backend systems is assumed.

### 2.4 Operating Environment

* Backend Framework: Java Spring Boot
* Programming Language: Java
* Database: In-memory / relational (H2 / MySQL optional)
* Platform: Cross-platform (Windows, Linux)

### 2.5 Design and Implementation Constraints

* System is backend-only (no UI required)
* Focus on algorithmic efficiency over visual presentation
* Limited to single-node execution

---

## 3. System Requirements

### 3.1 Functional Requirements

#### 3.1.1 Emergency Management

* The system shall accept emergency reports with details such as location, severity, and description.
* The system shall store emergencies in a priority-based structure.

#### 3.1.2 Emergency Prioritization

* The system shall prioritize emergencies using a Priority Queue.
* Priority shall be computed based on severity, waiting time, and proximity.

#### 3.1.3 Resource Management

* The system shall maintain a list of emergency resources.
* The system shall track resource availability in real time.

#### 3.1.4 Dispatch and Allocation

* The system shall allocate the most suitable available resource to an emergency.
* Allocation shall use greedy decision-making strategies.

#### 3.1.5 Routing Engine

* The system shall represent the city as a weighted graph.
* The system shall compute optimal routes using Dijkstra’s algorithm.

#### 3.1.6 Analytics

* The system shall provide statistics on emergency frequency.
* The system shall identify high-incident zones using sliding window techniques.

---

### 3.2 Non-Functional Requirements

#### 3.2.1 Performance

* Emergency prioritization operations should execute in logarithmic time complexity.
* Route calculation should handle graphs with hundreds of nodes efficiently.

#### 3.2.2 Scalability

* The system design shall allow easy addition of new resources or locations.

#### 3.2.3 Reliability

* The system shall ensure consistent state of resources during allocation.

#### 3.2.4 Maintainability

* Code shall be modular and well-documented.
* Each major DSA component shall be isolated in its own service.

---

## 4. Data Structures and Algorithms Used

| Component                      | DSA Used               | Purpose                  |
| ------------------------------ | ---------------------- | ------------------------ |
| City Map                       | Graph (Adjacency List) | Route computation        |
| Emergency Queue                | Priority Queue (Heap)  | Emergency prioritization |
| Resource Lookup                | HashMap                | Fast access              |
| Dispatch Logic                 | Greedy Algorithms      | Optimal allocation       |
| Analytics                      | Sliding Window, Queue  | Trend detection          |
| Text Classification (Optional) | Trie                   | Emergency type detection |

---

## 5. System Architecture Overview

### 5.1 Layered Architecture

* Controller Layer: REST APIs
* Service Layer: Business logic and DSA
* Data Layer: In-memory or database storage

### 5.2 Major Modules

* Emergency Module
* Dispatch Module
* Routing Module
* Analytics Module

---

## 6. Assumptions and Dependencies

* Emergency data is simulated
* Traffic conditions are static or predefined
* System is used by a single developer

---

## 7. Future Enhancements

* Real-time traffic integration
* Machine learning based severity prediction
* Visualization dashboard
* Multi-city support

---

## 8. Conclusion

The Emergency Dispatch & Routing Engine is a DSA-driven backend system designed to provide hands-on learning through real-world problem modeling. The project emphasizes algorithmic thinking, clean architecture, and incremental development using GitHub.
