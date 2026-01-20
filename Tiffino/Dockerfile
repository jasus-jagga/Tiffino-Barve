# Step 1: Build JAR with Maven
FROM maven:3.9.4-eclipse-temurin-17 AS build

WORKDIR /app

# Copy Maven files
COPY pom.xml mvnw ./
COPY .mvn .mvn

# Copy source code
COPY src ./src

# Make mvnw executable
RUN chmod +x mvnw

# Build project, skipping tests
RUN ./mvnw clean package -DskipTests

# Step 2: Run JAR with lightweight JDK
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy built JAR
COPY --from=build /app/target/*.jar app.jar

# Expose port
EXPOSE 9090

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]

