package com.inferit.projectmanagementtool.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UsernameNotUniqueException extends RuntimeException{

    public UsernameNotUniqueException(String message){
        super(message);
    }

}
