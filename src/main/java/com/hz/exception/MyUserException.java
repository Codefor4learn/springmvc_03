package com.hz.exception;

public class MyUserException extends Exception{

    public MyUserException() {
    }

    public MyUserException(String message) {
        super(message);
    }
}
