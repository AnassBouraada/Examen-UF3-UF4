package model.mascota;

import java.time.LocalDate;

import model.client.Client;
import model.diagnostic.Diagnostic;
import model.ennumerats.SexeEnum;
import model.ennumerats.TipusPellEnum;
import model.ennumerats.TipusRespiracioEnum;

public class Reptil extends Mascota {

    private boolean tePates;
    private int numPates;

    public Reptil(int id, Client client, String nom, LocalDate dataNaixement, SexeEnum sexe, TipusPellEnum tipusPell, TipusRespiracioEnum tipusRespiracio, Diagnostic[] diagnostics, boolean tePates, int numPates) {
        super(id, client, nom, dataNaixement, sexe, tipusPell, tipusRespiracio, diagnostics);
        this.tePates = tePates;
        this.numPates = numPates;
    }

    public boolean getTePates() {
        return tePates;
    }

    public void setTePates(boolean tePates) {
        this.tePates = tePates;
    }

    public int getNumPates() {
        return numPates;
    }

    public void setNumPates(int numPates) {
        this.numPates = numPates;
    }

    @Override
    public String toString() {
        return "Reptil{" + "tePates=" + tePates + ", numPates=" + numPates + '}';
    }
    
}
