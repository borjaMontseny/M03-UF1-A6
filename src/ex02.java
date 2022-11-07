import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Donats dos nombres enters n1 i n2 amb n1 < n2, escriu les arrels quadrades
		 * dels nombres enters dins l'interval [n1, n2] en ordre creixent.s
		 */
		
		System.out.print("N1: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.print("N2: ");
		int n2 = sc.nextInt();
		sc.close();
		
		System.out.println("\nArrels quadrades: ");
		System.out.println(n1 + " -> " + Math.sqrt(n1));
		while (n1 < n2) {
			n1++;
			System.out.println(n1 + " -> " + Math.sqrt(n1));
		}
		
	}

}
