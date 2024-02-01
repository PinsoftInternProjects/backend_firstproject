FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar FirstProject.jar
ENTRYPOINT ["java","-jar","/FirstProject.jar"]
EXPOSE 8080