package matriz_em_java;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M, N, i, j;
		
		System.out.print("Quantos linhas vai ter a matriz?");
		M = sc.nextInt();
		System.out.print("Quantas colunas vai ter a matriz?");
		N = sc.nextInt();
		
		
		int[][] mat = new int[M][N];
		
		for ( i = 0; i < M; i++) {
			for( j = 0; j < N; j++) {
				
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
		}
			}
		
		System.out.println();	
		System.out.print("MATRIZ DIGITADA: ");
		 for ( i = 0; i < M; i++) {
			for( j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
		}
		
		 	}
			
		sc.close();	
	}
}

	