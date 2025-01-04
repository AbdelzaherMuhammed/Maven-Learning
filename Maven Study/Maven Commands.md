###### mvn package: 
- it is a phase within the default lifecycle
- creates a jar file that contains the content of our project.
- Also the previous 2 phases (compile & test) will be executed before this phase.
- The convention of jar file is [artifact id]-[version] 

###### mvn compile:
- Maven will compile our classes.

---

#### POM Tags:
- **< groupId>:** tells us what group our project in.
- **< artifactId>:** tells us what group our project in.
- **< version>:** tells us what version our project is.
- **< packaging>**: tells us what type of artifact we would like to build (by default JAR).
- **< name>:** tells us what an inofficial name of our project.
- **< description>":** tells us what a quick description of our project.
- **< url >":** tells us what a url of our project.
- **< licences>**: provide the name and comments of our licences obtained.
- **< organization>**: provide the name and url of our organization.
- **< developers>**: provide the name and email of each developer.
- **< parent>**: inherit from a parent POM.
- **< profiles >**:  it gives us a mechanism to customize our builds depending upon the environment we are targeting.
- **< mvn -P (profile) (command) >**: it executes what's inside that certain profile.
- **< mvn archetype:generate >** generate a project.
- **< scope>:** it specifies the scope of a dependency (compile, test, import, provided, runtime, system).
	- compile: available when we build the application and also available on 
	- test: available only on test phase.
	- import: related to POMs if we need to import an external POM.
	- provided: wen we expect the dependency to be provided by something like JDK, we need it in compile & test but when deploying it, it is not required because something else will provide it example: Servlet API.
	- runtime: we only need to use this only in the runtime of the application, like database connection.
	- system: the dependency will be provided by the file system
	  
- < distributionManagement >: is used to add the environment to deploy on our project.