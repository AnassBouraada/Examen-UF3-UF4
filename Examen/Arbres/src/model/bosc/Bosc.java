package Arbres.src.model.bosc;

import Arbres.src.model.arbre.Arbre;

public class Bosc {

    private int id;
    private String nom;
    private String poblacio;
    private String responsable;
    private String telefonResponsable;
    private Arbre[] arbres;

    public Bosc(int id, String nom, String poblacio, String responsable, String telefonResponsable, Arbre[] arbres) {
        this.id = id;
        this.nom = nom;
        this.poblacio = poblacio;
        this.responsable = responsable;
        this.telefonResponsable = telefonResponsable;
        this.arbres = arbres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getTelefonResponsable() {
        return telefonResponsable;
    }

    public void setTelefonResponsable(String telefonResponsable) {
        this.telefonResponsable = telefonResponsable;
    }

    public Arbre[] getArbres() {
        return arbres;
    }

    public void setArbres(Arbre[] arbres) {
        this.arbres = arbres;
    }

    @Override
    public String toString() {
        return "Bosc [arbres=" + arbres + ", id=" + id + ", nom=" + nom + ", poblacio=" + poblacio + ", responsable="
                + responsable + ", telefonResponsable=" + telefonResponsable + "]";
    }
    
}
