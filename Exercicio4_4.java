import java.util.*;
public class Exercicio4_4 {

	public static void main(String[] args) {
		// 1 - variáveis
		int codOperario;
		char classe;
		int numPecas;
		float salario;
		float somaSalario = 0;
		int somaNumPecas = 0;
		int menorNumPecas = 9999;
		int codOpMenorNumPecas = 0;
		int somaPecasClasse_B = 0;
		int contOpClasse_B = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			// 2 - entrada de dados
			System.out.print("Digite o código do operário (0 para finalizar): ");
			codOperario = leia.nextInt();
			if (codOperario == 0) {
				break;
			}
			
			do {
				System.out.print("Digite a classe do operário: ");
				classe = leia.next().charAt(0);
				if (classe != 'A' && classe != 'B' && classe != 'C') {
					System.out.println("Classe inválida, digite A, B ou C");
				}
			}while(classe != 'A' && classe != 'B' && classe != 'C');
			
			do {
				System.out.print("Digite o número de peças fabricado: ");
				numPecas = leia.nextInt();
				if (numPecas <= 0) {
					System.out.println("Número de peças inválido, digite acima de zero");
				}
			}while(numPecas <= 0);
			
			// 3- cálculos
			if (classe == 'A') {
				if (numPecas <= 30) {
					salario = 500 + 2 * numPecas;
				} else if (numPecas <= 40) {
					salario = 500 + (float)2.30 * numPecas;
				} else {
					salario = 500 + 2.80f * numPecas;
				}
			} else if (classe == 'B') {
				salario = 1200;
			} else {
				if (numPecas <= 50) {
					salario = 40 * numPecas;
				} else {
					salario = 45 * numPecas;
				}
			}
			
			somaSalario = somaSalario + salario;
			somaNumPecas = somaNumPecas + numPecas;
			if (numPecas < menorNumPecas) {
				menorNumPecas = numPecas;
				codOpMenorNumPecas = codOperario;
			}
			
			if (classe == 'B') {
				somaPecasClasse_B = somaPecasClasse_B + numPecas;
				contOpClasse_B ++;
			}
			
			System.out.println("Salário do empregado: " + salario);
			
		}while(codOperario != 0);
		
		System.out.println("Total gasto com salários: " + somaSalario);
		System.out.println("Total de peças fabricadas: " + somaNumPecas);
		System.out.println("Operário que fabricou menor número de peças: " 
				+ codOpMenorNumPecas);
		if (contOpClasse_B > 0) {
			System.out.println("Média peças fabricadas classe B: " 
					+ somaPecasClasse_B / (float)contOpClasse_B);
		}
		
	}

}
