FROM openjdk:jdk
WORKDIR /appcontainer
EXPOSE 9198
COPY ./target/api-gateway-ms.jar /appcontainer
ADD ./target/api-gateway-ms.jar api-gateway-ms.jar
ENTRYPOINT ["java","-jar","api-gateway-ms.jar"]