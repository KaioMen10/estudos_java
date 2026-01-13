import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int hInicial, hFinal;
		int duracao;
		
		System.out.println("Digite a duracao da partida com hora inicial e hora final: ");
		
		hInicial = sc.nextInt();
		hFinal = sc.nextInt();
		
		if (hFinal > hInicial) {
			
			duracao = hFinal - hInicial;
			
		}else {
			
			duracao = 24 - hInicial + hFinal;
		}
		
		System.out.print("O JOGO DUROU " + duracao +" HORA(S)");
		
		sc.close();		
	}

}
