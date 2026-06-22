import java.util.*;
public class Exercicio5_5 {

	public static void main(String[] args) {
		// 1 - variáveis
		String nome;
		byte nota;
		char sexo;
		String nomeAprovados[] = new String[50];
		byte notaAprovados[] = new byte[50];
		byte contAprovado = 0;
		byte contAprovMasc = 0;
		byte contReprovFem = 0;
		int somaNotaFem = 0;
		byte contFem = 0;
		int somaNotaGeral = 0;
		Scanner leia = new Scanner(System.in);
		
		for (byte cont = 1; cont <= 10; cont++) {
			System.out.print("Digite o nome do Aluno: ");
			nome = leia.nextLine();
			
			do {
				System.out.print("Digite a nota do Aluno: ");
				nota = leia.nextByte();
				if (nota < 0 || nota > 100) {
					System.out.println("Nota inválida, digite entre 0 e 100");
				}
			}while(nota < 0 || nota > 100);
			do {
				System.out.print("Digite o sexo do Aluno (M/F): ");
				sexo = leia.next().charAt(0);
				if (sexo != 'F' && sexo != 'M') {
					System.out.println("Sexo inválido, digite M ou F");
				}
			}while(sexo != 'F' && sexo != 'M');
			
			if (nota >= 60) {				
				nomeAprovados[contAprovado] = nome;
				notaAprovados[contAprovado] = nota;
				contAprovado ++;
				if (sexo == 'M') {
					contAprovMasc ++;
				} 
				System.out.println("Aluno Aprovado");
			} else {
				if (sexo == 'F'){
					contReprovFem ++;
				}
				System.out.println("Aluno Reprovado");
			}
			
			if (sexo == 'F') {
				somaNotaFem = somaNotaFem + nota;
				contFem ++;
			}
			somaNotaGeral = somaNotaGeral + nota;
			
			leia.nextLine();
		}  // fim do for
		
		System.out.println("Número de alunos aprovados sexo Masculino: " + 
				contAprovMasc);
		System.out.println("Número de alunos reprovados sexo Feminino: " + 
				contReprovFem);
		if (contFem > 0) {
			System.out.println("Média de notas femininas: " + 
					somaNotaFem / contFem);
		}
		System.out.println("Média geral das notas: " + somaNotaGeral / 10);
		
		System.out.println();
		System.out.println("RELATÓRIO DE APROVADOS");
		System.out.println("Nome       Nota");
		for (byte x = 0; x < contAprovado; x ++) {
			System.out.println(nomeAprovados[x] + "       " + notaAprovados[x]);
		}

	}

}
