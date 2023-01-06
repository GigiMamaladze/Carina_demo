FROM maven:3.8.6-jdk-11
WORKDIR /Carina_demo
COPY ./src /Carina_demo/src
COPY pom.xml /Carina_demo
COPY commands.sh /Carina_demo
RUN rm -rf /Users/gigimamaladze/target
ENTRYPOINT ["sh","commands.sh"]
EXPOSE 3000