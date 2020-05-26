package exercicio_repetição_1;

import java.util.Scanner;

public class maior_valor {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int n;
		int maior = 0;
		
		//loop
		
		for(int i= 0; i<15 ; i=i+1 ) {
			System.out.println("digite um numero inteiro" +(i+1)+":");
			n = leitor.nextInt();
			if(n > maior) {
				maior = n;
			}
		}
		System.out.println("Maior:"+maior);
		leitor.close();
		
	}

}
