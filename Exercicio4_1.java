import java.util.*;
public class Exercicio4_1 {

	public static void main(String[] args) {
		// 1 - variáveis
		String nomeEmpregado;
		float salario;
		byte numDependente;
		float novoSalario;
		float somaNovoSalario = 0;
		byte contNovoSalAcima1700 = 0;
		Scanner leia = new Scanner(System.in);
		
		for (byte cont = 1; cont <= 10; cont++) {
			// 2 - entrada de dados
			System.out.print("Digite o nome do Empregado: ");
			nomeEmpregado = leia.nextLine();
			System.out.print("Digite o salário do Empregado: ");
			salario = leia.nextFloat();
			System.out.print("Digite o número de dependentes: ");
			numDependente = leia.nextByte();
			
			// 3 - cálculos
			if (salario < 1000) {
				novoSalario = salario + salario * 30 / 100;
			} else if (salario <= 2000) {
				novoSalario = salario + salario * 20 / 100;
			} else {
				novoSalario = salario + salario * 10 / 100;
			}
			
			novoSalario = novoSalario + 50 * numDependente;
			somaNovoSalario = somaNovoSalario + novoSalario;
			if (novoSalario > 1700) {
				contNovoSalAcima1700 ++;
			}
			
			// 4 - saídas
			System.out.println("Novo salário do empregado: " + novoSalario);
			leia.nextLine();
		} // fim do for
		
		System.out.println("Soma dos novos salários: " + somaNovoSalario);
		System.out.println("Média dos novos salários: " + somaNovoSalario / 10);
		System.out.println("Quantidade de empregados com novo salário acima de R$1700: " 
				+ contNovoSalAcima1700);
		

	}

}
