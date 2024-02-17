FROM atjapan2015/graalvm-ce-java17
VOLUME /tmp
ADD spring-boot-docker-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c touch /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]