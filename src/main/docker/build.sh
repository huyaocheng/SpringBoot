
if docker ps -a | grep -i demo2; then
   docker rm -f demo2
fi

docker run --rm  -v /tmp/docker-logs:/mvnSpace -w /mvnSpace  --entrypoint mvn maven clean install

docker build -t demo2 .

docker run -t -p 8686:8686 -v /tmp/docker-logs:/app/logs  --link mysql:mysql  --name demo2 demo2

