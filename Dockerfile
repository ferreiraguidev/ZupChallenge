FROM openjdk

WORKDIR /app

COPY target/zup.jar /app/zup.jar

ENTRYPOINT ["java", "-jar", "zup.jar"]