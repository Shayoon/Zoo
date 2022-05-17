package fr.zoo;

import fr.animal.Animal;
import fr.interfaces.Nageur;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Nageur> animaux;

    public Aquarium() {
        animaux = new ArrayList<>();
    }


    public void ajouterAnimal (Nageur animal){
        animaux.add(animal);
    }

    public void nbAnimaux(){
        System.out.printf("Il y a %d animal/aux dans cet aquarium, pour un total de %d animaux dans le zoo",animaux.size(), Animal.getCompteur());
    }

}
