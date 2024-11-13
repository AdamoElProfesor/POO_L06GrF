package ch.heigvd.poo;
import ch.heigvd.poo.personne.*;

public class Main {
    public static void main(String[] args) {


        Professeur danielRossier = new Professeur("Daniel", "Rossier", "DRE");
        Professeur pierDonini = new Professeur("Pier", "Donini", "PDO");


        Lecon syeG01 = new Lecon("SYE", 1,1,2,"G01", danielRossier);
        Lecon sye2A09 = new Lecon("SYE", 4,3,2,"A09", danielRossier);
        Lecon poo1 = new Lecon("POO", 3,6,2,"H02", pierDonini);
        Lecon poo2 = new Lecon("POO", 4,6,2,"H02", pierDonini);
        Lecon poo3 = new Lecon("POO", 4,8,2,"H02", pierDonini);
        Lecon tic = new Lecon("TIC", 2,1,2,"F06");

        danielRossier.setLecons(syeG01, sye2A09);
        pierDonini.setLecons(poo1, poo2, poo3);

        Etudiant johnLennon = new Etudiant("John", "Lennon",1234);
        Etudiant paulMcCartney = new Etudiant("Paul", "Mc Cartney",2341);
        Etudiant ringoStarr = new Etudiant("Ringo", "Starr", 3241);
        Etudiant georgeHarisson = new Etudiant("George", "Harisson", 4321);
        Etudiant rogerWaters = new Etudiant("Roger", "Waters", 1324);
        Etudiant davidGilmour = new Etudiant("David", "Gilmour", 4312);

        Groupe il6_1 = new Groupe(1,"IL", 1, johnLennon, paulMcCartney, ringoStarr, georgeHarisson);
        Groupe si6_1 = new Groupe(2,"SI", 1, rogerWaters, davidGilmour);

        il6_1.definirLecons(syeG01, sye2A09, poo1, poo2, poo3, tic);
        si6_1.definirLecons(poo1, poo2, poo3);

        Personne[] personnes = {danielRossier, pierDonini, johnLennon, paulMcCartney, ringoStarr, georgeHarisson, rogerWaters, davidGilmour};

        for (int i = 0; i < personnes.length; i++) {
            System.out.println(personnes[i]);
        }

        System.out.println(il6_1.horaire());
        System.out.println(pierDonini.horaire());

    }
}