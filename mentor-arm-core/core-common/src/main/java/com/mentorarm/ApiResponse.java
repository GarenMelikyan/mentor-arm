package com.mentorarm;


import org.springframework.http.HttpStatus;

/**
 * @author William Arustamyan
 */


public class ApiResponse<T> {

    private T instance;
    private String message;
    private HttpStatus status;

    public ApiResponse(final T instance, final String message, final HttpStatus status) {
        this.instance = instance;
        this.message = message;
        this.status = status;
    }

    public T getInstance() {
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
