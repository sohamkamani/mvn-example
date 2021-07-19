# Maven Example Application

This is the example repo for my blog post on [Running a Java Application on the Command Line With Maven](https://sohamkamani.com/java/cli-app-with-maven/)

To run this exampe:

1. Make sure you have Java, the JDK, and Maven installed
1. Clone the repo
1. Run `mvn clean compile package` - this should give you a JAR file in the `target` folder
1. Run `java -jar target/mvn-example-1.0-SNAPSHOT.jar` to run the JAR file
