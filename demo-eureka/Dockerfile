FROM openjdk:21
VOLUME /tmp
EXPOSE 8761
ADD ./target/demo-eureka-0.0.1-SNAPSHOT.jar demo-eureka.jar
ENTRYPOINT ["java","-jar","/demo-eureka.jar"]