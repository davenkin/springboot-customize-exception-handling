package davenkin.springboot.web.exception;

public enum ErrorType {
    USER_NOT_FOUND(404);

    private final int status;

    ErrorType(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

}
