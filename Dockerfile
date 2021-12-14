FROM openjdk:11
COPY demo-v1.jar /usr/src/myapp/demo.jar
WORKDIR /usr/src/myapp
ENTRYPOINT ["java","-jar","demo.jar"]