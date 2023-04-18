package controller;

import model.mascota.Amfibi;
import model.mascota.Au;
import model.mascota.Mamifer;
import model.mascota.Mascota;
import model.mascota.Peix;
import model.mascota.Reptil;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class controllerMascota {

    private Mascota[] mascotes;

    public controllerMascota() {
        mascotes = new Mascota[10];
    }

    /**
     * metode per sobreescriure un fitxer amb els arbres de l'array
     */
    /**
     * Metode per sobreescriure un fitxer amb les mascotes de l'array
     */
    public void sobreescriureMascotes() {
        String ruta = "src\\fitxers\\mascotes.txt";
        try {
            FileWriter fw = new FileWriter(ruta);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < mascotes.length; i++) {
                if (mascotes[i] instanceof Amfibi) {
                    bw.write("Amfibi, " + mascotes[i].getId() + ", " + mascotes[i].getClient() + ", " +
                            mascotes[i].getNom() + ", " + mascotes[i].getDataNaixement() + ", " + mascotes[i].getSexe()
                            + ", " +
                            mascotes[i].getTipusPell() + ", " + mascotes[i].getTipusRespiracio() + ", " +
                            mascotes[i].getDiagnostics() + ", " + ((Amfibi) mascotes[i]).getColorPell());
                } else if (mascotes[i] instanceof Mamifer) {
                    bw.write("Mamifer, " + mascotes[i].getId() + ", " + mascotes[i].getClient() + ", " +
                            mascotes[i].getNom() + ", " + mascotes[i].getDataNaixement() + ", " + mascotes[i].getSexe()
                            + ", " +
                            mascotes[i].getTipusPell() + ", " + mascotes[i].getTipusRespiracio() + ", " +
                            mascotes[i].getDiagnostics() + ", " + ((Mamifer) mascotes[i]).getTerrestre());
                } else if (mascotes[i] instanceof Peix) {
                    bw.write("Peix, " + mascotes[i].getId() + ", " + mascotes[i].getClient() + ", " +
                            mascotes[i].getNom() + ", " + mascotes[i].getDataNaixement() + ", " + mascotes[i].getSexe()
                            + ", " +
                            mascotes[i].getTipusPell() + ", " + mascotes[i].getTipusRespiracio() + ", " +
                            mascotes[i].getDiagnostics() + ", " + ((Peix) mascotes[i]).getNumUlls());
                } else if (mascotes[i] instanceof Reptil) {
                    bw.write("Reptil, " + mascotes[i].getId() + ", " + mascotes[i].getClient() + ", " +
                            mascotes[i].getNom() + ", " + mascotes[i].getDataNaixement() + ", " + mascotes[i].getSexe()
                            + ", " +
                            mascotes[i].getTipusPell() + ", " + mascotes[i].getTipusRespiracio() + ", " +
                            mascotes[i].getDiagnostics() + ", " + ((Reptil) mascotes[i]).getTePates() + ", "
                            + ((Reptil) mascotes[i]).getNumPates());
                } else if (mascotes[i] instanceof Au) {
                    bw.write("Au, " + mascotes[i].getId() + ", " + mascotes[i].getClient() + ", " +
                            mascotes[i].getNom() + ", " + mascotes[i].getDataNaixement() + ", " + mascotes[i].getSexe()
                            + ", " +
                            mascotes[i].getTipusPell() + ", " + mascotes[i].getTipusRespiracio() + ", " +
                            mascotes[i].getDiagnostics() + ", " + ((Au) mascotes[i]).getVola());
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error al sobreescriure el fitxer");
        }
    }

}
