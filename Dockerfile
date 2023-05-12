FROM openjdk:17
ADD target/github-actions.jar github-actions.jar
ENTRYPOINT ["java", "-jar", "/github-actions.jar"]