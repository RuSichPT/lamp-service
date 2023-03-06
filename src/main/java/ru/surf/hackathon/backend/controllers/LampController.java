package ru.surf.hackathon.backend.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.surf.hackathon.backend.dto.LampMini;
import ru.surf.hackathon.backend.entity.Lamp;
import ru.surf.hackathon.backend.services.LampService;
import ru.surf.hackathon.backend.services.UserHistoryService;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
@Slf4j
public class LampController {

    private static final String HASH = "hash";

    @Autowired
    private final LampService lampService;

    @Autowired
    private final UserHistoryService userHistoryService;

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
    LampMini oneBarcode(@PathVariable String barcode, @RequestHeader(value = HASH, required = false) String hash) {
        return LampMini.toModel(oneBarcodeFull(barcode, hash));
    }

    @GetMapping("/lamps/barcode/{barcode}/full")
    Lamp oneBarcodeFull(@PathVariable String barcode, @RequestHeader(value = HASH, required = false) String hash) {
        Lamp lamp = lampService.findByBarcode(barcode);
        log.info(lamp.toString());
        if (hash != null) userHistoryService.add(hash, barcode);
        return lamp;
    }


}
