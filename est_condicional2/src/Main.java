import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.println("Digite um numero: ");
		a = sc.nextInt();
		
		if (a % 2 == 0) {
			
			System.out.println("Par");
			
		}
		else {
			System.out.print("impar");
		}
		

	}

}
