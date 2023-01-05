FROM maven:3.8.6-jdk-11
WORKDIR /Carina_demo
COPY ./src /Carina_demo/src
COPY pom.xml /Carina_demo
RUN mvn clean
ENTRYPOINT ["mvn","test","-Dsuite=${SUIT}"]
EXPOSE 3000