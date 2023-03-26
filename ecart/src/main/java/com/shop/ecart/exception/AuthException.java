package com.shop.ecart.exception;

/**
 * @author Sidharth
 */
public class AuthException extends RuntimeException{
    public AuthException(String message, Exception e) {
        super(message,e);
    }
    public AuthException(String message) {
        super(message);
    }
}
