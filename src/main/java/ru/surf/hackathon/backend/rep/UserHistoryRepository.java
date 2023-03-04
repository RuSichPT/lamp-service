package ru.surf.hackathon.backend.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.surf.hackathon.backend.entity.UserHistory;

import java.util.List;
import java.util.Optional;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
    Optional<List<UserHistory>> findAllByHash(String hash);
}
