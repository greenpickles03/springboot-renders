FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --form=build /target/config-server-0.0.1-SNAPSHOT.jar config-server.jar
EXPOSE 8040
ENTRYPOINT ["java","-jar","config-server.jar"]
