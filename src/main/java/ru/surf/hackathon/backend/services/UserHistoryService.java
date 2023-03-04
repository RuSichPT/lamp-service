package ru.surf.hackathon.backend.services;

import ru.surf.hackathon.backend.entity.UserHistory;

import java.util.List;

public interface UserHistoryService {

    void add(String hash, String barcode);

    List<UserHistory> findAllByHash(String hash);
}
