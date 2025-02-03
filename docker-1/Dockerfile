FROM eclipse-temurin:17
ARG DEFAULT_PORT 8080
WORKDIR /app
COPY target/*.jar app.jar
ENV PORT $DEFAULT_PORT
EXPOSE $PORT
CMD ["java", "-jar", "app.jar"]