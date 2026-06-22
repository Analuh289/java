import java.util.*;
public class Exercicio1_2 {
	public static void main(String[] args) {
		// 1 - variáveis
		String nomeEmpregado;
		float salario;
		float novoSalario;
		Scanner leia = new Scanner(System.in);
		
		// 2 - Entrada de dados
		System.out.print("Digite o nome do Empregado: ");
		nomeEmpregado = leia.nextLine();
		System.out.print("Digite o salario do Empregado: ");
		salario = leia.nextFloat();
		
		// 3 - cálculos
		novoSalario = salario * 15 / 100 + salario;
		
		// 4 - saída
		System.out.println("Novo salario: " + novoSalario);
	}

}
