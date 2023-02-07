FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY mvnw pom.xml ./
ENTRYPOINT ["java","-jar","/app.jar"]
