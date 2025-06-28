FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/devops-integration-0.0.1-SNAPSHOT.jar devops-integration.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]