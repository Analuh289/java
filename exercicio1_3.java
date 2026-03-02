import java.util.*;
public class Exercicio1_3 {

	public static void main(String[] args) {
     // variaveis
		float vlrApli;
		float taxaJuros;
		float vlrRend;
		float vlrTotal;
		
		// entrada de dados
		Scanner leia = new Scanner(System.in);
		System.out.println("digite o valor a ser aplicado: ");
		vlrApli = leia.nextFloat();
		System.out.println("digite a taxa de juros: ");
		taxaJuros = leia.nextFloat();
		
		// calculos
		vlrRend = vlrApli * (taxaJuros /100);
		vlrTotal = vlrApli + vlrRend;
		
		// saida de dados
		System.out.println("valor rendimento: " + vlrRend);
		System.out.println("valor total: " + vlrTotal);
		
	}

}
