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
    }

    public String horaire(){
        return "";
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
