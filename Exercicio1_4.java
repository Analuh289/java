import java.util.*;
public class Exercicio1_4 {
	public static void main(String[] args) {
		// 1 - declaração de variáveis
		float distancia;
		float tempo;
		float velocidade;
		Scanner leia = new Scanner(System.in);
		
		// 2 - Entrada de dados
		System.out.print("Digite a distancia do destino em km: ");
		distancia = leia.nextFloat();
		System.out.print("Tempo gasto em horas: ");
		tempo = leia.nextFloat();
		
		// 3 - cálculo
		velocidade = distancia / tempo;
		
		// 4 - saída
		System.out.println("Velocidade do veículo: " + velocidade + " km/h");

	}

}
