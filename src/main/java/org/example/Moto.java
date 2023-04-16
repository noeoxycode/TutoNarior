package org.example;

public class Moto extends Vehicule {
    public void presentation() {
        System.out.println("coucou je suis une moto");
    }

    public void roueArriere(){
        this.demarrer();
        this.conduire();
        System.out.println("youhou je fais une roue arriere");
    }

    public Moto() {
        this.setPrix(10);
        this.nom = "ma moto nom";
        this.marque = "yamaha";
    }

    public Moto(int prix, String nom, String marque) {
        this.setPrix(prix);
        this.nom = nom;
        this.marque = marque;
    }
}
