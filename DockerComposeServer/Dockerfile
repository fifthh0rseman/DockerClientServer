FROM openjdk:11

EXPOSE 2002
ARG JAR_FILE=target/DockerCompose_Server-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} DockerCompose_Server.jar

ENTRYPOINT ["java", "-jar","/DockerCompose_Server.jar"]