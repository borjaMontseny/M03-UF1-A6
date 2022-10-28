import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Donats dos nombres enters n1 i n2 amb n1 < n2 , escriu tots els nombres
		 * enters dins l’interval [n1, n2] en ordre decreixent.
		 */

		System.out.print("N1: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.print("N2 (més gran que N1): ");
		int n2 = sc.nextInt();
		sc.close();

		System.out.println("\nInterval: ");
		System.out.println(n2);
		while (n1 < n2) {
			n2 = n2 - 1;
			System.out.println(n2);
		}

	}

}
