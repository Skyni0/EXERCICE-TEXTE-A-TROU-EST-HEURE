package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        	
		Scanner clavier = new Scanner(System.in);

	System.out.print("Entrez Heure : ");
 	int heure = clavier.nextInt() ;

	System.out.print("Entrez Minute : ");
	int min = clavier.nextInt();

	System.out.print("Entrez Seconde : ");
	int sec = clavier.nextInt();

	int heure1= 3600;
	int min1 = min= 60;
	int sec1 = sec = 1;

		int total = heure*heure1 + min*min1 + sec*sec1;

	System.out.print("Il s'est écoulé "+ total + " secondes depuis minuit.");

    
    }


    
}
