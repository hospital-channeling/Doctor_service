# Use the AdoptOpenJDK 20 image as the base image
FROM adoptopenjdk:20

# Set the working directory
WORKDIR /app

# Copy the Maven pom.xml file
COPY pom.xml .

# Copy the source code
COPY src ./src

# Package the application
RUN ./mvnw clean package -DskipTests

# Expose the service's port
EXPOSE 8080

# Set the entry point for the application
ENTRYPOINT ["java", "-jar", "target/doctor-availability-service-0.0.1-SNAPSHOT.jar"]
