package fr.animal;

import fr.interfaces.Volatile;

public class Aigle extends Animal implements Volatile {

    public Aigle(String nom) {
        super(nom);
    }

    @Override
    public void voler() {
        System.out.println("L'aigle vole");
    }
}
