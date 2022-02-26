# {TITLE}

This is the example repo for my blog post on [Running a Java Application on the Command Line With Maven](https://sohamkamani.com/java/cli-app-with-maven/)

To run this example:

1. Make sure you have Java, the JDK, and Maven installed
1. Clone the repo
2. Run `mvn clean compile assembly:single` - this should give you a JAR file in the `target` folder
3. Run `java -jar target/mvn-example-1.0-SNAPSHOT.jar` to run the JAR file
