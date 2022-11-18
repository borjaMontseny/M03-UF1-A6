import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Donats dos nombres enters n1 i n2 amb n1 < n2 i un nombre enter x, escriu x
		 * nombres enters aleatoris dins l’interval [n1 , n2].
		 */

		System.out.print("N1: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.print("N2:");
		int n2 = sc.nextInt();

		if (n1 < n2) {
			System.out.print("Un enter: ");
			int enter = sc.nextInt();

			sc.close();

			System.out.println("");

			for (int i = 0; i < enter; i++) {
				System.out.println(Math.round(Math.random() * (n2 - n1) + n1));
			}
		} else {
			System.out.println("\nError al introduir dades. Reinicia el programa");
		}

	}

}
