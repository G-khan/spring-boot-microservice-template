package com.gokhana.template.exception;

public class TemplateNotFoundException extends RuntimeException {

    {
    }

    public TemplateNotFoundException() {
        super();
    }

    public TemplateNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TemplateNotFoundException(String message) {
        super(message);
    }

    public TemplateNotFoundException(Throwable cause) {
        super(cause);
    }

}
