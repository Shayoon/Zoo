package fr.animal;

import fr.interfaces.Nageur;
import fr.interfaces.Volatile;

public class Martinpecheur extends Animal implements Volatile, Nageur {

    public Martinpecheur(String nom) {
        super(nom);
    }


    @Override
    public void nager() {
        System.out.println("Le Martinpecheur nage");
    }

    @Override
    public void voler() {
        System.out.println("Le Martinpecheur vole");
    }
}
