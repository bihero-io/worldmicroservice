# 'World' word microservice

Its purpose is to return 'World' word by http api:
```bash
mvn clean package
java -jar target/world-microservice-fat.jar
# using another terminal window
curl http://localhost:8080/ # World
```