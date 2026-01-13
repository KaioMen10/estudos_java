import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;

		System.out.println("Escreva um número: ");
		a = sc.nextInt();

		if (a >= 0) {
			System.out.print("NÃO NEGATIVO");
		} else {
			System.out.print("NEGATIVO");
		}
		sc.close();
	}

}
