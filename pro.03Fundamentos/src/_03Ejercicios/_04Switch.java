package _03Ejercicios;

import java.util.Scanner;

public class _04Switch {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int n_mes, n_dia, ano;
		String dia;
		
		System.out.println("Di un numero de mes: ");
		n_mes = tec.nextInt();
		
		System.out.println(nombreMes(n_mes));
		
		System.out.println(estacionDelAnyo(n_mes));
		
		System.out.println("Di un ano: ");
		ano = tec.nextInt();
		System.out.println("Dias: "+diasDelMes(n_mes, ano));
		
		System.out.format("Tiene %d dias %n", diasDelMes(n_mes));
		
		System.out.println("Di un dia de la semana: ");
		dia = tec.next().toLowerCase();
		
		System.out.println(numeroDiaSemana(dia));
		
		System.out.println("Di un dia de la semana en numeros: ");
		n_dia = tec.nextInt();
		System.out.println(nombreDiaSemana(n_dia));
		

	}
	
	public static String nombreMes (int mes) {
		String L_mes = null;
		
		switch(mes) {
		case 1:
			L_mes = "Enero";
			break;
		case 2:
			L_mes = "Febrero";
			break;	
		case 3:
			L_mes = "Marzo";
			break;
		case 4:
			L_mes = "Abril";
			break;
		case 5:
			L_mes = "Mayo";
			break;
		case 6:
			L_mes = "Junio";
			break;
		case 7:
			L_mes = "Julio";
			break;
		case 8:
			L_mes = "Agosto";
			break;
		case 9:
			L_mes = "Septiembre";
			break;
		case 10:
			L_mes = "Octubre";
			break;
		case 11:
			L_mes = "Noviembre";
			break;
		case 12:
			L_mes = "Diciembre";
			break;
		}
		
		return L_mes;
	}
	
	public static String estacionDelAnyo (int mes) {
		String estacion = null;
		
		switch(mes) {
		case 1:
		case 2:
		case 12:
			estacion = "Invierno";
			break;
		
		case 3:
		case 4:
		case 5:
			estacion = "Primavera";
			break;
		
		case 6:
		case 7:
		case 8:
			estacion = "Verano";
			break;
		
		case 9:
		case 10:
		case 11:
			estacion = "Otono";
			break;
		}
		
		return estacion;
		
		
		
	}

	public static int numeroDiaSemana (String dia) {
		int n = 0;
		
		switch(dia) {
		case "lunes":
			n = 1;
			break;
		case "martes":
			n = 2;
			break;
		case "miercoles":
			n = 3;
			break;
		case "jueves":
			n = 4;
			break;
		case "viernes":
			n = 5;
			break;
		case "sabado":
			n = 6;
			break;
		case "domingo":
			n = 7;
			break;
		}
		
		return n;
	}

	public static String nombreDiaSemana (int dia) {
		String dia_l = null;
		switch(dia) {
			case 1:
				dia_l = "Lunes";
			case 2:
				 dia_l = "Martes";
				break;
			case 3:
				dia_l = "Miercoles";
				break;
			case 4:
				dia_l = "Jueves";
				break;
			case 5:
				dia_l = "Viernes";
				break;
			case 6:
				dia_l = "Sabado";
				break;
			case 7:
				dia_l = "Domingo";
				break;
		}
		
		return dia_l;
		
	}

	public static int diasDelMes(int mes) {
		int dias = 0;
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		
		case 2:
			dias = 28;
			break;
		
		}
		
		return dias;
		
	}
	
	public static int diasDelMes(int mes, int anyo) {
		boolean bisiesto;
		int dias;
		
		if(anyo%4 == 0 && (anyo%4 == 0 || anyo%100 != 0)) {
			bisiesto = true;
		}else {
			bisiesto = false;
			
		}
		
		if(mes == 2 && bisiesto == true) {
			return dias = 29;
			
		}else {
			return dias = diasDelMes(mes);
		}
		
		
	}
	
	
}
