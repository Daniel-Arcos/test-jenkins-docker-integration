
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM openjdk:8-jre-alpine3.9
EXPOSE 8080
ADD target/test-jenkins-docker-integration.jar test-jenkins-docker-integration.jar
ENTRYPOINT ["java", "-jar", "/test-jenkins-docker-integration.jar"]
