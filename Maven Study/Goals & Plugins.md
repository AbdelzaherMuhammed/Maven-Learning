	In this chapter we are focusing on plugins and how to configure them and see how they work.

###### Clean Plugin
- It Just Cleans the **target** directory, it is used when we need a new build as it is the first step to be executed.
- it has only one goal which is clean (mvn clean:clean).
---
###### JAR Plugin
- We use it to build a jar file from our current project.
- It is created when using package phase.
- there's a plugin named jar that uses a goal jar (mvn jar:jar) creates a jar file from our project.
---
###### Javadoc
- is used to describe the API. it is useful if you are working on a library that other people use.
- 