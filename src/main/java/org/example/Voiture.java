package org.example;

public class Voiture extends Vehicule {

    public void presentation() {
        System.out.println("coucou je suis une voiture");
    }

    public void derrapageAuFreinAMain(){
        this.conduire();
        this.demarrer();
        System.out.println("youhou je derrape au frein à main");
    }

    public Voiture() {
        this.setPrix(10);
        this.nom = "mon nom";
        this.marque = "audi";
    }
}
