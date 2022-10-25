package here;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

		
		sc.close();

	}

}
