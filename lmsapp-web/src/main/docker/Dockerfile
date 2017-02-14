FROM java:8
VOLUME /tmp
ADD lmsapp-web-0.0.1-SNAPSHOT.jar app.jar
ADD setenv.sh setenv.sh
ADD setenv2.sh setenv2.sh
CMD ./setenv.sh
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]