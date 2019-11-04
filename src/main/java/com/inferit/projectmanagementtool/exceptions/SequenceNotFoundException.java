package com.inferit.projectmanagementtool.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class SequenceNotFoundException extends RuntimeException {
    public SequenceNotFoundException(String message){
        super(message);
    }
}
