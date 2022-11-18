import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {

		/*
		 * Llegeix una seqüència de notes obtingudes per un grup d’alumnes acabada en -1
		 * i escriu quants alumnes han obtingut les qualificacions MD, I, S, B, N, E.
		 */

		int contadorMD = 0;
		int contadorI = 0;
		int contadorS = 0;
		int contadorB = 0;
		int contadorN = 0;
		int contadorEx = 0;

		String enunciat = "Nota (-1 per acabar): ";
		
		System.out.print(enunciat);
		Scanner sc = new Scanner(System.in);
		double nota = sc.nextDouble();

		while (nota != -1) {
			System.out.print(enunciat);
			nota = sc.nextDouble();

			if (nota >= 0 && nota < 3) {
				contadorMD++;
			} else if (nota > 3 && nota < 5) {
				contadorI++;
			} else if (nota >= 5 && nota < 6) {
				contadorS++;
			} else if (nota >= 6 && nota < 7) {
				contadorB++;
			} else if (nota >= 7 && nota < 9) {
				contadorN++;
			} else if (nota >= 9 && nota < 10) {
				contadorEx++;
			}

		}

		sc.close();

		System.out.println("\nAlumnes amb MD: " + contadorMD);

		System.out.println("Alumnes amb I: " + contadorI);

		System.out.println("Alumnes amb S: " + contadorS);

		System.out.println("Alumnes amb B: " + contadorB);

		System.out.println("Alumnes amb N: " + contadorN);

		System.out.println("Alumnes amb Ex: " + contadorEx);
	}
}
