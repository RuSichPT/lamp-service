package ru.surf.hackathon.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.surf.hackathon.backend.entity.UserHistory;
import ru.surf.hackathon.backend.rep.UserHistoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserHistoryServiceImpl implements UserHistoryService {
    @Autowired
    private final UserHistoryRepository userHistoryRepository;

    public UserHistoryServiceImpl(UserHistoryRepository userHistoryRepository) {
        this.userHistoryRepository = userHistoryRepository;
    }
    @Override
    public void add(String hash, String barcode){
        userHistoryRepository.save(new UserHistory(hash, barcode, System.currentTimeMillis()));
    }

    @Override
    public List<UserHistory> findAllByHash(String hash) {
        Optional<List<UserHistory>> list = userHistoryRepository.findAllByHashOrderByDateDesc(hash);
        return list.orElse(new ArrayList<>());
    }
}
