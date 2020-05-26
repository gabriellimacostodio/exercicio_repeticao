package exercicio_repetição_1;

import java.util.Scanner;

public class exercicio_1_a_N {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		int n = 1, x;
		
		System.out.println("digite um valor ");
		x = leitor.nextInt();
		
		while(n <= x ) {
			
			System.out.println(n++);
			//System.out.println(n); outra forma de fazer
			//n++;
			
		}
	}

}
