package model.client;

import model.ennumerats.SexeEnum;
import model.mascota.Mascota;

public class Client {
    
    private int id;
    private String nom;
    private String cognom;
    private String telefon;
    private SexeEnum sexe;
    private Mascota[] mascotes;

    public Client(int id, String nom, String cognom, String telefon, SexeEnum sexe, Mascota[] mascotes) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.telefon = telefon;
        this.sexe = sexe;
        this.mascotes = mascotes;
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

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public SexeEnum getSexe() {
        return sexe;
    }

    public void setSexe(SexeEnum sexe) {
        this.sexe = sexe;
    }

    public Mascota[] getMascotes() {
        return mascotes;
    }

    public void setMascotes(Mascota[] mascotes) {
        this.mascotes = mascotes;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", cognom=" + cognom + ", telefon=" + telefon + ", sexe=" + sexe + ", mascotes=" + mascotes + '}';
    }

}
