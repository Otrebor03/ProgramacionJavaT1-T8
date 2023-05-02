package _03Ejercicios;

public class _01ValidarHora {

	public static void main(String[] args) {
		System.out.println(esHoraValida("10:30:43"));
		System.out.println(esHoraValida("30:20:10"));
		System.out.println(esHoraValida("wwww"));
		System.out.println(esHoraValida("10::"));
		System.out.println(esHoraValida(":"));
		System.out.println(esHoraValida("-***30:20:10:45"));
		System.out.println(esHoraValida("000"));
		System.out.println(esHoraValida("sdjfhshfÉ+ÁWEFQ+ÑF"));
		
		
	}
	
	public static boolean esHoraValida(String h) {
		try {
			int posSeparador1 = h.indexOf(':'), posSeparador2 = h.lastIndexOf(':');
			
			String hh = h.substring(0, posSeparador1);
			String mm = h.substring(posSeparador1+1, posSeparador2);
			String ss = h.substring(posSeparador2+1);
			
			int numHora = Integer.parseInt(hh);
			int numMin = Integer.parseInt(mm);
			int numSeg = Integer.parseInt(ss);
			
			if(numHora >= 0 && numHora <= 23 && numMin >= 0 && numMin <= 59 && numSeg >= 0 && numSeg <= 59) {
				return true;
			}else {
				return false;
			}
		}catch(StringIndexOutOfBoundsException e) {
			return false;
		}catch (NumberFormatException e) {
			return false;
		}
		
	}

}
