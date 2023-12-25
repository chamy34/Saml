FROM openjdk:18
VOLUME /tmp
ADD target/config.jar config.jar
EXPOSE 9999
ENTRYPOINT ["java","-jar","/config.jar"]