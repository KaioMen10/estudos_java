package diagonal_negativa;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		
		int N, cont;
		
		System.out.print("Qual a ordem da matriz?");
		N = sc.nextInt();
		
		int[][] mat = new int[N][N];
		//criando a matriz e fazendo o armazenamento dos numeros
		for(int i = 0; i < N; i++) {
			for(int j= 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				
				mat[i][j] = sc.nextInt();				
				
				
			}
		}		
		//mostra na tela a diagonal p
		System.out.println("DIAGONAL PRINCIPAL: ");
		for(int i = 0; i < N; i++) {
			 System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		cont = 0;
		//conta a quantidade de negativos na matriz
		for(int i = 0; i < N; i++) {
			for(int j= 0; j < N; j++) {
				if (mat[i][j] < 0) {
				cont++;	
				
				}
			}
		}		
		System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
		
		
		sc.close();
	}

}
