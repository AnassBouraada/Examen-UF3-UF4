package model.mascota;

import java.time.LocalDate;

import model.client.Client;
import model.diagnostic.Diagnostic;
import model.ennumerats.SexeEnum;
import model.ennumerats.TipusPellEnum;
import model.ennumerats.TipusRespiracioEnum;

public class Peix extends Mascota {

    private int numUlls;

    public Peix(int id, Client client, String nom, LocalDate dataNaixement, SexeEnum sexe, TipusPellEnum tipusPell, TipusRespiracioEnum tipusRespiracio, Diagnostic[] diagnostics, int numUlls) {
        super(id, client, nom, dataNaixement, sexe, tipusPell, tipusRespiracio, diagnostics);
        this.numUlls = numUlls;
    }

    public int getNumUlls() {
        return numUlls;
    }

    public void setNumUlls(int numUlls) {
        this.numUlls = numUlls;
    }

    @Override
    public String toString() {
        return "Peix{" + "numUlls=" + numUlls + '}';
    }
    
}
