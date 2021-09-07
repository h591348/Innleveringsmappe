package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;



public class O2 {

	public static void main(String[] args) 
	{
		
		
		
		int poeng = 0;
		
	for (int i = 1; i <= 10; i++) 
	{
			 
			 
		poeng = parseInt(showInputDialog("Din poengsum på prøven: "));
		
		
		char karakter = 'A';
		
	if (poeng>=0 && poeng<=100) {	
		if (poeng<=100 && poeng>=90) {
			karakter = 'A';
			System.out.println("Du fikk karakteren: " + karakter);
		}
		
		else if (poeng<=89 && poeng>=80) {
			karakter = 'B';
			System.out.println("Du fikk karakteren: " + karakter);
		}
		
		else if (poeng<=79 && poeng>=60) {
			karakter = 'C';
			System.out.println("Du fikk karakteren: " + karakter);
		}
		
		else if (poeng<=59 && poeng>=50) {
			karakter = 'D';
			System.out.println("Du fikk karakteren: " + karakter);
		}
		
		else if (poeng<=49 && poeng>=40) {
			karakter = 'E';
			System.out.println("Du fikk karakteren: " + karakter);
		}
		
		else if (poeng<=39 && poeng>=0) {
			karakter = 'F';
			System.out.println("Du fikk karakteren: " + karakter);
		}
		
		else {
			
			karakter = ' ';
			System.out.println("Din poengsum må være mellom 0 og 100!");
		}
		
	}
	else 
		{
		System.out.println("Ikke gyldig poengsum, prøv på nytt!");
		i--;
		}
	}	

	}

}