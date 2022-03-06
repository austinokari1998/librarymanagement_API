
package com.librarymanagement.librarymanagement.Users.errorhandling;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BookNotFoundError extends RuntimeException{
    public BookNotFoundError(String message){
        super(message);
    }
    public BookNotFoundError(String message, Throwable cause){
        super(message, cause);
    }
}