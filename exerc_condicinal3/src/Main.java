import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;
		int maior, menor;

		System.out.println("Digite dois valores: ");
		a = sc.nextInt();
		b = sc.nextInt();

		if (a > b) {
			maior = a;
			menor = b;
		} else {
			maior = b;
			menor = a;
		}

		if (maior % menor == 0) {
			System.out.print("São Multiplos");

		} else {

			System.out.print("Não São Multiplos");
		}

		sc.close();

	}

}
