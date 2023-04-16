package org.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int prix = 12000;
        String marque = "Peugeot";
        ArrayList<String> listeNoms = new ArrayList<String>();
        listeNoms.add("peugeot 206");
        listeNoms.add("peugeot 306");
        listeNoms.add("peugeot 406");
        listeNoms.add("peugeot 506");
        Random rand = new Random();
        int randomIndex = rand.nextInt(listeNoms.size());
        String nom = listeNoms.get(randomIndex);
        Voiture maVoiture = new Voiture();
        maVoiture.conduire();
        maVoiture.derrapageAuFreinAMain();




        Moto maMoto = new Moto();
        maMoto.roueArriere();
        int prixBis = 1;
        String prixBisStringVersion = String.valueOf(prixBis);
        Moto motoAvecParams = new Moto(Integer.parseInt(prixBisStringVersion), "coucou", "coucou");

    }
}
