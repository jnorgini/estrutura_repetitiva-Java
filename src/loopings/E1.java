package loopings;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Senha: ");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inválida");
		}
		
		System.out.println("Acesso permitido");

		
		sc.close();
		
	}

}
