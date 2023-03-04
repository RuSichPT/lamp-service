package ru.surf.hackathon.backend.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.surf.hackathon.backend.entity.UserHistory;

import ru.surf.hackathon.backend.services.UserHistoryService;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
@Slf4j
public class UserHistoryController {
    @Autowired
    private final UserHistoryService userHistoryService;
    @PostMapping("/user_history/")
    List<UserHistory> getHistory(@RequestBody String hash){
        return userHistoryService.findAllByHash(hash);
    }
}
