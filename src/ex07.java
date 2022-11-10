import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Donats el primer número, la diferència i el nombre de números d'una
		 * progressió aritmètica, escriu els seus elements, la seva suma i la seva
		 * mitjana aritmètica.
		 */

		System.out.print("Primer número: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.print("Segon número: ");
		int n2 = sc.nextInt();
		sc.close();

		System.out.println("\nDiferència:\n" + (n1 - n2));

		int contador = 0;

		System.out.println("Nombre de números: " + contador);

	}

}
