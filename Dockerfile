FROM openjdk:11
COPY demo-0.0.1-SNAPSHOT.jar /usr/src/myapp/demo-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src/myapp
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]