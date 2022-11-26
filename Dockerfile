FROM openjdk:17
RUN mkdir /app
COPY target/classes/ /app
WORKDIR /app
CMD java ie.atu.DummyData