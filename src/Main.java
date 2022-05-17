
import fr.animal.*;
import fr.zoo.Aquarium;
import fr.zoo.Cage;
import fr.zoo.Voliere;

public class Main {
    public static void main(String[] args) {

        try {
            Voliere voliere = new Voliere();
            Aigle aigle = new Aigle("Damien");
            voliere.ajouterAnimal(aigle);
            Dauphin dauphin = new Dauphin("Patrick");
            System.out.println(Animal.getCompteur());
            Aquarium aquarium = new Aquarium();
            aquarium.ajouterAnimal(dauphin);
            System.out.println(dauphin.getClass());
            Martinpecheur martinpecheur = new Martinpecheur("Martin");
            aquarium.ajouterAnimal(martinpecheur);
            voliere.ajouterAnimal(martinpecheur);
            Cage cage = new Cage();
            Chat chat = new Chat("Phillipe");
            cage.ajouterAnimal(chat);
            cage.nbAnimaux();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
