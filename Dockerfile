FROM openjdk:16 as base
WORKDIR /opt/hello-final
COPY ./ ./
RUN ./gradlew assemble

FROM adoptopenjdk/openjdk16:alpine-jre
WORKDIR /opt/hello-final
COPY --from=base /opt/hello-final/build/libs/hello-final-0.0.1-SNAPSHOT.jar ./
CMD java -jar hello-final-0.0.1-SNAPSHOT.jar