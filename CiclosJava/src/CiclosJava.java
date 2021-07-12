import java.util.Scanner;
public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Crear un metodo que reciba por parametro un número y nos muestre la 
		 * tabla de multiplicar de ese número
		 * Ejemplo:
		 * 1 X 1 = 1
		 * 1 X 2 = 2
		 * 1 X 3 = 3
		 * ...
		 * 1 X 10 = 10
		*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("tabla de multiplicar: ");
		int n= teclado.nextInt();
		
		for(int i=1; i<11; i++) {
			System.out.println(n + " x " + i + " = " + (i * n));
		}
	}

}
