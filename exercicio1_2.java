import java.util.*;
public class Exercicio1_2 {

	public static void main(String[] args) {
		// variaveis
		String nome;
		float salario;
		float novoSal;
		
		// entrada de dados
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nome do empregado: ");
		nome = leia.next();
		System.out.println("Digite o salario do empregado: ");
		salario = leia.nextFloat();
		
		// calculo
		novoSal = (salario * (15/100)) + salario;
		
		// saida de dados
		System.out.println("Digite o novo salario do empregado: " + novoSal);

	}

}
