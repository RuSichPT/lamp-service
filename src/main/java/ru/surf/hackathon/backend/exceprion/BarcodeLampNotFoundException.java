package ru.surf.hackathon.backend.exceprion;

public class BarcodeLampNotFoundException extends RuntimeException{
    public BarcodeLampNotFoundException(Long id) {
        super("Could not find lamp by barcode" + id);
    }
}
