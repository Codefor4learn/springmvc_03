package com.hz.exception;

// 年龄异常
public class AgeException extends MyUserException {
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
