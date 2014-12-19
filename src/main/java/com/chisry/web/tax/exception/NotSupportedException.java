package com.chisry.web.tax.exception;

public class NotSupportedException extends RuntimeException {

    private static final long serialVersionUID = 6305227276397393693L;

    public NotSupportedException() {

    }

    public NotSupportedException(String message) {
        super(message);
    }
}
