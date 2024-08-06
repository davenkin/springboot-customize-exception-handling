package davenkin.springboot.web.helloworld;

import davenkin.springboot.web.exception.AppException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
