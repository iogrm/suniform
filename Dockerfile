FROM openjdk:8-jre-slim

WORKDIR /app

COPY . /app

RUN apt-get update && \
    apt-get install -y scala

RUN scalac Hello.scala

CMD ["java", "-cp", "target/scala-2.12/*.jar:scala-library-2.12.2.jar", "Runner"]
