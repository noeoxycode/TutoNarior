package org.example;

public abstract class Vehicule {
    private int prix;
    String nom;
    String marque;

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPrix() {
        return prix;
    }

    void conduire(){
        demarrer();
        System.out.println("Je conduis mon véhicule " + this.nom + ".");
    }

    void demarrer(){
        System.out.println("Je démarre mon véhicule.");
    }

    public abstract void presentation();
}
