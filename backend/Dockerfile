# Start from OpenJDK image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy everything into the container
COPY . .

# Package the Spring Boot app using Maven
RUN ./mvnw clean package -DskipTests

# Expose the port your app runs on
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "target/neighborfit-0.0.1-SNAPSHOT.jar"]
