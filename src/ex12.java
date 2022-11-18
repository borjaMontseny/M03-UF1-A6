import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {

		/*
		 * Llegeix una seqüència de nombres enters acabada en zero i escriu si hi ha més
		 * nombres positius que negatius.
		 */

		String enunciat = "Escriu número (0 per acabar): ";

		System.out.print(enunciat);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int contadorPositiu = 0;
		int contadorNegatiu = 0;

		while (num != 0) {
			System.out.print(enunciat);
			num = sc.nextInt();
			if (num > 0) {
				contadorPositiu++;
			} else if (num < 0)
				contadorNegatiu++;
		}

		sc.close();

		if (contadorPositiu > contadorNegatiu) {
			System.out.println("\nHi ha més nombres positius que negatius.");

		} else if (contadorPositiu < contadorNegatiu) {
			System.out.println("\nHi ha més nombres negatius que positius.");

		} else {
			System.out.println("\nHi ha un empat entre positus i negatius.");
		}

	}

}
