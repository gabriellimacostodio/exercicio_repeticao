package exercicio_repetição_1;

import java.util.Scanner;

public class valores_10 {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		int n = 0;

		while( n < 10 ) {

		System.out.println("digite umnumero");
		n = leitor.nextInt();
		
		
		if( n > 0 ) {
			System.out.println("positivo");
		}
		else if ( n < 0) {
			System.out.println("negativo");
		}
		
		}

	
	System.out.println("saiu da estrutura");
	
	
	}

}
