package com.librarymanagement.librarymanagement.Users.errorhandling;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceNotFoundError extends RuntimeException{
    public ResourceNotFoundError(String message){
        super(message);
    }
    public ResourceNotFoundError(String message, Throwable cause){
        super(message, cause);
    }
}