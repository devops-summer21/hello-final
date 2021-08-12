FROM openjdk:11 as base
WORKDIR /opt/hello-final
COPY ./ ./
RUN ./gradlew assemble

FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
WORKDIR /opt/hello-final
COPY --from=base /opt/hello-final/build/libs/hello-final-0.0.1-SNAPSHOT.jar ./
CMD java -jar hello-final-0.0.1-SNAPSHOT.jar