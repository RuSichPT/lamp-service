package ru.surf.hackathon.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user_history", schema = "lamps")
@Data
public class UserHistory {

    String hash;

    String barcode;

    @Id
    Long date;

    public UserHistory(String hash, String barcode, Long date) {
        this.hash = hash;
        this.barcode = barcode;
        this.date = date;
    }

    public UserHistory() {

    }
}
