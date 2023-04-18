package Arbres.src.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.File;

import Arbres.src.model.arbre.Arbre;
import Arbres.src.model.arbre.Caduca;
import Arbres.src.model.arbre.Conifers;
import Arbres.src.model.arbre.Fruitals;
import Arbres.src.model.arbre.Perenne;
import Arbres.src.model.ennumerats.ColorFullaEnum;
import Arbres.src.model.ennumerats.ColorTroncEnum;
import Arbres.src.model.ennumerats.MesEnum;
import Arbres.src.model.ennumerats.TipusTroncEnum;

public class arbreController {

    private Arbre[] arbres;

    Scanner sc = new Scanner(System.in);

    public arbreController() {
        arbres = new Arbre[1];
    }
    
    /**
     * metode per sobreescriure un fitxer amb els arbres de l'array
     */
    public void sobreescriureArbres() {
        String ruta = "src\\fitxers\\arbres.txt";
        try {
            FileWriter fw = new FileWriter(ruta);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < arbres.length; i++) {
                if (arbres[i] instanceof Caduca) {
                    bw.write("Caduca, " + arbres[i].getId() + ", " + arbres[i].getBosc() + ", " +
                        arbres[i].getCodi() + ", " + arbres[i].getDataTransplant() + ", " + arbres[i].getAlçada() + ", " + 
                        arbres[i].getAmplada() + ", " + arbres[i].getTipusTronc() + ", " + arbres[i].getColorTronc() + ", " + 
                        ((Caduca) arbres[i]).getDuressaTronc() + ", " + ((Caduca) arbres[i]).getMesCaigudaFulles());
                } else if (arbres[i] instanceof Conifers) {
                    bw.write("Conifers, " + arbres[i].getId() + ", " + arbres[i].getBosc() + ", " +
                        arbres[i].getCodi() + ", " + arbres[i].getDataTransplant() + ", " + arbres[i].getAlçada() + ", " + 
                        arbres[i].getAmplada() + ", " + arbres[i].getTipusTronc() + ", " + arbres[i].getColorTronc() + ", " + 
                        ((Conifers) arbres[i]).getColorFulla());
                } else if (arbres[i] instanceof Fruitals) {
                    bw.write("Fruitals, " + arbres[i].getId() + ", " + arbres[i].getBosc() + ", " +
                        arbres[i].getCodi() + ", " + arbres[i].getDataTransplant() + ", " + arbres[i].getAlçada() + ", " + 
                        arbres[i].getAmplada() + ", " + arbres[i].getTipusTronc() + ", " + arbres[i].getColorTronc() + ", " + 
                        ((Fruitals) arbres[i]).getFlorAmbPetals() + ", " + ((Fruitals) arbres[i]).getEsDolça());
                } else if (arbres[i] instanceof Perenne) {
                    bw.write("Perenne, " + arbres[i].getId() + ", " + arbres[i].getBosc() + ", " +
                        arbres[i].getCodi() + ", " + arbres[i].getDataTransplant() + ", " + arbres[i].getAlçada() + ", " + 
                        arbres[i].getAmplada() + ", " + arbres[i].getTipusTronc() + ", " + arbres[i].getColorTronc() + ", " + 
                        ((Perenne) arbres[i]).getOlor());
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error al sobreescriure el fitxer");
        }
}

    /**
     * metode per spasar les dades de el fitxer a l'array
     */
    public void llegirArbres() {
        String ruta = "src\\fitxers\\arbres.txt";
        int i = 0; // inicializar el índice del array
        try {
            Scanner sc = new Scanner(new File(ruta));
            while (sc.hasNextLine()) {
                String[] dades = sc.nextLine().split(", ");
                if (dades[0].equals("Caduca")) {
                    arbres[i] = new Caduca(Integer.parseInt(dades[1]), dades[2], dades[3], LocalDate.parse(dades[4]), Integer.parseInt(dades[5]), Integer.parseInt(dades[6]), TipusTroncEnum.valueOf(dades[7]), ColorTroncEnum.valueOf(dades[8]), dades[9], Integer.parseInt(dades[10]), MesEnum.valueOf(dades[11]));
                } else if (dades[0].equals("Conifers")) {
                    arbres[i] = new Conifers(Integer.parseInt(dades[1]), dades[2], dades[3], LocalDate.parse(dades[4]), Integer.parseInt(dades[5]), Integer.parseInt(dades[6]), TipusTroncEnum.valueOf(dades[7]), ColorTroncEnum.valueOf(dades[8]), dades[9], ColorFullaEnum.valueOf(dades[10]));
                } else if (dades[0].equals("Fruitals")) {
                    arbres[i] = new Fruitals(Integer.parseInt(dades[1]), dades[2], dades[3], LocalDate.parse(dades[4]), Integer.parseInt(dades[5]), Integer.parseInt(dades[6]), TipusTroncEnum.valueOf(dades[7]), ColorTroncEnum.valueOf(dades[8]), dades[9], Boolean.parseBoolean(dades[10]), Boolean.parseBoolean(dades[11]));
                } else if (dades[0].equals("Perenne")) {
                    arbres[i] = new Perenne(Integer.parseInt(dades[1]), dades[2], dades[3], LocalDate.parse(dades[4]), Integer.parseInt(dades[5]), Integer.parseInt(dades[6]), TipusTroncEnum.valueOf(dades[7]), ColorTroncEnum.valueOf(dades[8]), dades[9], Boolean.parseBoolean(dades[10]));
                }
                i++; // incrementar el índice
            }
            sc.close();
            System.out.println("Les dades s'han carregat correctament");
        } catch (Exception e) {
            System.out.println("Error al carregar el fitxer");
        }
    }
    

    private void afegirArbreArray() {

    }

}