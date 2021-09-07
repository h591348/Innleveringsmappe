package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;



public class O3 {

	
	

		  public static void main(String[] args) {
			  
			  int n = parseInt(showInputDialog("Skriv inn heltall over 0"));
			  
			  int fakultet = 1;
			  if (n>0) {
				
			
			  while(n>1){
			     fakultet *=n;
			     n--;
			  }
			  System.out.println(fakultet);
			  }
			  else {
				System.out.println("Tallet må være over 0");
			}
			
				  
			}
			}