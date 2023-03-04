package ru.surf.hackathon.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;
@Entity
public class Lamp {


    @Id
    Long id;
    String brand;
    String model;
    Double power_l;
    Double matt;
    Double dim;
    Integer color_l;
    Integer lm_l;
    Integer eq_l;
    Integer ra_l;
    String u;
    Double pf_l;
    Integer angle_l;
    Integer life;
    Integer war;
    Integer prod;
    Integer w;
    Integer d;
    Integer h;
    Integer t;
    Long barcode;
    String plant;
    String base;
    String shape;
    String type;
    String type2;
    String url;
    String shop;
    Double rub;
    Double usd;
    Double p;
    Integer pf;
    Integer lm;
    Integer color;
    Double cri;
    Integer r9;
    Double Rf;
    Double Rg;
    Double Duv;
    Double flicker;
    Integer angle;
    Integer sw;
    Integer umin;
    Integer drv;
    Integer tmax;
    Date date;
    Integer instruments;
    String add2;
    String add3;
    String add4;
    String add5;
    Integer cqs;
    Integer eq;
    Double rating;
    Double act;
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
                ", Rf=" + Rf +
                ", Rg=" + Rg +
                ", Duv=" + Duv +
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
