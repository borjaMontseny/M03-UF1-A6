import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Donat un nombre enter positiu, escriu els seus divisors positius.
		 */

		System.out.print("Nombre: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int i = n;

		while (i <= n) {
			if (n % i == 0) {
				System.out.println(i);
				i--;
			} else {
				i--;
			}
		}

	}

}
