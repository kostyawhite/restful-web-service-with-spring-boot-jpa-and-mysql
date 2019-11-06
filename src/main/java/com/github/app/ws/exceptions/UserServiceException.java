package com.github.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

    public static final long serialVersionUID = 9056576389027345832L;

    public UserServiceException(String message) {
        super(message);
    }

}
