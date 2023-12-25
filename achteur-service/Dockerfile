FROM openjdk:18
VOLUME /tmp
ADD target/achteur.jar achteur.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/achteur.jar"]