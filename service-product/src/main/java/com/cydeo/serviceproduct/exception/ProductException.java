package com.cydeo.serviceproduct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_ACCEPTABLE)
public class ProductException extends RuntimeException {
}
