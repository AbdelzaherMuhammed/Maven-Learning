# Maven Full Tutorial - Project Repository

This repository is a companion to the **Maven Full Tutorial** video by [TechPrimers](https://www.youtube.com/watch?v=uAQs-YXnY-U). It contains examples, configurations, and notes from the tutorial, which covers everything from Maven basics to advanced topics like dependency management, plugins, and deploying web applications.

⭐️ **Video Link**: [Maven Full Tutorial](https://www.youtube.com/watch?v=uAQs-YXnY-U)  

---

## Table of Contents

1. [Course Overview](#course-overview)
2. [Building a Project](#building-a-project)
3. [Dependency Management](#dependency-management)
4. [Maven Lifecycle and Plugins](#maven-lifecycle-and-plugins)
5. [Goals and Plugins](#goals-and-plugins)
6. [Archetypes](#archetypes)
7. [Additional Features](#additional-features)
8. [M2Eclipse Plugin](#m2eclipse-plugin)
9. [Wrap Up](#wrap-up)


### **Inheritance and Profiles**
- Explored how to use inheritance in Maven to share configurations across projects.
- Configured profiles to customize builds for different environments (e.g., dev, prod).

### **Generating Projects**
- Used Maven archetypes to generate project templates quickly.

---

## Dependency Management

### **Dependencies**
- Added dependencies to the `pom.xml` and learned how Maven resolves them.

### **Transitive Dependencies**
- Understood how Maven handles transitive dependencies and avoids version conflicts.

### **Remote Repositories**
- Configured remote repositories to download dependencies.

### **Dependency Scope**
- Learned about different dependency scopes (`compile`, `test`, `provided`, etc.).

### **Conflict Resolution**
- Resolved dependency conflicts using the `dependency:tree` command.

---

## Maven Lifecycle and Plugins

### **Lifecycle and Phases**
- Explored Maven's build lifecycle and its phases (`validate`, `compile`, `test`, `package`, etc.).

### **Plugins and Goals**
- Configured plugins and executed their goals (e.g., `mvn clean`, `mvn install`).

### **Custom Plugins**
- Created custom plugins to extend Maven's functionality.

---

## Goals and Plugins

### **Clean Plugin**
- Used the `clean` plugin to remove build artifacts.

### **JAR Plugin**
- Packaged the project into a JAR file.

### **Javadoc Plugin**
- Generated project documentation using the `javadoc` plugin.

### **Install and Deploy Plugins**
- Installed the project to the local repository and deployed it to a remote repository.

### **Surefire Plugin**
- Ran unit tests using the `surefire` plugin.

### **Eclipse Plugin**
- Generated Eclipse project files using the `eclipse` plugin.

### **WAR Plugin**
- Packaged a web application into a WAR file.

---

## Archetypes

### **Power of Archetypes**
- Learned how archetypes simplify project creation by providing templates.

### **Building an Archetype**
- Created a custom archetype for reusable project structures.

### **Multi-Module Projects**
- Built a multi-module project to manage complex applications.

---

## Additional Features

### **Tomcat Installation**
- Installed Apache Tomcat and configured it for web application deployment.

### **Deploying Web Applications**
- Deployed a Maven-based web application to Tomcat using the `tomcat7-maven-plugin`.

### **Encrypting Passwords**
- Secured sensitive information by encrypting passwords in `settings.xml`.

### **Properties**
- Used properties in the `pom.xml` for reusable values.

### **Debugging**
- Debugged Maven builds by enabling verbose logging.

---

## M2Eclipse Plugin

### **Creating a Project with M2E**
- Created a Maven project directly in Eclipse using the M2E plugin.

### **Dependency Management**
- Managed dependencies in Eclipse using the M2E plugin.

### **Phases and Goals**
- Executed Maven phases and goals from within Eclipse.

### **Plugins**
- Configured and used Maven plugins in Eclipse.

---

## How to Use This Repository

1. **Clone the Repository**:
 ```bash
https://github.com/AbdelzaherMuhammed/Maven-Learning/