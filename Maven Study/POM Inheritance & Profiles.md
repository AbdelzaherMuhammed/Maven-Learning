- Same analogy of Java Inheritance as the sub-class inherits the properties and methods from the super class.
- So accordingly, we can inherit some of the configuration from the parent POM.
- To inherit from a parent POM we need to add < parent > tag to inherit.

---

### Profiles
- When Creating a project we want that build to be portable alongside other environments (development - production) and we need to adjust our configuration in order to deploy to these environments.
- Maven Profiles allow us to build our projects for those different environments.
- within the < profiles> tag we can edit most of the normal tags from the application.
- When running any command like install or package it goes to the default behavior, but when specifying a certain profile, then it executes what's inside that profile.