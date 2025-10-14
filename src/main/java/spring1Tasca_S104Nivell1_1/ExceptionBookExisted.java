package spring1Tasca_S104Nivell1_1;

class ExceptionBookExisted extends Exception {
    @java.io.Serial
    static final long serialVersionUID = -33875163264229948L;

    public ExceptionBookExisted() {
        super("The book is already existed.");
    }

    public ExceptionBookExisted(String message) {
        super(message);
    }

    public ExceptionBookExisted(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionBookExisted(Throwable cause) {
        super(cause);
    }

    public ExceptionBookExisted(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
