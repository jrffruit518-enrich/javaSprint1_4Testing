package sprint1Tasca_S104Nivell1_1;

class ExceptionBookOutOfBound extends Exception {
    @java.io.Serial
    static final long serialVersionUID = -338156163264229948L;

    public ExceptionBookOutOfBound() {
        super("The number is out of bound.");
    }

    public ExceptionBookOutOfBound(String message) {
        super(message);
    }

    public ExceptionBookOutOfBound(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionBookOutOfBound(Throwable cause) {
        super(cause);
    }

    public ExceptionBookOutOfBound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
