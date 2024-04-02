FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --form=build /target/edge-service-0.0.1-SNAPSHOT.jar edge-service.jar
EXPOSE 9191
ENTRYPOINT ["java","-jar","edge-service.jar"]
