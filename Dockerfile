FROM openjdk:8-jdk-alpine
#за основу взята 8я версия java

# Install prerequisites
RUN apk add --update \
    curl \
    && rm -rf /var/cache/apk/*

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
