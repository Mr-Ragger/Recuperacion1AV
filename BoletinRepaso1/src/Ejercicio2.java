
public class Ejercicio2 {

	public static void main(String[] args) {
		
		char miArray[] = new char[6];
		
		miArray[0] = '3';
		miArray[1] = '4';
		miArray[2] = 's';
		miArray[3] = 'a';
		miArray[4] = '¡';
		miArray[5] = '=';

		clasificarArray(miArray);
	}
	
	public static void clasificarArray(char[] miArray) {
		String numeros = "";
		String letras = "";
		String simbolos = "";
		
		
		for (int i = 0; i<miArray.length; i++) {
			char caracter = miArray[i];
			if(Character.isDigit(caracter)){
				numeros += caracter;
			}else if(Character.isLetter(caracter)) {
				letras += caracter;
			}else {
				simbolos += caracter;
			}
				
		}
		
		System.out.println("Los numeros son " + cadenaPorLetras(numeros));
		System.out.println("Las letras son " + cadenaPorLetras(letras));
		System.out.println("Los simbolos son " + cadenaPorLetras(simbolos));
		
	}
	
		
	public static String cadenaPorLetras(String cadena) {
	    String result = "[ ";
	    for(int i = 0; i<cadena.length(); i++)
	        if(i == cadena.length() - 1)
	            result += "\'" + cadena.charAt(i) + "\' ]";
	        else
	            result += "\'" + cadena.charAt(i) + "\', ";
	    return result;
	}
}
	
