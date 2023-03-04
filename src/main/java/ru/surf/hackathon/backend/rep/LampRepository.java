package ru.surf.hackathon.backend.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.surf.hackathon.backend.entity.Lamp;

import java.util.Optional;

public interface LampRepository extends JpaRepository<Lamp, Long> {
     Optional<Lamp> findByBarcode(Long barcode);
}
