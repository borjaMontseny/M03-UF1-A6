import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Llegeix una seqüència de nombres no negatius acabada en 0 (fins que l'usuari
		 * introdueixi un 0), i escriu la mitjana aritmètica dels nombres entrats.
		 */



		double contador = 0;
		
		String enunciat = "Escriu número (0 per acabar): ";

		Scanner sc = new Scanner(System.in);
		
		System.out.print(enunciat);
		double num = sc.nextDouble();
		double sumaNums = num;
		
		while (num != 0) {

			System.out.print(enunciat);
			num = sc.nextDouble();

			sumaNums = sumaNums + num;
			contador++;

		}

		sc.close();

		System.out.println("La mitjana aritmètica és: " + (sumaNums / contador));

	}

}
