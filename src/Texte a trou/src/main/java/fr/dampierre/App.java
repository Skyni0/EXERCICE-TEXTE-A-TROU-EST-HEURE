package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

    
        Scanner clavier = new Scanner(System.in);

    System.out.print("(NOM1)");
        var text1 = clavier.next();

        System.out.print("(NOMBRE)");
        double nombreNom = clavier.nextDouble();

        System.out.print("(NOM2)");
        var text2 = clavier.next();

        System.out.print("(ADJECTIF)");
        var adjectif = clavier.next();



        System.out.print("Il était une fois un " +text1);
        System.out.print(" qui avait " +nombreNom);
        System.out.print(" " +text2);
        System.out.print(". Cela le rendait très " +adjectif);

    }
    
}
