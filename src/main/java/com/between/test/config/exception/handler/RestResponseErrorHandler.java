package com.between.test.config.exception.handler;

import com.between.test.commons.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
@ControllerAdvice
public class RestResponseErrorHandler {

    /**
     * Handler to not found data
     * @return null
     */
    @ExceptionHandler(value = {NotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handlerNotFound() {
        return null;
    }

}
