package ru.surf.hackathon.backend.exceprion;

public class BarcodeLampNotFoundException extends RuntimeException{
    public BarcodeLampNotFoundException(String barcode) {
        super("Could not find lamp by barcode: " + barcode);
    }
}
