package Arbres.src.model.arbre;

import java.time.LocalDate;

import Arbres.src.model.bosc.Bosc;
import Arbres.src.model.ennumerats.ColorTroncEnum;
import Arbres.src.model.ennumerats.TipusTroncEnum;
import Arbres.src.model.revisio.Revisio;

public class Arbre {
    
    private int id;
    private Bosc bosc;
    private String codi;
    private LocalDate dataTransplant;
    private int alçada;
    private int amplada;
    private TipusTroncEnum tipusTronc;
    private ColorTroncEnum colorTronc;
    private Revisio[] revisio;

    public Arbre(int id, Bosc bosc, String codi, LocalDate dataTransplant, int alçada, int amplada, TipusTroncEnum tipusTronc, ColorTroncEnum colorTronc, Revisio[] revisio) {
        this.id = id;
        this.bosc = bosc;
        this.codi = codi;
        this.dataTransplant = dataTransplant;
        this.alçada = alçada;
        this.amplada = amplada;
        this.tipusTronc = tipusTronc;
        this.colorTronc = colorTronc;
        this.revisio = revisio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bosc getBosc() {
        return bosc;
    }

    public void setBosc(Bosc bosc) {
        this.bosc = bosc;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public LocalDate getDataTransplant() {
        return dataTransplant;
    }

    public void setDataTransplant(LocalDate dataTransplant) {
        this.dataTransplant = dataTransplant;
    }

    public int getAlçada() {
        return alçada;
    }

    public void setAlçada(int alçada) {
        this.alçada = alçada;
    }

    public int getAmplada() {
        return amplada;
    }

    public void setAmplada(int amplada) {
        this.amplada = amplada;
    }

    public TipusTroncEnum getTipusTronc() {
        return tipusTronc;
    }

    public void setTipusTronc(TipusTroncEnum tipusTronc) {
        this.tipusTronc = tipusTronc;
    }

    public ColorTroncEnum getColorTronc() {
        return colorTronc;
    }

    public void setColorTronc(ColorTroncEnum colorTronc) {
        this.colorTronc = colorTronc;
    }

    public Revisio[] getRevisio() {
        return revisio;
    }

    public void setRevisio(Revisio[] revisio) {
        this.revisio = revisio;
    }

    @Override
    public String toString() {
        return "Arbre [alçada=" + alçada + ", amplada=" + amplada + ", bosc=" + bosc + ", codi=" + codi + ", colorTronc="
                + colorTronc + ", dataTransplant=" + dataTransplant + ", id=" + id + ", revisio="
                + revisio + ", tipusTronc=" + tipusTronc + "]";
    }

}
