FROM openjdk:11-jdk as build
VOLUME /tmp
ADD lotto-0.0.1-SNAPSHOT.jar app.jar
RUN touch /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]


