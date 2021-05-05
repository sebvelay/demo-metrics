This is a dummy example to show how to add metrics on a spring-boot project

# 1 - Add Actuator

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
``` 

```xml
<dependency>
    <groupId>io.micrometer</groupId>
    <artifactId>micrometer-registry-prometheus</artifactId>
</dependency>
```

# 2 - Add configuration

```yaml
management:
  endpoint:
    prometheus:
      enabled: true
  endpoints:
    web:
      exposure:
        include:
          - prometheus
          - info
          - health
          - metrics
  metrics:
    distribution:
      percentiles-histogram:
        http:
          server:
            requests: true
```

# 3 - Access to :

http://localhost:8082/actuator/prometheus

(usually we prefer to have a different management port)