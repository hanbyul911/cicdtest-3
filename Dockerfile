FROM eclipse-temurin:17-jre-alpine
COPY ./build/libs/*-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]