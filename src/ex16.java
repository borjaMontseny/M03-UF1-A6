import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {

		/*
		 * Fer un programa en el qual l'usuari vagi inserint números i cada vegada que
		 * insereix un número demani si en vol inserir més. Quan l'usuari acabi
		 * d'inserir els números, mostrar la suma de tots els números inserits.
		 */

		String enunciat1 = "Introdueix un número: ";
		String enunciat2 = "Vols introduir més números? Si / No ";
		String enunciat3 = "\nFinalitzant el programa, carregant resultat...";
		String error = "\nError al introduir resposta.";

		int totalSuma = 0;

		boolean continua = true;

		Scanner sc = new Scanner(System.in);

		while (continua) {
			System.out.print(enunciat1);
			int num = sc.nextInt();

			totalSuma = num + totalSuma;

			System.out.print(enunciat2);
			char resposta = sc.next().charAt(0);

			if (resposta == 'S' || resposta == 's') {
				continua = true;
			} else if (resposta == 'N' || resposta == 'n') {
				System.out.print(enunciat3);
				continua = false;
			} else {
				System.out.print(error + enunciat3);
				continua = false;
			}

		}

		System.out.println("\nSuma total: " + totalSuma);
		sc.close();

	}

}
