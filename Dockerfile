FROM openjdk:8-jdk-alpine

EXPOSE 8080

COPY target/authorizationServiceBoot-0.0.1-SNAPSHOT.jar myapp.jar