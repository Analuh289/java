import java.util.*;
public class Exercicio2_3 {

	public static void main(String[] args) {
		// 1 - variáveis
		String nomeEmpregado;
		float salario;
		float novoSalario;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o nome do empregado: ");
		nomeEmpregado = leia.nextLine();
		
		System.out.print("Digite o salário atual do empregado: ");
		salario = leia.nextFloat();

		// 3 - cálculos
		if (salario < 1000) {
			novoSalario = salario + salario * 15 / 100;
		} else {
			novoSalario = salario + salario * 10 / 100;
		}
		
		// 4 - saída
		System.out.println("O novo salario do empregado é: " + novoSalario);
	}

}
