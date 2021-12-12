FROM openjdk:11
EXPOSE 2001

ARG JAR_FILE=target/DockerCompose_Client-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} DockerCompose_Client.jar

ENTRYPOINT ["java", "-jar", "/DockerCompose_Client.jar"]