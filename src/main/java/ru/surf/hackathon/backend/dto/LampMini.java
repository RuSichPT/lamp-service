package ru.surf.hackathon.backend.dto;

import lombok.Data;
import ru.surf.hackathon.backend.entity.Lamp;

@Data
public class LampMini {

    String brand;
    String model;
    String power;
    String barcode;

    String lamp_image;

    String lamp_desc;

    public static LampMini toModel(Lamp lamp) {
        return new LampMini(lamp.getBrand(), lamp.getModel(), lamp.getPower_l(), lamp.getBarcode(), lamp.getLamp_image(), lamp.getLamp_desc());
    }

    public LampMini(String brand, String model, String power, String barcode, String lamp_image, String lamp_desc) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.barcode = barcode;
        this.lamp_image = lamp_image;
        this.lamp_desc = lamp_desc;
    }
}
