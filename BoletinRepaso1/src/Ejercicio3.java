import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String miArray[] = new String[3];

		guardarCaracteres(miArray);

	}
	
	public static void guardarCaracteres(String[] miArray) {
		 Scanner sc = new Scanner(System.in);
					 
		 for (int i = 0; i<miArray.length; i++) {
			 System.out.println("introduce la cadena (" + (i+1) + "/" + miArray.length + "): " );
			 miArray[i] = sc.next();
		 }
		 sc.close();
	}
}
