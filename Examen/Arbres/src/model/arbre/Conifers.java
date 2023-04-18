package Arbres.src.model.arbre;

import java.time.LocalDate;

import Arbres.src.model.bosc.Bosc;
import Arbres.src.model.ennumerats.ColorFullaEnum;
import Arbres.src.model.ennumerats.ColorTroncEnum;
import Arbres.src.model.ennumerats.TipusTroncEnum;
import Arbres.src.model.revisio.Revisio;

public class Conifers extends Arbre {

    private ColorFullaEnum colorFulla;

    public Conifers(int id, Bosc bosc, String codi, LocalDate dataTransplant, int alçada, int amplada, TipusTroncEnum tipusTronc, ColorTroncEnum colorTronc, Revisio[] revisio, ColorFullaEnum colorFulla) {
        super(id, bosc, codi, dataTransplant, alçada, amplada, tipusTronc, colorTronc, revisio);
        this.colorFulla = colorFulla;
    }

    public ColorFullaEnum getColorFulla() {
        return colorFulla;
    }

    public void setColorFulla(ColorFullaEnum colorFulla) {
        this.colorFulla = colorFulla;
    }

    @Override
    public String toString() {
        return "Conifers [colorFulla=" + colorFulla + "]";
    }
    
}
