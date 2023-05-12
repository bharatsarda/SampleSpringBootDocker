FROM openjdk:17
ADD target/SpringBootDemoDocker.jar SpringBootDemoDocker.jar
ENTRYPOINT ["java", "-jar", "/SpringBootDemoDocker.jar"]