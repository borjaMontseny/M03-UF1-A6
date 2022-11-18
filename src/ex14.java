import java.util.Iterator;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Número: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("\nTaula de multiplicar: ");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " × " + i + " = " + (num * i));
		}
		
		
	}

}
