import java.util.*;
public class Exercicio5_2 {

	public static void main(String[] args) {
		// 1 - variáveis
		byte nota;
		byte contFreqAbs[] = new byte[11];
		byte cont;
		Scanner leia = new Scanner(System.in);
		
		for (cont = 1; cont <= 20; cont ++) {
			// 2 - entrada de dados
			System.out.print("Digite a nota de LTP do aluno: ");
			nota = leia.nextByte();
			
			// 3 - cálculos
			
			contFreqAbs[nota] ++;		
		}
		
		// 4 - saída
		System.out.println("TABELA DE NOTAS E FREQUENCIA");
		System.out.println("Nota     Frequência Absoluta");
		for (int x = 0; x <= 10; x ++) {
			System.out.println( x + "              " + contFreqAbs[x]);
		}

	}

}
