FROM openjdk:17
COPY target/*.jar /app
WORKDIR /app
CMD java -jar *.jar