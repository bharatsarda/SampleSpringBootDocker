FROM openjdk:17
ADD target/springboot-demo-docker.jar springboot-demo-docker.jar
ENTRYPOINT ["java", "-jar", "/springboot-demo-docker.jar"]