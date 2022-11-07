import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {

		System.out.print("Nombre: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int contador = 0; // variable contador
		
		while (n != 0) { // mientras a n le queden cifras
			n = n / 10; // le quitamos el último dígito
			contador++; // sumem 1 al contadors
		}
		System.out.println("El número tiene " + contador + " cifras");
	}
}
