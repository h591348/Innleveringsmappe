package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		int brutto = parseInt(showInputDialog("Din bruttolønn: "));
		
		double skatt = 0;
		int trinn =0;
		
		if (brutto<=164100) {
			trinn = 0;
			skatt = 0.0;
		}
		else if (brutto>=164101 && brutto<=230950) {
			trinn = 1;
			skatt = brutto * (0.0093);
		}
		
		else if (brutto>=230951 && brutto<=580650) {
			trinn = 2;
			skatt = brutto * (0.0241);
			
		}
		
		else if (brutto>=580651 && brutto<=934050) {
			trinn = 3;
			skatt = brutto * (0.1152);
		}
		
		else {
			trinn = 4;
			skatt = brutto * (0.1452);
		}
			
		System.out.println("Trinn: " + trinn + "\nSkatt: " + skatt);
		
		
	}

}
