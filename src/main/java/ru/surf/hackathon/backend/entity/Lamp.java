package ru.surf.hackathon.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "led", schema = "lamps")
@Data
public class Lamp implements Serializable {


    @Id
    @Column(name="no")
    Long id;
    String brand;
    String model;
    String power_l;
    String matt;
    String dim;
    String color_l;
    String lm_l;
    String eq_l;
    String ra_l;
    String u;
    String pf_l;
    String angle_l;
    String life;
    String war;
    String prod;
    String w;
    String d;
    String h;
    String t;
    String barcode;
    String plant;
    String base;
    String shape;
    String type;
    String type2;
    String url;
    String shop;
    String rub;
    String usd;
    String p;
    String pf;
    String lm;
    String color;
    String cri;
    String r9;
    String rf;
    String rg;
    String duv;
    String flicker;
    String angle;
    @Column(name="switch")
    String sw;
    String umin;
    String drv;
    String tmax;
    String date;
    String instruments;
    String add2;
    String add3;
    String add4;
    String add5;
    String cqs;
    String eq;
    String rating;
    String act;
    String lamp_image;
    String lamp_desc;

    public Lamp() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lamp lamp = (Lamp) o;
        return Objects.equals(id, lamp.id) && Objects.equals(brand, lamp.brand) && Objects.equals(model, lamp.model) && Objects.equals(power_l, lamp.power_l) && Objects.equals(matt, lamp.matt) && Objects.equals(dim, lamp.dim) && Objects.equals(color_l, lamp.color_l) && Objects.equals(lm_l, lamp.lm_l) && Objects.equals(eq_l, lamp.eq_l) && Objects.equals(ra_l, lamp.ra_l) && Objects.equals(u, lamp.u) && Objects.equals(pf_l, lamp.pf_l) && Objects.equals(angle_l, lamp.angle_l) && Objects.equals(life, lamp.life) && Objects.equals(war, lamp.war) && Objects.equals(prod, lamp.prod) && Objects.equals(w, lamp.w) && Objects.equals(d, lamp.d) && Objects.equals(h, lamp.h) && Objects.equals(t, lamp.t) && Objects.equals(barcode, lamp.barcode) && Objects.equals(plant, lamp.plant) && Objects.equals(base, lamp.base) && Objects.equals(shape, lamp.shape) && Objects.equals(type, lamp.type) && Objects.equals(type2, lamp.type2) && Objects.equals(url, lamp.url) && Objects.equals(shop, lamp.shop) && Objects.equals(rub, lamp.rub) && Objects.equals(usd, lamp.usd) && Objects.equals(p, lamp.p) && Objects.equals(pf, lamp.pf) && Objects.equals(lm, lamp.lm) && Objects.equals(color, lamp.color) && Objects.equals(cri, lamp.cri) && Objects.equals(r9, lamp.r9) && Objects.equals(rf, lamp.rf) && Objects.equals(rg, lamp.rg) && Objects.equals(duv, lamp.duv) && Objects.equals(flicker, lamp.flicker) && Objects.equals(angle, lamp.angle) && Objects.equals(sw, lamp.sw) && Objects.equals(umin, lamp.umin) && Objects.equals(drv, lamp.drv) && Objects.equals(tmax, lamp.tmax) && Objects.equals(date, lamp.date) && Objects.equals(instruments, lamp.instruments) && Objects.equals(add2, lamp.add2) && Objects.equals(add3, lamp.add3) && Objects.equals(add4, lamp.add4) && Objects.equals(add5, lamp.add5) && Objects.equals(cqs, lamp.cqs) && Objects.equals(eq, lamp.eq) && Objects.equals(rating, lamp.rating) && Objects.equals(act, lamp.act) && Objects.equals(lamp_image, lamp.lamp_image) && Objects.equals(lamp_desc, lamp.lamp_desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, power_l, matt, dim, color_l, lm_l, eq_l, ra_l, u, pf_l, angle_l, life, war, prod, w, d, h, t, barcode, plant, base, shape, type, type2, url, shop, rub, usd, p, pf, lm, color, cri, r9, rf, rg, duv, flicker, angle, sw, umin, drv, tmax, date, instruments, add2, add3, add4, add5, cqs, eq, rating, act, lamp_image, lamp_desc);
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", power_l=" + power_l +
                ", matt=" + matt +
                ", dim=" + dim +
                ", color_l=" + color_l +
                ", lm_l=" + lm_l +
                ", eq_l=" + eq_l +
                ", ra_l=" + ra_l +
                ", u='" + u + '\'' +
                ", pf_l=" + pf_l +
                ", angle_l=" + angle_l +
                ", life=" + life +
                ", war=" + war +
                ", prod=" + prod +
                ", w=" + w +
                ", d=" + d +
                ", h=" + h +
                ", t=" + t +
                ", barcode=" + barcode +
                ", plant='" + plant + '\'' +
                ", base='" + base + '\'' +
                ", shape='" + shape + '\'' +
                ", type='" + type + '\'' +
                ", type2='" + type2 + '\'' +
                ", url='" + url + '\'' +
                ", shop='" + shop + '\'' +
                ", rub=" + rub +
                ", usd=" + usd +
                ", p=" + p +
                ", pf=" + pf +
                ", lm=" + lm +
                ", color=" + color +
                ", cri=" + cri +
                ", r9=" + r9 +
                ", rf=" + rf +
                ", rg=" + rg +
                ", duv=" + duv +
                ", flicker=" + flicker +
                ", angle=" + angle +
                ", sw=" + sw +
                ", umin=" + umin +
                ", drv=" + drv +
                ", tmax=" + tmax +
                ", date=" + date +
                ", instruments=" + instruments +
                ", add2='" + add2 + '\'' +
                ", add3='" + add3 + '\'' +
                ", add4='" + add4 + '\'' +
                ", add5='" + add5 + '\'' +
                ", cqs=" + cqs +
                ", eq=" + eq +
                ", rating=" + rating +
                ", act=" + act +
                ", lamp_image='" + lamp_image + '\'' +
                ", lamp_desc='" + lamp_desc + '\'' +
                '}';
    }


}
