package _03Ejercicios;

import java.util.Scanner;

public class _26Mes {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int mes, dia;
		String m;
		
		System.out.print("Di un mes: ");
		mes = tec.nextInt();
		
		dia = diasDe(mes);
		System.out.format("Tiene %d dias", dia);
		
		
		System.out.print("Di un mes: ");
		m = tec.next().toLowerCase();
		
		dia = diasDe(m);
		System.out.format("Tiene %d dias", dia);
		
		
		
		

	}
	
	/**
	 * Te devuelve los dias que tiene el mes
	 * @param mes El mes del año que queremos
	 * @return En caso de no ponerse el mes correcto
	 */
	public static int diasDe(int mes) {
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;
		}else if(mes == 2) {
			return 28;
		}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		}else {
			return 0;
		}
		
	}
	
	
	/**
	 * Te devuelve los dias que tiene el mes
	 * @param mes El mes del año que queremos
	 * @return En caso de no ponerse el mes correcto
	 */
	public static int diasDe(String mes) {
		if(mes.equals("enero") == true || mes.equals("marzo") == true || mes.equals("mayo") == true || mes.equals("julio") == true || mes.equals("agosto") == true || mes.equals("octubre") == true ||mes.equals("diciembre") == true) {
			return 31;
		}else if(mes.equals("febrero") == true) {
			return 28;
		}else if(mes.equals("abril") == true) {
			return 30;
		}else {
			return 0;
		}
	}




}
