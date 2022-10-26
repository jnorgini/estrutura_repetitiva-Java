package loopings;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("1) Álcool\n"
				+ "2) Gasolina\n"
				+ "3) Diesel\n");
		
		System.out.print("Tipo de combustível: ");
		int tipo = sc.nextInt();
		
		while(tipo != 4) {
			
			if(tipo == 1) {
				alcool += 1;
			}
			else if(tipo == 2) {
				gasolina += 1;
			}
			else if(tipo == 3) {
				diesel += 1;
			}
			
			System.out.print("\nTipo de combustível: ");
			tipo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		

		sc.close();

	}

}
