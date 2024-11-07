package ch.heigvd.poo.personne;
import ch.heigvd.poo.Groupe;

public class Etudiant extends Personne {
    private int matricule;
    private Groupe groupe = null;

    public Etudiant(String nom, String prenom, int matricule) {
        super(nom, prenom);
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Etud. " + super.toString() + " (#" + matricule + ")" + (groupe != null ? " - " + groupe.nom() : "");
    }
}
