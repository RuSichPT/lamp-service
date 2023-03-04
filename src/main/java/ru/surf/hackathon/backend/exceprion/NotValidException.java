package ru.surf.hackathon.backend.exceprion;

public class NotValidException extends RuntimeException {
    public NotValidException(String message) {
        super("not valid " + message);
    }
}
