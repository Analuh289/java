import java.util.*;
public class Exercicio5_3 {

	public static void main(String[] args) {
		// 1 - variáveis
		int matricLTP[] = new int[150];
		int matricCalc;
		int contLTP;
		int contCalc;
		int contMatric_LTP_Calc = 0;
		Scanner leia = new Scanner(System.in);
		
		for (contLTP = 0; contLTP <= 149; contLTP ++) {
			// 2 - entrada de dados
			System.out.print("Digite a matrícula do aluno em LTP: ");
			matricLTP[contLTP] = leia.nextInt();
			if (matricLTP[contLTP] == 999) {
				break;
			}
		}
	
		System.out.println(contLTP);
		
		for (contCalc = 1; contCalc <= 220; contCalc ++) {
			System.out.print("Digite a matrícula do aluno em Cálculo: ");
			matricCalc = leia.nextInt();
			if (matricCalc == 999) {
				break;
			}
			
			for (int x = 0; x < contLTP; x ++) {
				if (matricCalc == matricLTP[x]) {
					contMatric_LTP_Calc ++;
					break;
				}
			}
		}
		
		System.out.println("Quantidade de alunos cursando LTP e Cálculo: " + contMatric_LTP_Calc);

	}

}
