package crescente;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X, Y;
		
		System.out.println("Digite dois numeros:");
		X = sc.nextInt();
		Y = sc.nextInt();
		
		//usando a logica enquanto com a condição  (x diferente de y)  
		while (X != Y) {
			if(X < Y) {
				System.out.println("CRESCENTE!");
				
			}
			else {
				System.out.println("DECRESCENTE!");
			}
			System.out.println("Digite outros dois numeros:");
			X = sc.nextInt();
			Y = sc.nextInt();
		}
			
		sc.close();
	}
}