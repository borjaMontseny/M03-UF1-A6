import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {

		/*
		 * Donat un nombre enter positiu, calcula el seu divisor positiu més gran
		 * diferent d'ell mateix
		 */

		System.out.print("Nombre: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int divisor = 1;

		while (divisor < num) {
			if (num / divisor != 0) {
				divisor++;
			} else {
				
			}
		}

		System.out.println("El màxim divisor positiu de " + num + " és: " + divisor);

	}

}
