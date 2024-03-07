# For eclipse-temurin:<version>-alpine Java 17, try this
FROM eclipse-temurin:17-alpine

#
ARG JAR_FILE=/build/libs/webapp-0.0.1-SNAPSHOT.jar

#
WORKDIR /app

#
COPY ${JAR_FILE} app.jar

#
ENTRYPOINT ["java","-jar","app.jar"]