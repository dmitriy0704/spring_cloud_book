```shell
gradle build
```

```shell
docker build -t docker-gradle-image . 
```
```shell
docker run -i -t -p 8080:8080 --name docker-gradle-cont docker-gradle-image
```