package model.mascota;

import java.time.LocalDate;

import model.client.Client;
import model.diagnostic.Diagnostic;
import model.ennumerats.SexeEnum;
import model.ennumerats.TipusPellEnum;
import model.ennumerats.TipusRespiracioEnum;

public class Au extends Mascota {
    
    private boolean vola;

    public Au(int id, Client client, String nom, LocalDate dataNaixement, SexeEnum sexe, TipusPellEnum tipusPell, TipusRespiracioEnum tipusRespiracio, Diagnostic[] diagnostics, boolean vola) {
        super(id, client, nom, dataNaixement, sexe, tipusPell, tipusRespiracio, diagnostics);
        this.vola = vola;
    }

    public boolean getVola() {
        return vola;
    }

    public void setVola(boolean vola) {
        this.vola = vola;
    }

    @Override
    public String toString() {
        return "Au{" + "vola=" + vola + '}';
    }
    
}
