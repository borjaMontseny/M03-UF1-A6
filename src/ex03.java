import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Donats dos nombres enters positius n1 i n2 amb n1 < n2, escriu tots els
		 * nombres enters que són múltiples de n1 més petits o iguals a n2 en ordre
		 * creixent.
		 */

		System.out.print("N1: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.print("N2: ");
		int n2 = sc.nextInt();
		sc.close();

		if (n1 < n2) {
			System.out.println("\nNombres enters múltiples de n1 més petits o iguals a n2:");
			int i = 1;
			while (i <= n2) {
				if (i % n1 == 0) {
					System.out.println(i);
					i++;
				} else {
					i++;
				}
			}
		} else {
			System.out.println("Error. N1 ha de ser més petit que N2");
		}

	}

}
