import java.awt.MediaTracker;
import java.util.*;
public class Exercicio2_4 {

	public static void main(String[] args) {
		// 1 - variáveis
		String nomeAluno;
		float nota1;
		float nota2;
		float nota3;
		float mediaNotas;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o nome do aluno: ");
		nomeAluno = leia.nextLine();
		System.out.print("Digite a primeira nota do aluno (0 a 10): ");
		nota1 = leia.nextFloat();
		System.out.print("Digite a segunda nota do aluno (0 a 10): ");
		nota2 = leia.nextFloat();
		System.out.print("Digite a terceira nota do aluno (0 a 10): ");
		nota3 = leia.nextFloat();
		
		// 3 - cáculos / 4 - saídas
		mediaNotas = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média de notas do Aluno é: " + mediaNotas);
		
		if (mediaNotas >= 7) {
			System.out.println("Aluno Aprovado");
		} else if (mediaNotas > 4) {
			System.out.println("Aluno está em Recuperação");
		} else {
			System.out.println("Aluno reprovado");
		}
	}
}
