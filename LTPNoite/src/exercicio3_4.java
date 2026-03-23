import java.util.*;
public class exercicio3_4 {

	public static void main(String[] args) {
    // variaveis
		String nomeAluno;
		int matricula = 0;
		byte nota1;
		byte nota2;
		byte nota3;
		byte notaFinal;
		int contAlunos = 0;
		int somaNotaFinal = 0;
		byte maiorNotaFinal = 0;
		String nomeAlunoMaiorNotaFinal = "";
		Scanner leia = new Scanner(System.in);
		
		while(matricula != 999) {
			System.out.println("digite a matricula do aluno: ");
			matricula = leia.nextInt();
			if(matricula == 999) {
				break;
			}
			leia.nextLine();
			System.out.println("digite o nome do aluno: ");
			nomeAluno = leia.nextLine();
			System.out.println("digite a primeira nota do aluno: ");
			nota1 = leia.nextByte();
			System.out.println("digite a segunda nota do aluno: ");
			nota2 = leia.nextByte();
			System.out.println("digite a terceira nota do aluno: ");
			nota3 = leia.nextByte();
			
			notaFinal = (byte)(nota1 + nota2 + nota3);
			if(notaFinal >= 60) {
				System.out.println("aluno aprovado");
			}else {
				System.out.println("aluno reprovado");
			}
			contAlunos++;
			
			somaNotaFinal = somaNotaFinal + notaFinal;
			
			if(notaFinal > maiorNotaFinal) {
				maiorNotaFinal = notaFinal;
				nomeAlunoMaiorNotaFinal = nomeAluno;
			}
			System.out.println("nota final do aluno: "+ notaFinal);
		}
		System.out.println("quantidade de alunos na turma: " + contAlunos);
		System.out.println("media de notas finais: "+ (float) somaNotaFinal/ contAlunos);
		System.out.println("maior nota final da turma: "+ maiorNotaFinal);
		System.out.println("nome do aluno que tirou a maior nota: "+ nomeAlunoMaiorNotaFinal);
		
	}

}
