# Jenkins CI/CD Pipeline – DevOps Project

## Overview
This repository demonstrates the implementation of a **CI/CD pipeline using Jenkins**, integrated with **GitHub** and **Maven**, as part of a DevOps training program.

The project covers Jenkins practical work from **TP2 to TP4**, focusing on **automation, continuous integration, and code quality checks**.

---

##  Technologies & Tools
- Jenkins
- GitHub & Git
- Jenkins Declarative Pipeline
- Java / Maven
- GitHub Webhooks
-  SonarQube – Code Quality Analysis

---

##  CI Pipeline Description
The CI pipeline is defined using a **Jenkinsfile** stored in the GitHub repository.

### Pipeline stages:
1. **Checkout**
   - Source code is pulled automatically from GitHub

2. **Build**
   - Project is built using Maven

3. **Test**
   - Automated unit tests execution

4. **Code Quality (TP3 / TP4)**
   - Static code analysis (SonarQube)
   - Detection of bugs, vulnerabilities, and code smells

---

##  Automation
- Jenkins is connected to GitHub via **Webhook**
- Every `git push` automatically triggers the pipeline
- Immediate feedback on build, tests, and quality status

---

##  Project Structure
.
├── Jenkinsfile
├── pom.xml
├── src/
│ ├── main/
│ └── test/
└── README.md
