FROM maven:3.8.6-jdk-11
RUN mkdir /Carina-demo
WORKDIR /Carina-demo
COPY /src /Carina-demo/src
COPY pom.xml /Carina-demo
CMD mvn test -Dsuite=${SUITE_NAME}
EXPOSE 8080