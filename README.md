[![Build Status](https://travis-ci.org/KNIGHTMASTER/spring-cloud-config-example.svg)](https://travis-ci.org/KNIGHTMASTER/spring-cloud-config-example)

# spring-cloud-config-example
Example Spring Application Integrated With Spring Cloud Config to Centralize Configuration

Configuration variables will be put inside config directory.
We can reload configuration from server (at runtime) without restarting client application. Because there is reload configuration on annotation `@RefreshScope`

### Client
Client running on port 8081

### Server
Server running on port 8082

### Configuration
URL [http://localhost:8082/master/development](http://localhost:8082/master/development) will show configurations that is committed to github repository

### Reload Configuration
curl -X POST 'http://localhost:8082/refresh' without any body