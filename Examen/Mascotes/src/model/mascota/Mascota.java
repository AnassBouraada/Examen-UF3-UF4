package model.mascota;

import java.time.LocalDate;

import model.client.Client;
import model.diagnostic.Diagnostic;
import model.ennumerats.SexeEnum;
import model.ennumerats.TipusPellEnum;
import model.ennumerats.TipusRespiracioEnum;

public class Mascota {

    private int id;
    private Client client;
    private String nom;
    private LocalDate dataNaixement;
    private SexeEnum sexe;
    private TipusPellEnum tipusPell;
    private TipusRespiracioEnum tipusRespiracio;
    private Diagnostic[] diagnostics;

    public Mascota(int id, Client client, String nom, LocalDate dataNaixement, SexeEnum sexe, TipusPellEnum tipusPell, TipusRespiracioEnum tipusRespiracio, Diagnostic[] diagnostics) {
        this.id = id;
        this.client = client;
        this.nom = nom;
        this.dataNaixement = dataNaixement;
        this.sexe = sexe;
        this.tipusPell = tipusPell;
        this.tipusRespiracio = tipusRespiracio;
        this.diagnostics = diagnostics;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public SexeEnum getSexe() {
        return sexe;
    }

    public void setSexe(SexeEnum sexe) {
        this.sexe = sexe;
    }

    public TipusPellEnum getTipusPell() {
        return tipusPell;
    }

    public void setTipusPell(TipusPellEnum tipusPell) {
        this.tipusPell = tipusPell;
    }

    public TipusRespiracioEnum getTipusRespiracio() {
        return tipusRespiracio;
    }

    public void setTipusRespiracio(TipusRespiracioEnum tipusRespiracio) {
        this.tipusRespiracio = tipusRespiracio;
    }

    public Diagnostic[] getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(Diagnostic[] diagnostics) {
        this.diagnostics = diagnostics;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", client=" + client + ", nom=" + nom + ", dataNaixement=" + dataNaixement + ", sexe=" + sexe + ", tipusPell=" + tipusPell + ", tipusRespiracio=" + tipusRespiracio + ", diagnostics=" + diagnostics + '}';
    }
    
}
