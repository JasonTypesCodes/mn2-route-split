FROM openjdk:14-alpine
COPY build/libs/mn2-route-split-*-all.jar mn2-route-split.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "mn2-route-split.jar"]
