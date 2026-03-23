import java.util.*;
public class Exercicio4_1 {

	public static void main(String[] args) {
    // variaveis
		String nome;
		float salario;
		int numDependentes;
		float novoSalario;
		float somaNovoSalario = 0;
		float numSal1700 = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i <= 10; i++) {
		// entrada de dados
		System.out.println("digite o nome do empregado: ");
		nome = leia.nextLine();
		System.out.println("digite o salario do empregado: ");
		salario = leia.nextFloat();
		System.out.println("digite o numero de dependentes: ");
		numDependentes = leia.nextInt();
		
		if(salario <= 1000) {
			novoSalario = salario + salario * 30/100;
		}else if(salario <= 2000) {
			novoSalario = salario + salario * 20/100;
		}else {
			novoSalario = salario + salario * 10/100;
		}
		novoSalario = novoSalario + 50 * numDependentes;
				
	    if(novoSalario > 1700) {
	    	numSal1700++;
	    }
	    somaNovoSalario = somaNovoSalario + novoSalario;
	    System.out.println( nome + "| Novo Salário: " + novoSalario);
		
		}
		System.out.println("soma dos novos salarios: " + somaNovoSalario);
		System.out.println("media dos novos salarios: " + (somaNovoSalario/10));
		System.out.println("numero de empregados com salario maior que R$1700,00: " + numSal1700);
		
	}

}
