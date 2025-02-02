package com.currencyexchange.currency_converter.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CurrencyConverterException extends RuntimeException {

    private final HttpStatus statusCode;

    public CurrencyConverterException(String message, HttpStatus statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

}
