import java.util.*;
public class Exercicio8_2 {

	public static void main(String[] args) {
		// 1 - variáveis
		String nomeEmp[] = new String[100];
		int codEmpregado;
		int numPecas;
		float salarioEmp[] = new float[100];
		float somaSalario = 0;
		byte contEmp;
		Scanner leia = new Scanner(System.in);
		
		for (contEmp = 0; contEmp <= 99; contEmp ++){
			// 2 - entrada de dados
			System.out.print("Digite o nome do Empregado (fim p/ encerrar): ");
			nomeEmp[contEmp] = leia.nextLine();
			if (nomeEmp[contEmp].equalsIgnoreCase("fim")) {
				break;
			}
			
			do {
				System.out.print("Digite o código do Empregado: ");
				codEmpregado = leia.nextInt();
				if (codEmpregado < 1 || codEmpregado > 999) {
					System.out.println("Código inválido, digite entre 1 e 999");
				}
			}while(codEmpregado < 1 || codEmpregado > 999);
			
			do {
				System.out.print("Digite o número de peças fabricadas: ");
				numPecas = leia.nextInt();
				if (numPecas < 1) {
					System.out.println("Número de peças inválido, digite acima de zero");
				}
			}while(numPecas < 1);
			
			// 3 - cálculos
			salarioEmp[contEmp] = calcularSalario(numPecas);
			somaSalario = somaSalario + salarioEmp[contEmp];
			
			leia.nextLine();
		} // fim do for

		System.out.println();
		System.out.println("Nome     Salário");
		System.out.println("-------- -------");
		for(byte x = 0; x < contEmp; x ++) {
			System.out.println(nomeEmp[x] + "    " + salarioEmp[x]);
		}
		System.out.println("Total pago com salários: " + somaSalario);
		System.out.println("Média dos salários: " + somaSalario / contEmp);
			
			
	} // fim do main

	public static float calcularSalario (int pecas) {
		float salario;
		if (pecas <= 200) {
			salario = 2 * pecas;
		} else if (pecas <= 400) {
			salario = 2.30f * pecas;
		} else {
			salario = 2.50f * pecas;
		}
		return salario;
	}
}
