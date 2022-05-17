package fr.zoo;

import fr.animal.Animal;
import fr.interfaces.Nageur;
import fr.interfaces.Volatile;

import java.util.ArrayList;
import java.util.List;

public class Cage {

    private List<fr.animal.Animal> animaux;

    public Cage(){
        animaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) throws Exception {
        if(animal instanceof Nageur || animal instanceof Volatile) throw new Exception("Non");
        else animaux.add(animal);
    }

    public void nbAnimaux(){
        System.out.printf("Il y a %d animal/aux dans cette cage, pour un total de %d animaux dans le zoo",animaux.size(),Animal.getCompteur());
    }
}
