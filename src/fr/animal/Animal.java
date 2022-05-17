package fr.animal;

public class Animal implements fr.interfaces.Animal {

    private static int compteur;
    private String nom;

    public Animal(String nom) {
        this.nom = nom;
        compteur++;
    }

    @Override
    public void manger() {
        System.out.println("L'animal mange");
    }

    @Override
    public void dormir() {
        System.out.println("L'animal dort");
    }

    public static int getCompteur() {
        return compteur;
    }
}
