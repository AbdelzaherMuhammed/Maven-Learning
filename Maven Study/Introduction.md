## **Introduction**:

- Maven is a build automation tool it emphasis **convention over configuration** and it delivers **dependency management** that revolutionized how we build our project.
- it is created from the **Apache Software foundation**. 
- **Dependency Management Tool:** one of the favorite features for many Maven Users, Maven changed the way we obtained 3rd party libraries (e.g:Spring, Hibernate) and the way we manage them.  
- **Project Management Tool:** Allows us to include some information about the software we are building, such as version, developers, etc.
- **Standardized approach to build software:** if we are working on different projects, it makes you feel the consistency of these projects.
- **IDE Integration**
- **Command Line Tool**

---
###### Build Tools
What build tools do exactly ? is it to make deployable jars like wart, jar ? actually no.
- Create deployable artifacts from source code.\
- Automated/repeatable builds.
- Deploying artifacts on servers.
- IDE dependence.
- Integration with other build tools (e.g Hudson, bamboo).

---

###### Dependency Management
One of the most popular aspects in Maven.
- **Download project dependencies from central repository**: like pulling a framework like Spring From the internet.
- **Automatically resolve the libraries required by project dependencies:** like spring it requires another dependencies in it's POM.xml so Maven will  reach out and pull these dependencies out of the box.
- **Dependency Scooping**: Controls when to use the dependency like I want to use this dependency on just test server.

---

###### Project Management:
- **Artifact Versioning**
- **Change logs**
- **Documentation**
- **Javadocs**
- **Reports**
