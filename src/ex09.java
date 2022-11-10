import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Donat un nombre enter positiu i un dígit, calcula quantes vegades el dígit
		 * apareix dins del nombre.
		 */

		System.out.print("Nombre: ");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String nString = Integer.toString(n);

		System.out.print("Dígit a buscar: ");
		char digit = sc.next().charAt(0);
		sc.close();

		int contador = 0;

		for (int i = 0; i < nString.length(); i++) {

			if (digit == nString.charAt(i)) {
				contador++;
			}

		}

		System.out.println("\nEl dígit " + digit + " apareix " + contador + " vegades a " + n);

	}

}
