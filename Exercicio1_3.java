import java.util.*;
public class Exercicio1_3 {
	public static void main(String[] args) {
		// 1 - declaração de variáveis
		float vlrAplicacao;
		float taxaJuros;
		float vlrRendimento;
		float vlrTotal;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o valor da aplicação: ");
		vlrAplicacao = leia.nextFloat();
		System.out.print("Digite a taxa de juros: ");
		taxaJuros = leia.nextFloat();
		
		// 3 - cálculos
		vlrRendimento = vlrAplicacao * taxaJuros / 100;
		vlrTotal = vlrAplicacao + vlrRendimento;
		
		// 4 - saída
		System.out.println("Valor do rendimento: " + vlrRendimento);
		System.out.println("Valor total após rendimento: " + vlrTotal);
	}
}
