ps -ef | grep -v 'grep' | grep 'app.jar' | awk '{print $2}'| xargs kill -9

if docker ps -a | grep -i demo2; then
   docker rm -f demo2
fi

docker run --rm \ -v /tmp/docker-logs:/mvnSpace -w /mvnSpace  --entrypoint mvn maven clean install

docker build -t demo2 /home/testhu

docker run -d -p 8686:8686 -v /tmp/docker-logs:/app/logs  --link mysql:mysql  --name demo2 demo2

tail -f /tmp/docker-logs/springboot-docker-demo.log