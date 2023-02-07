FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY --from=build /home/app/target/war_name.war app.war
ENTRYPOINT ["java","-jar","/app.jar"]
