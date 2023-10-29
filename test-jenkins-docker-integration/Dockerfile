FROM eclipse-temurin:8
EXPOSE 8080
ADD /target/test-jenkins-docker-integration.jar test-jenkins-docker-integration.jar
ENTRYPOINT ["java","-jar","test-jenkins-docker-integration.jar"]