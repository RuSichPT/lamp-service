package ru.surf.hackathon.backend.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.surf.hackathon.backend.dto.LampMini;
import ru.surf.hackathon.backend.entity.Lamp;
import ru.surf.hackathon.backend.services.LampService;

import java.util.List;


@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
@Slf4j
public class LumpController {

    @Autowired
    private final LampService lampService;

    @GetMapping("/lamps")
    List<Lamp> all() {
        return lampService.findAll();
    }

    @GetMapping("/lamps/{id}/full")
    ResponseEntity<Lamp> oneFull(@PathVariable Long id) {
        Lamp lamp = lampService.find(id);
        log.info(lamp.toString());

        return ResponseEntity.ok(lamp);

    }
    @GetMapping("/lamps/{id}")
    ResponseEntity<LampMini> one(@PathVariable Long id) {
        Lamp lamp = lampService.find(id);
        log.info(lamp.toString());

        return ResponseEntity.ok(LampMini.toModel(lamp));

    }

    @GetMapping("/lamps/barcode/{barcode}")
    Lamp oneBarcode(@PathVariable String barcode) {
        return lampService.findByBarcode(barcode);
    }


}
