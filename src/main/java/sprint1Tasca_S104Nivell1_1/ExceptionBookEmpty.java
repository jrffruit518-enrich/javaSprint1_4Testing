package sprint1Tasca_S104Nivell1_1;

public class ExceptionBookEmpty extends RuntimeException{
    @java.io.Serial
    static final long serialVersionUID = -3387516993123659948L;

    public ExceptionBookEmpty() {
    }

    public ExceptionBookEmpty(String message) {
        super(message);
    }

    public ExceptionBookEmpty(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionBookEmpty(Throwable cause) {
        super(cause);
    }

    public ExceptionBookEmpty(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
