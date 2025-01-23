FROM eclipse-temurin:19 as build
RUN apt-get update && apt-get install -y maven
WORKDIR /app
COPY gh-actions-1/pom.xml .
COPY gh-actions-1/src ./src
RUN mvn clean package

FROM eclipse-temurin:19
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]