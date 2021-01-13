FROM openjdk:11-jdk-slim
VOLUME /tmp
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} spring-boot-ms-template.jar
ENTRYPOINT ["java","-jar","/spring-boot-ms-template.jar"]