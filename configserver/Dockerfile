FROM eclipse-temurin:17-jre
EXPOSE 8080
WORKDIR /opt/app
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar", "app.jar"]