package fr.animal;

import fr.interfaces.Nageur;

public class Dauphin extends Animal implements Nageur {

    public Dauphin(String nom) {
        super(nom);
    }


    @Override
    public void nager() {
        System.out.println("Le dauphin nage");
    }
}
