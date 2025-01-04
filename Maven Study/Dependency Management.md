- It means pulling in different libraries that we need for our project from a repository.
- Repository can be located on our machine or remotely.
---
###### Transitive Dependencies
- One of the best features of Maven it's capable of downloading transitive dependencies.
- Transitive dependency is a dependency of one of our dependencies.
- Example: Spring Framework in order to download it we need to download all other libraries come with Spring, manually we should pull all the spring jars and then all of the other jars that it depends on.
- Using maven dependency management all of that work is performed.
- When using Junit as a dependency, it has a hamcrest dependency inside it, so when including junit it automatically downloads hamcrest out of the box.
- There's no level form the transitive dependency, as we can have infinite levels of dependencies example: if  hamcrest has it's dependency then Maven will pull it down and so on.
---
###### Remote Repository
- In order to use a dependency like Junit we need to download it from the central repository, in this case maven repository, so what if we need to use an oracle repository that need authentication in order to work, then we can edit the settings.xml profile to override the default url.
- to do that we need to use < profile > then < id> then < url > to include the url.
- also we need to activate this profile using < activeProfile > and specify the < id>.
---
###### Dependency Scope
- Tells us when a dependency available during maven lifecycle.
- every scope has a default scope which is **compile**.
- the **compile** scope says that scopes are available on all classes path when we build the application and also available on runtime.
- **compile** scope is available during the build, test and run phases of our project.