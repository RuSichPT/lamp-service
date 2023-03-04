package ru.surf.hackathon.backend.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.surf.hackathon.backend.entity.Lamp;
import ru.surf.hackathon.backend.exceprion.BarcodeLampNotFoundException;
import ru.surf.hackathon.backend.exceprion.LampNotFoundException;
import ru.surf.hackathon.backend.exceprion.NotValidException;
import ru.surf.hackathon.backend.rep.LampRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class LampServiceImpl implements LampService {

    @Autowired
    private final LampRepository lampRepository;

    @Override
    public Lamp find(Long id) {
        return lampRepository.findById(id).orElseThrow(() -> new LampNotFoundException(id));
    }

    @Override
    public List<Lamp> findAll() {
        return lampRepository.findAll();
    }

    @Override
    public Lamp findByBarcode(String barcode) throws NotValidException {
        if (barcode.matches("\\d*")) {
            return lampRepository.findByBarcode(barcode).orElseThrow(() -> new BarcodeLampNotFoundException(barcode));
        } else {
            throw new NotValidException(barcode);
        }
    }

}
