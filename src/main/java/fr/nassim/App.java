package fr.nassim;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random randomNumber = new Random();

        int chiffreAleatoire = randomNumber.nextInt(100);
        int partieGagnee = 0;
        int nbPartiesJouees = 10000;
        System.out.println("Lancement de la simulation de " + nbPartiesJouees + " parties.");

        for (int i = 0; i < nbPartiesJouees; i++) {
            int nbDeviner = randomNumber.nextInt(100);
            if (nbDeviner == chiffreAleatoire) {
                partieGagnee = partieGagnee + 1;
            }
        }

        // int moyenneReussite = partieGagnee / nbPartiesJouees * 100;
        System.out.println("Vous avez gagné " + partieGagnee + " parties sur " + nbPartiesJouees + " parties jouées");
    }
}
