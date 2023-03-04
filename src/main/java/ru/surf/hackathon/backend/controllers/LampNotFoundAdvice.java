package ru.surf.hackathon.backend.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.surf.hackathon.backend.exceprion.BarcodeLampNotFoundException;
import ru.surf.hackathon.backend.exceprion.LampNotFoundException;
import ru.surf.hackathon.backend.exceprion.error.ErrorResponse;

@RestControllerAdvice
@Slf4j
public class LampNotFoundAdvice {
    @ExceptionHandler(LampNotFoundException.class)
    ResponseEntity<ErrorResponse> LampNotFoundHandler(LampNotFoundException ex) {
        log.info(ex.getMessage());
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BarcodeLampNotFoundException.class)
    ResponseEntity<ErrorResponse> BarcodeLampNotFoundHandler(BarcodeLampNotFoundException ex) {
        log.info(ex.getMessage());
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage()), HttpStatus.NOT_FOUND);
    }
}
