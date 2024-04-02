FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --form=build /target/department-service-core-0.0.1-SNAPSHOT.jar department-service.jar
EXPOSE 1002
ENTRYPOINT ["java","-jar","department-service.jar"]
