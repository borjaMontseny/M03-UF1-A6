import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Donats dos nombres enters n1 i n2 amb n1 < n2, calcula quants parells hi ha
		 * dins de l’interval [n1 , n2].
		 */

		System.out.print("N1: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.print("N2: ");
		int n2Original = sc.nextInt();
		sc.close();

		int numParells = 0;

		int n2 = n2Original;

		if (n1 < n2Original) {
			while (n1 < n2) {
				if (n2 % 2 == 0) {
					numParells++;
					n2--;
				} else {
					n2--;
				}
			}

			System.out.println("\nParells que hi ha dins de l'interval [" + n1 + " - " + n2Original + "]: " + numParells);
		} else {
			System.out.println("Error. N1 ha de ser més petit que N2");
		}

	}

}
