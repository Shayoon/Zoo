package fr.animal;

public class Chat extends Animal {

    private String nom;

    public Chat(String nom) {
        super(nom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void allerALaLittiere(){
        System.out.println("Le chat va à la littiere");
    }

}
