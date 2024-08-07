package davenkin.springboot.web.exception;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public final class AppException extends RuntimeException {
    private final ErrorType type;
    private final Map<String, Object> data = new HashMap<>();

    public AppException(ErrorType type, String message, Map<String, Object> data) {
        super(message);
        this.type = type;
        this.data.putAll(data);
    }

    public AppException(ErrorType type, String message, Map<String, Object> data, Throwable cause) {
        super(message, cause);
        this.type = type;
        this.data.putAll(data);
    }


    public AppException(ErrorType type, String message) {
        super(message);
        this.type = type;
    }

    public AppException(ErrorType type, String message, Throwable cause) {
        super(message, cause);
        this.type = type;
    }

    public AppException(ErrorType type, String message,
                        String key, Object value) {
        super(message);
        this.type = type;
        this.data.put(key, value);
    }

    public AppException(ErrorType type, String message,
                        String key1, Object value1,
                        String key2, Object value2) {
        super(message);
        this.type = type;
        this.data.put(key1, value1);
        this.data.put(key2, value2);
    }

    public AppException(ErrorType type, String message,
                        String key1, Object value1,
                        String key2, Object value2,
                        String key3, Object value3) {
        super(message);
        this.type = type;
        this.data.put(key1, value1);
        this.data.put(key2, value2);
        this.data.put(key3, value3);
    }

    public AppException(ErrorType type, String message,
                        String key1, Object value1,
                        String key2, Object value2,
                        String key3, Object value3,
                        String key4, Object value4) {
        super(message);
        this.type = type;
        this.data.put(key1, value1);
        this.data.put(key2, value2);
        this.data.put(key3, value3);
        this.data.put(key4, value4);
    }

}
