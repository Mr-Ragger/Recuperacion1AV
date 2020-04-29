
public class Boletin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "as15j7@21";
		int suma;
		
		suma = obtenerResultado(texto);
	
		System.out.println("la cadena a sumar es " + texto);
		System.out.println("El resultado da " + suma);
		
		
		
		
	}
	
	public static int obtenerResultado(String texto) {
		int patata = 0;
		
		for(int i = 0;i<texto.length();i++) {
			char letra = texto.charAt(i);
			if(Character.isDigit(letra)) {
				patata += Character.getNumericValue(letra);
				
			}
		}
		
		return patata;
	}
}
