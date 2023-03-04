package ru.surf.hackathon.backend.rep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import ru.surf.hackathon.backend.entity.Lamp;

import java.util.Optional;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@SpringBootTest
@AutoConfigureTestDatabase(replace = NONE)
@ActiveProfiles("local")
public class LampRepositoryTest {

    @Autowired
    private LampRepository lampRepository;

    @Test
    public void shouldCorrectlyFindLamp() {
        Optional<Lamp> optionalLamp = lampRepository.findById(1L);

        Assertions.assertTrue(optionalLamp.isPresent());
    }
}
