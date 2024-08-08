### Introduction

- This is a sample project for customizing Spring Boot exception handling and error responses.

### How to run

- `./mvnw spring-boot:run` and open `http://localhost:8080/hello-world`, or run `main()` in `SpringbootWebApplication`
  in IDE directly
- Visit the following URLs for different types of exceptions and how they are rendered:
    - [http://localhost:8080/app-exception](http://localhost:8080/app-exception): Rendered by GlobalExceptionHandler
    - [http://localhost:8080/runtime-exception](http://localhost:8080/runtime-exception): Rendered by RestErrorController
    - [http://localhost:8080/response-status-exception](http://localhost:8080/response-status-exception): Rendered by RestErrorController
    - [http://localhost:8080/springmvc-exception](http://localhost:8080/springmvc-exception): Rendered by RestErrorController

### Tech stack

- Spring Boot 3.3.2