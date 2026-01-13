package menor_de_tres;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//declaração das variaveis 
		int a, b, c, menor;
		
		System.out.print("Primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Segundo valor: ");
		b = sc.nextInt();
		System.out.print("Terceiro valor: ");
		c = sc.nextInt();
		
		//condição SE usando END
		if (a < b && a < c) {
			
			menor = a;
						
		}
		else if (b < c) {
			
			menor = b;
			
		}
		else {
			
			menor = c;
			
		}
		//mostra na tela o valor do menor número entre os três
		System.out.println("MENOR = "+ menor);
		
		sc.close();
	}

}
