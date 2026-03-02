import java.util.*;
public class Exercicio1_1 {

	public static void main(String[] args) {
		// variaveis
		String nomeAluno;
		float nota1;
		float nota2;
		float nota3;
		float notaFinal;
		float media;
		
		// entrada de dados
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		nomeAluno = leia.next();
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		// calculo
		notaFinal = nota1 + nota2 + nota3;
		media = notaFinal /3;
		
		// saida de dados
		System.out.println("Digite a nota final do aluno: " + notaFinal);
		System.out.println("Digite a media do aluno: " + media);

	}

}
