import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Donats dos nombres enters positius a i b, calcula el resultat de realitzar la
		 * seva multiplicació a partir de sumes.
		 */

		System.out.print("N1: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.print("N2: ");
		int n2 = sc.nextInt();
		sc.close();

		int n1Suma = 0;
		int n2Suma = 0;

		while (n1Suma != n1) {
			n1Suma = n1Suma + n1;
		}

		while (n2Suma != n2) {
			n2Suma = n2Suma + n2;
		}

		int resultatSuma = n1Suma + n2Suma;

		System.out.println(n1 * n2);

		System.out.println(resultatSuma);

	}

}
