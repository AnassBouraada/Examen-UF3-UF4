package model.mascota;

import java.time.LocalDate;

import model.client.Client;
import model.diagnostic.Diagnostic;
import model.ennumerats.SexeEnum;
import model.ennumerats.TipusPellEnum;
import model.ennumerats.TipusRespiracioEnum;

public class Mamifer extends Mascota {
    
    private boolean terrestre;

    public Mamifer(int id, Client client, String nom, LocalDate dataNaixement, SexeEnum sexe, TipusPellEnum tipusPell, TipusRespiracioEnum tipusRespiracio, Diagnostic[] diagnostics, boolean terrestre) {
        super(id, client, nom, dataNaixement, sexe, tipusPell, tipusRespiracio, diagnostics);
        this.terrestre = terrestre;
    }

    public boolean getTerrestre() {
        return terrestre;
    }

    public void setTerrestre(boolean terrestre) {
        this.terrestre = terrestre;
    }

    @Override
    public String toString() {
        return "Mamifer{" + "terrestre=" + terrestre + '}';
    }
    
}
