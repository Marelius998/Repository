package com.example.demo_code9prj.exception;

public class AuthenticationException extends RuntimeException {

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}