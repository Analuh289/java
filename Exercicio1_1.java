import java.util.*;
public class Exercicio1_1 {

	public static void main(String[] args) {
		// 1 - declaração de variáveis
		String nomeAluno;
		byte nota1;
		byte nota2;
		byte nota3;
		byte notaFinal;
		float mediaNotas;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o nome do Aluno: ");
		nomeAluno = leia.nextLine();
		
		System.out.print("Digite a 1a nota do aluno: ");
		nota1 = leia.nextByte();
		
		System.out.print("Digite a 2a nota do aluno: ");
		nota2 = leia.nextByte();
		
		System.out.print("Digite a 3a nota do aluno: ");
		nota3 = leia.nextByte();
		
		// 3 - cálculos
		notaFinal = (byte)(nota1 + nota2 + nota3);
		mediaNotas = (float)notaFinal / 3;
		
		// 4 - saídas
		System.out.println("Nota Final do aluno: " + notaFinal);
		System.out.println("Média de notas do aluno: " + mediaNotas);
		
	}

}
