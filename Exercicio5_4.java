import java.util.*;
public class Exercicio5_4 {

	public static void main(String[] args) {
		// 1 - variáveis
		char gabarito[] = new char[10];
		int matriculaAluno;
		char resposta;
		byte nota = 0;
		int contAprovado = 0;
		int contAluno = 0;
		int freqAbsoluta[] = new int[11];
		int maiorFreqAbs = 0;
		byte notaMaiorFreqAbs = 0;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		for (byte x = 0; x <= 9; x ++) {
			System.out.print("Digite a letra (A até E) da questão " + (x+1) + " no gabarito: ");
			gabarito[x] = leia.next().charAt(0);
		}
		
		do {
			System.out.print("Digite a matrícula do aluno (digite 999 p/ finalizar): ");
			matriculaAluno = leia.nextInt();
			if (matriculaAluno == 999) {
				break;
			}
			for(byte cont = 0; cont <= 9; cont ++) {
				System.out.print("Digite a resposta da questão " + (cont+1) + ": ");
				resposta = leia.next().charAt(0);
				// 3- cálculos
				if (resposta == gabarito[cont]) {
					nota ++;
				}
			}
			
			if (nota >= 6) {
				contAprovado ++;
			}
			contAluno ++;
			freqAbsoluta[nota] ++;
			
			// 4 - saídas
			System.out.println("A nota do aluno é: " + nota);
			
			nota = 0;
			
		}while (matriculaAluno != 999);
		
		System.out.println("Percentual de alunos aprovados: " + 
				contAprovado * 100 / (float)contAluno);
		for (byte x = 0; x <= 10; x ++) {
			if (freqAbsoluta[x] > maiorFreqAbs) {
				maiorFreqAbs = freqAbsoluta[x];
				notaMaiorFreqAbs = x;
			}
		}
		System.out.println("Nota de maior frequencia na turma: " + notaMaiorFreqAbs);

	}

}
