package ru.surf.hackathon.backend.services;

import ru.surf.hackathon.backend.entity.Lamp;

import java.util.List;

public interface LampService {
    Lamp find(Long id);

    List<Lamp> findAll();

    Lamp findByBarcode(String barcode);
}
