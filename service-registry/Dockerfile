FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --form=build /target/service-registry-0.0.1-SNAPSHOT.jar service-registry.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","service-registry.jar"]
