FROM openjdk:11-jdk as build
VOLUME /tmp
ADD ugemang-lotto-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c touch /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]