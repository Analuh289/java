import java.util.*;
public class Exercicio3_1 {

	public static void main(String[] args) {
		// 1 - variáveis
		float notaLTP;
		byte contAprovado = 0;
		byte contReprovado = 0;
		byte cont = 1;
		Scanner leia = new Scanner(System.in);
		
		while (cont <= 10) {
			// 2- entrada de dados
			System.out.print("Digite a nota do aluno " + cont + ": ");
			notaLTP = leia.nextFloat();
			
			// 3 - cáculos
			if (notaLTP >= 60) {
				System.out.println("Aluno aprovado");
				contAprovado ++;
			} else {
				System.out.println("Aluno reprovado");
				contReprovado ++;
			}
			cont ++;
		}
		
		// 4 - saídas
		System.out.println("Quantidade de alunos aprovados: " + contAprovado);
		System.out.println("Quantidade de alunos reprovados: " + contReprovado);

	}

}
