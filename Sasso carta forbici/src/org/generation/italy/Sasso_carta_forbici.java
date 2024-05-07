package org.generation.italy;

import java.util.Scanner;    
import java.util.Random;

public class Sasso_carta_forbici {

	public static void main(String[] args) {
		int punteggioCom = 0, punteggioUte = 0; //Dichiarare varia
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String sceltaComputer; 
		String sceltaUtente;
		String[] rps = {"sasso", "carta", "forbici"};
		
		do {
			do {
				System.out.println("Scegli tra sasso,carta,forbici\n");
				sceltaUtente = sc.nextLine();
				sc.nextLine();
				
				if (!sceltaUtente.equalsIgnoreCase("sasso") && !sceltaUtente.equalsIgnoreCase("carta") && !sceltaUtente.equalsIgnoreCase("forbici")) {
					System.out.println("scelta invalida,riprova ");
				}
			} while (!sceltaUtente.equalsIgnoreCase("sasso") && !sceltaUtente.equalsIgnoreCase("carta") && !sceltaUtente.equalsIgnoreCase("forbici"));
		    
			sceltaComputer = rps[r.nextInt(3)];
			
			System.out.println("Comuputer sceglie " + sceltaComputer);
			
			if (sceltaComputer.equalsIgnoreCase(sceltaUtente)) {
				System.out.println("Pareggio");
			} 
			else if (sceltaComputer.equals("sasso") && sceltaUtente.equals("forbici") ||
					 sceltaComputer.equals("carta") && sceltaUtente.equals("sasso") ||
					 sceltaComputer.equals("forbici") && sceltaUtente.equals("carta")){
				System.out.println("Vince Computer");
				punteggioCom += 1;
			}
			else {
				punteggioUte += 1;
			}
			
			System.out.println("Punteggio è : Computer :"+ punteggioCom + " Utente: " + punteggioUte);
			
		} while (punteggioCom <5 && punteggioUte < 5);
        
		sc.close();
		System.out.println("partita finita");
	}

}
