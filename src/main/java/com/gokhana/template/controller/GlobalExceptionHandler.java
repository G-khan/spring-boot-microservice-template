package com.gokhana.template.controller;

import com.gokhana.template.exception.TemplateNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(TemplateNotFoundException.class)
    public ResponseEntity<String> handleValidationExceptions(TemplateNotFoundException ex) {
        LOGGER.error("TemplateNotFoundException : {}", ex.getMessage());
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

}
