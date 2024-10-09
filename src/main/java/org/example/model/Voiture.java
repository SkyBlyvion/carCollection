package org.example.model;

public class Voiture {

    private String marque;
    private String modele;
    private String imageName;
    private Boolean isOccas;
    private int nbrPorte;
    private int nbrVitesse;
    private int stock;
    private int id;

    public Voiture() {

    }


    public Voiture(String marque, String modele, String imageName, Boolean isOccas, int nbrPorte, int nbrVitesse, int stock) {
        this.marque = marque;
        this.modele = modele;
        this.imageName = imageName;
        this.isOccas = isOccas;
        this.nbrPorte = nbrPorte;
        this.nbrVitesse = nbrVitesse;
        this.stock = stock;
    }

    public Voiture( int id, String marque, String modele, int stock, int nbrVitesse, int nbrPorte, Boolean isOccas, String imageName) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.stock = stock;
        this.nbrVitesse = nbrVitesse;
        this.nbrPorte = nbrPorte;
        this.isOccas = isOccas;
        this.imageName = imageName;
    }

    public int getId() {
        return id;
    }




    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Boolean getOccas() {
        return isOccas;
    }

    public void setOccas(Boolean occas) {
        isOccas = occas;
    }

    public int getNbrVitesse() {
        return nbrVitesse;
    }

    public void setNbrVitesse(int nbrVitesse) {
        this.nbrVitesse = nbrVitesse;
    }

    public int getNbrPorte() {
        return nbrPorte;
    }

    public void setNbrPorte(int nbrPorte) {
        this.nbrPorte = nbrPorte;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
