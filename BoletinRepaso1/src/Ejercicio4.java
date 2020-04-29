import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
		
		int[] miArray= new int[3];
		miArray[0] = 3;
		miArray[1] = 4;
		miArray[2] = 6;
		
		menuOpciones(miArray);

	}
	
	public static void menuOpciones(int[] miArray) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. sumar todos los valores del array");
		System.out.println("2. restar todos los valores del array");
		System.out.println("3. multiplicar todos los valores del array");
		
		int opcion = sc.nextInt();
		
		switch (opcion) {
			case 1: 
				calcularSuma(miArray);
				break;
			case 2:
				calcularResta(miArray);
				break;
			case 3:
				calcularMultiplicacion(miArray);
				break;
			default:
				System.out.println("valor no definido");
				break;
		}
		
		sc.close();
	}
	public static void calcularSuma(int[] miArray) {
		int suma = 0;
		for(int i = 0; i<miArray.length; i++) {
			suma += miArray[i];
		}
		System.out.println("El resultado de la suma es " + suma);
	}
	public static void calcularResta(int[] miArray) {
		int resta = 0;
		for(int i = 0; i<miArray.length; i++) {
			resta -= miArray[i];
		}
		System.out.println("El resultado de la resta es " + resta);
	}
	public static void calcularMultiplicacion(int[] miArray) {
		int multi = 1;
		for(int i = 0; i<miArray.length; i++) {
			multi *= miArray[i];
		}
		System.out.println("El resultado de la multiplicacion es " + multi);
	}
}

