package ru.surf.hackathon.backend.exceprion;

public class LampNotFoundException extends RuntimeException {
    public LampNotFoundException(Long id) {
        super("Could not find lamp " + id);
    }
}
