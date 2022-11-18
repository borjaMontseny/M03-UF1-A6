import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {

		System.out.print("Número de treballadors: ");
		Scanner sc = new Scanner(System.in);

		double numTreballadors = sc.nextInt();

		double sou = 0;
		double souTotal = 0;

		double souMesPetit = Integer.MAX_VALUE;
		double souMesGran = 0;

		double souMinim = 735.90;

		int contadorAlarmes = 0;

		for (int i = 1; i <= numTreballadors; i++) {

			System.out.print("\nTreballador " + i + ". Sou: ");
			sou = sc.nextDouble();

			// per sumar salaris i fer la mitja després
			souTotal += sou;

			// alarma per al sou mínim
			if (sou < souMinim) {
				System.out.println("\nALARMA. " + sou + "€ és inferior sou al mínim per llei (" + souMinim + "€)");
				contadorAlarmes++;
			}

			// per a saber el sou més gran
			if (sou > souMesGran) {
				souMesGran = sou;
			}

			// per a saber el sou més petit
			if (sou < souMesPetit) {
				souMesPetit = sou;
			}

		}

		sc.close();

		if (numTreballadors <= 0) {
			System.out.println("Error al introduïr treballadors.");
		} else {
			System.out.println("\nMitja salarial = " + (souTotal / numTreballadors) + "€");
			System.out.println("\nSou més petit = " + souMesPetit + "€");
			System.out.println("\nSou més gran = " + souMesGran + "€");

			if (contadorAlarmes > 0) {
				System.out.println("\nSalaris inferiors al mínim = " + contadorAlarmes);
			}
		}
	}
}
