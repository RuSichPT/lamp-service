FROM openjdk:17-alpine
MAINTAINER Nikita Yakuntsev <yakuncev@surf.dev>

ENV JAVA_OPTS ""

COPY target/backend-*.jar /opt/app.jar

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /opt/app.jar"]