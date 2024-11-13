package ch.heigvd.poo;

import ch.heigvd.poo.personne.Etudiant;

public class Groupe {
    private int numero;
    private String orientation;
    private int trimestre;
    private Etudiant[] etudiants;
    private Lecon[] lecons;

    public Groupe(int numero, String orientation, int trimestre, Etudiant... etudiants) {
        this.numero = numero;
        this.orientation = orientation;
        this.trimestre = trimestre;
        this.etudiants = etudiants;

        for (int i = 0; i < etudiants.length; i++) {
            etudiants[i].setGroupe(this);
        }
    }

    public String horaire(){
        return Lecon.horaire(lecons);
    }

    public String nom(){
        return orientation + trimestre + "-" + numero;
    }

    public int nombreEtudiants(){
        return etudiants.length;
    }

    public void definirLecons(Lecon... lecons){
        this.lecons = lecons;
    }
}
