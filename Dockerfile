FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --form=build /service-registry/target/service-registry-0.0.1-SNAPSHOT.jar service-registry.jar
COPY --form=build /edge-service/target/edge-service-0.0.1-SNAPSHOT.jar edge-service.jar
COPY --from=build /config-server/target/config-server-0.0.1-SNAPSHOT.jar config-server.jar
COPY --form=build /department-service-core/target/department-service-core-0.0.1-SNAPSHOT.jar department-service.jar
COPY --form=build /employee-service-core/target/employee-service-core-0.0.1-SNAPSHOT.jar employee-service.jar
EXPOSE 9191
ENTRYPOINT ["java","-jar","service-registry.jar","edge-service.jar","config-server.jar","department-service.jar","employee-service.jar"]
