import java.util.*;
public class Exercicio3_4 {

	public static void main(String[] args) {
		// 1 - variáveis
		int matriculaAluno = 0;
		String nomeAluno;
		byte nota1;
		byte nota2;
		byte nota3;
		byte notaFinal;
		int contAlunos = 0;
		int somaNotaFinal = 0;
		byte maiorNotaFinal = 0;
		String nomeAlunoMaiorNotaFinal = "";
		Scanner leia = new Scanner(System.in);
		
		while (matriculaAluno != 999) {
			// 2 - entrada de dados
			System.out.print("Digite a matricula do aluno: ");
			matriculaAluno = leia.nextInt();
			if (matriculaAluno == 999) {
				break;
			}
			leia.nextLine();
			System.out.print("Digite o nome do aluno: ");
			nomeAluno = leia.nextLine();
			System.out.print("Digite a primeira nota do aluno: ");
			nota1 = leia.nextByte();
			System.out.print("Digite a segunda nota do aluno: ");
			nota2 = leia.nextByte();
			System.out.print("Digite a terceira nota do aluno: ");
			nota3 = leia.nextByte();
			
			// 3 - cálculos
			notaFinal = (byte)(nota1 + nota2 + nota3);
			if (notaFinal >= 60) {
				System.out.println("Aluno aprovado");
			} else {
				System.out.println("Aluno reprovado");
			}
			
			contAlunos ++;
			somaNotaFinal = somaNotaFinal + notaFinal;
			if (notaFinal > maiorNotaFinal) {
				maiorNotaFinal = notaFinal;
				nomeAlunoMaiorNotaFinal = nomeAluno;
			}
			
			// 4 - saídas
			System.out.println("Nota final do aluno: " + notaFinal);
			
		} // fim do while
		
		System.out.println("Quantidade de alunos na turma: " + contAlunos);
		System.out.println("Média de notas finais: " + (float)somaNotaFinal / contAlunos);
		System.out.println("Maior nota final da turma: " + maiorNotaFinal);
		System.out.println("Nome do aluno que tirou a maior nota: " + nomeAlunoMaiorNotaFinal);

	}

}
