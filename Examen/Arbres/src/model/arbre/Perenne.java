package Arbres.src.model.arbre;

import java.time.LocalDate;

import Arbres.src.model.bosc.Bosc;
import Arbres.src.model.ennumerats.ColorTroncEnum;
import Arbres.src.model.ennumerats.TipusTroncEnum;
import Arbres.src.model.revisio.Revisio;

public class Perenne extends Arbre {

    private Boolean olor;

    public Perenne(Boolean olor, int id, Bosc bosc, String codi, LocalDate dataTransplant, int alçada, int amplada, TipusTroncEnum tipusTronc, ColorTroncEnum colorTronc, Revisio[] revisio) {
        super(id, bosc, codi, dataTransplant, alçada, amplada, tipusTronc, colorTronc, revisio);
        this.olor = olor;
    }

    public Boolean getOlor() {
        return olor;
    }

    public void setOlor(Boolean olor) {
        this.olor = olor;
    }

    @Override
    public String toString() {
        return "Perenne [olor=" + olor + "]";
    }

}
