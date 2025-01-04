- **Lifecycle:** Consists of a set of steps or stages that we go through as we build our artifact (referred as **phases**).
- Each phase has goals, and goals are methods that executes somethings
- There are 3 lifecycles  default, clean, site.
- We can use more than phase in the same command like (mvn clean install)
- **clean phase:** it executes the clean (remove the target directory) and every phase before it.

---
###### Lifecycle Phases

![[Pasted image 20241231074904.png]]

- **Compile:** Compile the source code of the project. and convert our java files into class files to be executed via the JVM.
- **Test-Compile:** Similar to **Compile** phase, Compiles the test source code into the test destination directory. 
- **Test:** is used When we run our particular unit test. by default maven stops the build if any of the tests fails, but it can be ignored or turned off.
- **Package:** Take the compiled code and package it in it's distribute format, such as JAR, WAR, EARS.
- **Deploy:** Done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects. **(When deploying our project)**
 ---
###### Plugins and Goals
- Goals perform tasks and those tasks are ran against our project in order for something to happen. we can say that it is equivalent to methods in a class.
- Plugins are comprised of a number of goals also we can say that it is equivalent a class.
- any plugin has some goals to perform like compiler plugin it has 3 goals (compiler:compile, compiler:testCompile, compiler:help) each one of them perform a specific functionality like a method in class.
 ---
 
###### MAVEN Custom Plugins
- Sometimes We
 
 