FROM eclipse-temurin:17-jre
EXPOSE 8071
WORKDIR /opt/app
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar", "app.jar"]