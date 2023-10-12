#starts with a base image containing java runtime
FROM openjdk:17-jdk-slim
#Information arounf who maintains the image
MAINTAINER mrinalgupta
#copy new files or directories from and adds them to the filesystem of the container at the path.
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
#Allow you to configure a container that will run as an executable
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]