package com.shop.ecart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Sidharth
 */
@RestControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

//    @ExceptionHandler(value=ItemNotFoundException.class)
//    public ErrorResponse handleException(ItemNotFoundException ief){
//        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ief.getMessage());
//    }

    @ExceptionHandler(value= NullPointerException.class)
    public ErrorResponse handleException(NullPointerException ief){
        return new ErrorResponse(HttpStatus.BAD_REQUEST.value(), ief.getMessage());
    }
}
