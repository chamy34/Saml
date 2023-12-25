FROM openjdk:18
VOLUME /tmp
ADD target/gateway.jar gateway.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/gateway.jar"]