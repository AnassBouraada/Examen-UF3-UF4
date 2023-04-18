package Arbres.src.model.arbre;

import java.time.LocalDate;

import Arbres.src.model.bosc.Bosc;
import Arbres.src.model.ennumerats.ColorTroncEnum;
import Arbres.src.model.ennumerats.MesEnum;
import Arbres.src.model.ennumerats.TipusTroncEnum;
import Arbres.src.model.revisio.Revisio;

public class Caduca extends Arbre {

    private int duressaTronc;
    private MesEnum mesCaigudaFulles;

    public Caduca(int duressaTronc, MesEnum mesCaigudaFulles, int id, Bosc bosc, String codi, LocalDate dataTransplant, int alçada, int amplada, TipusTroncEnum tipusTronc, ColorTroncEnum colorTronc, Revisio[] revisio) {
        super(id, bosc, codi, dataTransplant, alçada, amplada, tipusTronc, colorTronc, revisio);
        this.duressaTronc = duressaTronc;
        this.mesCaigudaFulles = mesCaigudaFulles;
    }

    public int getDuressaTronc() {
        return duressaTronc;
    }

    public void setDuressaTronc(int duressaTronc) {
        this.duressaTronc = duressaTronc;
    }

    public MesEnum getMesCaigudaFulles() {
        return mesCaigudaFulles;
    }

    public void setMesCaigudaFulles(MesEnum mesCaigudaFulles) {
        this.mesCaigudaFulles = mesCaigudaFulles;
    }

    @Override
    public String toString() {
        return "Caduca [duressaTronc=" + duressaTronc + ", mesCaigudaFulles=" + mesCaigudaFulles + "]";
    }
}
