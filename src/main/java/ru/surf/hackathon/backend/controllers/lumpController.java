package ru.surf.hackathon.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class lumpController {

    @GetMapping(path = "lump")
    public String getBulb(){
        return "test";
    }
}
