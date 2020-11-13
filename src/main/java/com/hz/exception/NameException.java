package com.hz.exception;

// 姓名异常
public class NameException extends MyUserException{
    public NameException() {
    }

    public NameException(String message) {
        super(message);
    }
}
