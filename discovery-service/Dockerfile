FROM openjdk:18
VOLUME /tmp
ADD target/ap.jar ap.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/ap.jar"]
