FROM openjdk:8
MAINTAINER SrinivasReddyKotla ksrinivasreddy4444@gmail.com
COPY ./target/calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]