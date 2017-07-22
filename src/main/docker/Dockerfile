FROM java:8
# time zone
RUN echo "Asia/Chongqing" > /etc/timezone && dpkg-reconfigure -f noninteractive tzdata
RUN mkdir /app
RUN mkdir /app/logs
ADD demo-0.0.1-SNAPSHOT.jar /app/app.jar
RUN bash -c 'touch /app/app.jar'
WORKDIR /app
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]

