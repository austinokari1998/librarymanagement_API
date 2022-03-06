
package com.librarymanagement.librarymanagement.Users.errorhandling;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BookNotBorrowed extends RuntimeException{
    public BookNotBorrowed(String message){
        super(message);
    }
    public BookNotBorrowed(String message, Throwable cause){
        super(message, cause);
    }
}