package ru.surf.hackathon.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.surf.hackathon.backend.entity.Lamp;
import ru.surf.hackathon.backend.exceprion.LampNotFoundException;
import ru.surf.hackathon.backend.exceprion.BarcodeLampNotFoundException;
import ru.surf.hackathon.backend.rep.LampRepository;

import java.util.List;


@RestController
@RequestMapping("api/v1")
public class LumpController {
    private final LampRepository repository;

    public LumpController(LampRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/lamps")
    List<Lamp> all() {
        return repository.findAll();
    }

    @GetMapping("/lamps/{id}")
    ResponseEntity<Lamp> one(@PathVariable Long id) {
        System.out.println(repository.findById(id));

        return ResponseEntity.ok(repository.findById(id).orElseThrow(() -> new LampNotFoundException(id)));

    }

    @GetMapping("/lamps/barcode/{id}")
    Lamp oneBarcode(@PathVariable Long id) {

        return repository.findByBarcode(id).orElseThrow(() -> new BarcodeLampNotFoundException(id));
    }


}
