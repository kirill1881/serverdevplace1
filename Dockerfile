FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY mvnw pom.xml ./
ENTRYPOINT ["java","-jar","com/example/serverdevplace/0.0.1-SNAPSHOT/serverdevplace-0.0.1-SNAPSHOT.jar"]

