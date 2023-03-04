package ru.surf.hackathon.backend.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.surf.hackathon.backend.exceprion.LampNotFoundException;

public class LampNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(LampNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String LampNotFoundHandler(LampNotFoundException ex) {
        return ex.getMessage();
    }
}
