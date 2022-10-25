package here;

import java.util.Locale;
import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor inteiro: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
		
			double media = (a * 2 + b * 3 + c * 5) / 10;
			System.out.printf("%.1f%n", media);
		
		}
		
		sc.close();

	}

}
