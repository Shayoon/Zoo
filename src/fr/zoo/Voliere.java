package fr.zoo;

import fr.animal.Animal;
import fr.interfaces.Volatile;

import java.util.ArrayList;
import java.util.List;

public class Voliere {

    private List<Volatile> animaux;

    public Voliere() {
        animaux = new ArrayList<>();
    }


    public void ajouterAnimal (Volatile animal){
        animaux.add(animal);
    }

    public void nbAnimaux(){
        System.out.printf("Il y a %d animal/aux dans cette voliere, pour un total de %d animaux dans le zoo",animaux.size(), Animal.getCompteur());
    }
}
