import java.util.*;
public class Exercicio6_3 {

	public static void main(String[] args) {
		// 1 - variáveis
		float custoProd[] = new float[3];
		int quantProd[][] = new int[3][3];
		int maiorQuantArmaz = 0;
		byte armazMaiorQuant = 0;
		int somaQuantArmaz = 0;
		float custoProdArmaz;
		float somaCustoArmaz = 0;
		float somaCustoGeral = 0;
		Scanner leia = new Scanner (System.in);
		
		for (byte cont = 0; cont <= 2; cont ++) {
			System.out.print("Digite o custo do Produto " + (cont + 1) 
					+ ": ");
			custoProd[cont] = leia.nextFloat();
		}
		
		System.out.println();
		
		for (byte linha = 0; linha <= 2; linha ++) {
			for (byte coluna = 0; coluna <= 2; coluna ++) {
				System.out.print("Digite a quantidade do Produto " +
						(coluna + 1) + " no Armazem " + (linha + 1) + ": ");
				quantProd[linha][coluna] = leia.nextInt();
				
				somaQuantArmaz = somaQuantArmaz + quantProd[linha][coluna];
				custoProdArmaz = custoProd[coluna] * quantProd[linha][coluna];
				System.out.println("Custo do produto " + (coluna + 1) +
						" no Armazem " + (linha + 1) + ": " + custoProdArmaz);
				
				somaCustoArmaz = somaCustoArmaz + custoProdArmaz;
			} // fim do for Coluna
			
			somaCustoGeral = somaCustoGeral + somaCustoArmaz;
			if (somaQuantArmaz > maiorQuantArmaz) {
				maiorQuantArmaz = somaQuantArmaz;
				armazMaiorQuant = (byte)(linha + 1);
			}
			
			System.out.println("Custo total do estoque dos 3 produtos no Armazem " + 
					(linha + 1) + ": " + somaCustoArmaz);
			somaCustoArmaz = 0;
			somaQuantArmaz = 0;
			System.out.println();
			
		} // fim do for Linha
		
		System.out.println("Armazem com maior quantidade de produtos: " + armazMaiorQuant);
		System.out.println("Custo total de produtos em todos armazens: " + somaCustoGeral);

	}

}
