FROM maven:3.9.6-eclipse-temurin-21 As build
LABEL authors="nurhana"

WORKDIR /app

COPY pom.xml .

COPY . /app

RUN mvn package

CMD ["java", "-jar", "target/otp2.jar"]