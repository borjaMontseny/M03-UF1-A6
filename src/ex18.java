import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcular per n alumnes la nota final de M3 (caldrà demanar a l'usuari quants
		 * alumnes). A cada alumne se li pregunta la nota de cada UF.
		 */

		System.out.print("Número de alumnes: ");
		Scanner sc = new Scanner(System.in);
		int numAlumnes = sc.nextInt();
		int contadorNotable = 0;
		int contadorSuficient = 0;
		int contadorAprovats = 0;
		
		for (int i = 0; i < numAlumnes; i++) {
			System.out.print("Alumne " + i + " nota UF1: ");
			double notaUF1 = sc.nextDouble();
			
			System.out.print("Alumne " + i + " nota UF2: ");
			double notaUF2 = sc.nextDouble();
			
			System.out.print("Alumne " + i + " nota UF3: ");
			double notaUF3 = sc.nextDouble();
			
			double notaFinal = (notaUF1 * 0.4) + (notaUF2 * 0.35) + (notaUF3 * 0.25);
			
			if (notaFinal >= 8) {
				contadorNotable++;
			} else if (notaFinal > 5 && notaFinal <= 6) {
				contadorSuficient++;
			} else if (notaFinal > 5) {
				contadorAprovats++;
			}
				
			
		}
		
		sc.close();
		
		System.out.println("\nTotal notables: " + contadorNotable);
		
		System.out.println("\nTotal suficients: " + contadorSuficient);
		
		System.out.println("\nTotal aprovats: " + contadorAprovats);
		
		
		
	}

}
