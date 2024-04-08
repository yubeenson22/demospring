FROM tomcat:10.1.20-jdk17-temurin-jammy

#LABEL org.opencontainers.image.authors="edowon0623@gmail.com"

COPY ./demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps