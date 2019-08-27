# 'World' word microservice

Its purpose is to return 'World' word by http api:
```bash
mvn clean package
java -jar target/world-microservice-fat.jar
# using another terminal window
curl http://localhost:8080/ # World
```

## How to customize port
Edit src/conf/config.json
```json
{
	"type": "file",
	"format": "json",
	"scanPeriod": 5000,
	"config": {
		"path": "/path/to/worldmicroservice/src/conf/config.json"
	},
	"serverPort": 8082,
  	"serverHost": "0.0.0.0"
}
```
Run using config.json
```bash
java -jar target/world-microservice-fat.jar -conf src/conf/config.json
```