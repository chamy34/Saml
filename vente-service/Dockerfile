FROM openjdk:18
VOLUME /tmp
ADD target/vente.jar vente.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","/vente.jar"]