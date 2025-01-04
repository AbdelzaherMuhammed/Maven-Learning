it is all the components that makes up the Maven application.
###### Project Object Model (POM):
- **Describes, configures and customizes the Maven Project**: it's going to spell out the different dependencies, plugins and the different profiles that we use to construct our project
- Maven reads the **pom.xml** to build a project.
- **Defines the address for the project artifact using coordinate system**: artifact id, group id and version number.

---
###### Repositories:
a collection of artifacts or dependencies that can be local or remote.
- **Holds all of our artifacts and dependencies of various types**: artifacts can be things such as plugins they can be jar files that we have built or archetypes.
There're several types of repositories such as:
- **Local repositories**: (Local Cache) like when you pull a dependency from a remote repository then maven pulls it for you in m2 folder
- **Remote Repository:** Like the internet of some place we have access on it on the internet.
- Local repository is going to take precedence over the remote repository when we try to download a dependency.

---

###### Plugins and Goals:
- Plugin is a collection of Goals. 
- Example: Compiler Plugin acts as a class that can run src and can run test.
- Goals acts as methods or actions that we execute to perform Maven builds.
- All Work is done using plugins and goals in Maven
- Called independently or as a part during Maven life cycle.

---

###### Lifecycle and Phases
- Lifecycle is a sequence of named phases (eg. compile, test, install, deploy).
- Maven has 3 lifecycles: clean, default, site.
- Executing a phase, executes all the previous phases.

---
###### Technical Overview:
![[Pasted image 20241228043358.png]]

- once running the command (mvn install) maven reads the file (pom.xml) to learn about our project and what we need to perform a build.
- Some of the important things that maven inspects is the project information (the address of the project) which is the artifact.
- Also looks at dependencies (libraries that the application may refer to.) and plugins (actions that are going to occur to build this artifact).
- then it goes to download (pull in) the dependencies and our plugins either on a remote repository or a local repository.
- and because we are using (mvn install) then it will execute every phase before that install phase.
 
---
