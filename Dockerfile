FROM openjdk:11.0-jre
COPY target/rest-0.0.1-SNAPSHOT.jar rest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/rest-0.0.1-SNAPSHOT.jar"]
