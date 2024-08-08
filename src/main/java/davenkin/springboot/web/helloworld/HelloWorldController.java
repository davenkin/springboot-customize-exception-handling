package davenkin.springboot.web.helloworld;

import davenkin.springboot.web.exception.AppException;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.Map;

import static davenkin.springboot.web.exception.ErrorType.USER_NOT_FOUND;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello-world")
    public Map<String, String> helloWorld() {
        return Map.of("value", "Hello World!");
    }

    @GetMapping(value = "/app-exception")
    public void throwAppException() {
        throw new AppException(USER_NOT_FOUND, "User not found.", "userId", "12345");
    }

    @GetMapping(value = "/runtime-exception")
    public void throwRuntimeException() {
        throw new RuntimeException("Runtime exception.");
    }

    @GetMapping(value = "/response-status-exception")
    public void throwResponseStatusException() {
        throw new ResponseStatusException("Response status exception.");
    }

    @GetMapping(value = "/springmvc-exception")
    public void throwSpringMvcException() throws NoResourceFoundException {
        throw new NoResourceFoundException(HttpMethod.GET, "/springmvc-exception");
    }

}
