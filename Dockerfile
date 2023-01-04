FROM maven:3.8.6-jdk-11
WORKDIR /Carina_demo
COPY ./src /Caridona_demo/src
COPY pom.xml /Carina_demo
RUN mvn clean test-compile
CMD mvn clean test
EXPOSE 3000