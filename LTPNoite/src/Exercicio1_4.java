import java.util.*;
public class Exercicio1_4 {

	public static void main(String[] args) {
		// variaveis
		float km;
		float tempo;
		float velocidade;
		
		// entrada de dados
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor em km: ");
		km = leia.nextFloat();
		System.out.println("digite o valor em tempo: ");
		tempo = leia.nextFloat();
		
		// calculo 
		velocidade = km/tempo;
		
		// saida de dados
		System.out.println("digite a velocidade: " + velocidade);

	}

}
