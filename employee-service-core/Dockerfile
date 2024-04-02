FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --form=build /target/employee-service-core-0.0.1-SNAPSHOT.jar employee-service.jar
EXPOSE 1001
ENTRYPOINT ["java","-jar","employee-service.jar"]
