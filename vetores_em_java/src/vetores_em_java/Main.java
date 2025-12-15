package vetores_em_java;
import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
			
		int N;
		System.out.print("Quantos numeros voce vai digitar?");	
		N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i = 0;i < N; i++) {
			
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		
		System.out.println("NUMEROS DIGITADOS:");
		
		for (int i = 0; i < N; i++) {
			
		System.out.println(String.format("%.1f",vet[i]));
		}
		
		sc.close();
	}

}
