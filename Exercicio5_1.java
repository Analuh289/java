import java.util.*;
public class Exercicio5_1 {

	public static void main(String[] args) {
		// 1 - variáveis
		float nota;
		float mediaNotaAlunos[] = new float[30];
		float somaNotaAluno = 0;
		float somaMedia = 0;
		byte contAluno;
		byte contNota;
		Scanner leia = new Scanner(System.in);
		
		for (contAluno = 0; contAluno <= 29; contAluno ++ ) {
			for (contNota = 1; contNota <= 5; contNota ++) {
				// 2 - entrada de dados
				System.out.print("Digite a nota " + contNota + 
						" do aluno " + (contAluno + 1) + ": ");
				nota = leia.nextFloat();
				
				// 3 - cálculos
				somaNotaAluno = somaNotaAluno + nota;
			}
			
			mediaNotaAlunos[contAluno] = somaNotaAluno / 5;
			somaMedia = somaMedia + mediaNotaAlunos[contAluno];
			somaNotaAluno = 0;
		}
		
		System.out.println("Número do Aluno        Média Aluno");
		for (byte x = 0; x <= 29; x ++) {
			System.out.println("    " + (x + 1) + "                       " +
					mediaNotaAlunos[x]  );
		}
		System.out.println("Média da turma: " + somaMedia / 30);

	}

}
