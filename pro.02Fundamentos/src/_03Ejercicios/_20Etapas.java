package _03Ejercicios;

import java.util.Scanner;

public class _20Etapas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int n_personas, edad_persona, anciano = 0, vejez = 0, adulto = 0, adolescente = 0, pubertad = 0, infancia = 0;
		double contador = 0, porcen_anciano, porcen_vejez, porcen_adulto, porcen_adolescente, porcen_pubertad, porcen_infancia;
		System.out.println("Di un numero de personas: ");
		n_personas = tec.nextInt();
		
		while(contador != n_personas) {
			contador += 1;
			System.out.print("Indique la edad de la persona "+(int)contador+": ");
			edad_persona = tec.nextInt();
			
			if(edad_persona > 70) {
				anciano += 1;
			}else if(edad_persona > 55) {
				vejez += 1;
			}else if(edad_persona > 21){
				adulto += 1;
			}else if(edad_persona > 14) {
				adolescente += 1;
			}else if(edad_persona > 11) {
				pubertad += 1;
			}else {
				infancia += 1; 
			}
		}
	
		porcen_anciano = (anciano*100)/contador;
		porcen_vejez = (vejez*100)/contador;
		porcen_adulto = (adulto*100)/contador;
		porcen_adolescente = (adolescente*100)/contador;
		porcen_pubertad = (pubertad*100)/contador;
		porcen_infancia = (infancia*100)/contador;
		
		//System.out.format("Infancia: %f % %nPubertad: %f % %nAdolescente: %f % %nAdulto: %f % %nVejez: %f % %nAnciano: %f %",porcen_infancia,porcen_pubertad,porcen_adolescente,porcen_adulto,porcen_vejez,porcen_anciano);
		System.out.format("%nInfancia:      %6.2f %%", porcen_infancia);
		System.out.format("%nPubertad:    %6.2f %%", porcen_pubertad);
		System.out.format("%nAdolescente: %6.2f %%", porcen_adolescente);
		System.out.format("%nAdulto:      %6.2f %%", porcen_adulto);
		System.out.format("%nVejez:       %6.2f %%", porcen_vejez);
		System.out.format("%nAnciano:     %6.2f %%", porcen_anciano);
	}

}
