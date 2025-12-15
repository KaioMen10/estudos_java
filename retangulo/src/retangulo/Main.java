package retangulo;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//declarando as bibliotecas
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//variaveis
		double  base, altura, area, perimetro, diagonal;
		
		//realizado a entrada de dados pelo usuario
		System.out.print("Base do retangulo: ");
		base = sc.nextDouble();		
		System.out.print("Base do retangulo: ");
		altura = sc.nextDouble();	
		
		//calculando medidas
		area = base * altura;
		perimetro = 2* (base + altura);
		diagonal = Math.sqrt(Math.pow(base, 2.0)+ Math.pow(altura,  2.0));
		
		//mostrando na tela os resultados
		System.out.print("AREA = " + String.format("%.4f", area));
		System.out.print("PERIMETRO= " + String.format("%.4f", perimetro));
		System.out.print("DIAGONAL = " + String.format("%.4f", diagonal));
	
		sc.close();
	}
}
