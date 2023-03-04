package ru.surf.hackathon.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "led", schema = "lamps")
public class Lamp {


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
