package soma_de_dois_numeros;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int a = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int b = sc.nextInt();
		
		int soma = a + b;
		
		
		System.out.print("A  soma é: " + soma);
		
		sc.close();

	}

}
