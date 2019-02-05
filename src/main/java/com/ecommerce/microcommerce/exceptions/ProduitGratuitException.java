package com.ecommerce.microcommerce.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(BAD_REQUEST)
public class ProduitGratuitException extends RuntimeException{
    public ProduitGratuitException(String message) {
        super(message);
    }
}
