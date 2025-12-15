package verifica_par_ou_impar;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//realiza a entrada de dado
		Scanner sc= new Scanner(System.in);
		//solicita para o usuario um numero
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		//realiza a logica para ver se é par ou impar
		if(n % 2 == 0) {
			System.out.println("Par");
			
		} else {
			System.out.println("Ímpar");
		}
		
		sc.close();

	}

}
