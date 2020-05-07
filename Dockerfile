# Start with a base image containing Java runtime
FROM openjdk:8
# Add Maintainer Info
LABEL maintainer="github.com/sarthak-sh18"
# Make port 8080 available to the world outside this container
EXPOSE 8081
# Add the application's jar to the container
ADD /target/devops_calc-1.0-SNAPSHOT.jar devops_calc-1.0-SNAPSHOT.jar
# Run the jar file
ENTRYPOINT ["java","-cp","devops_calc-1.0-SNAPSHOT.jar","Calculator"]
