FROM openjdk:23-slim
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=courier.quest/build/libs/courier.quest-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} quests.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/quests.jar"]