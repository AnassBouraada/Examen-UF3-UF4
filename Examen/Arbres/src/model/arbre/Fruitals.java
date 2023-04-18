package Arbres.src.model.arbre;

import java.time.LocalDate;

import Arbres.src.model.bosc.Bosc;
import Arbres.src.model.ennumerats.ColorTroncEnum;
import Arbres.src.model.ennumerats.TipusTroncEnum;
import Arbres.src.model.revisio.Revisio;

public class Fruitals extends Arbre{

    private Boolean florAmbPetals;
    private Boolean esDolça;

    public Fruitals(Boolean florAmbPetals, Boolean esDolça, int id, Bosc bosc, String codi, LocalDate dataTransplant, int alçada, int amplada, TipusTroncEnum tipusTronc, ColorTroncEnum colorTronc, Revisio[] revisio) {
        super(id, bosc, codi, dataTransplant, alçada, amplada, tipusTronc, colorTronc, revisio);
        this.florAmbPetals = florAmbPetals;
        this.esDolça = esDolça;
    }

    public Boolean getFlorAmbPetals() {
        return florAmbPetals;
    }

    public void setFlorAmbPetals(Boolean florAmbPetals) {
        this.florAmbPetals = florAmbPetals;
    }

    public Boolean getEsDolça() {
        return esDolça;
    }

    public void setEsDolça(Boolean esDolça) {
        this.esDolça = esDolça;
    }

    @Override
    public String toString() {
        return "Fruitals [esDolça=" + esDolça + ", florAmbPetals=" + florAmbPetals + "]";
    }
    
}
