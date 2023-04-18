package model.mascota;

import java.time.LocalDate;

import model.client.Client;
import model.diagnostic.Diagnostic;
import model.ennumerats.SexeEnum;
import model.ennumerats.TipusPellEnum;
import model.ennumerats.TipusRespiracioEnum;

public class Amfibi extends Mascota {

    private String colorPell;

    public Amfibi(int id, Client client, String nom, LocalDate dataNaixement, SexeEnum sexe, TipusPellEnum tipusPell, TipusRespiracioEnum tipusRespiracio, Diagnostic[] diagnostics, String colorPell) {
        super(id, client, nom, dataNaixement, sexe, tipusPell, tipusRespiracio, diagnostics);
        this.colorPell = colorPell;
    }

    public String getColorPell() {
        return colorPell;
    }

    public void setColorPell(String colorPell) {
        this.colorPell = colorPell;
    }

    @Override
    public String toString() {
        return "Amfibi{" + "colorPell=" + colorPell + '}';
    }
    
}
