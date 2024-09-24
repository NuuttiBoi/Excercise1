
FROM maven:latest

LABEL authors="Nuuttiboi"

WORKDIR /app

COPY pom.xml /app/

COPY . /app/

RUN mvn package

CMD ["java", "-jar", "target/calculator.jar"]
