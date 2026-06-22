import java.util.*;
public class Exercicio2_5 {

	public static void main(String[] args) {
		// 1 - variáveis
		int cand1_Secao1;
		int cand1_Secao2;
		int cand2_Secao1;
		int cand2_Secao2;
		int cand3_Secao1;
		int cand3_Secao2;
		int somaVotosCand1;
		int somaVotosCand2;
		int somaVotosCand3;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite a quantidade de votos do Candidato 1 na Seção 1: ");
		cand1_Secao1 = leia.nextInt();
		System.out.print("Digite a quantidade de votos do Candidato 1 na Seção 2: ");
		cand1_Secao2 = leia.nextInt();
		System.out.print("Digite a quantidade de votos do Candidato 2 na Seção 1: ");
		cand2_Secao1 = leia.nextInt();
		System.out.print("Digite a quantidade de votos do Candidato 2 na Seção 2: ");
		cand2_Secao2 = leia.nextInt();
		System.out.print("Digite a quantidade de votos do Candidato 3 na Seção 1: ");
		cand3_Secao1 = leia.nextInt();
		System.out.print("Digite a quantidade de votos do Candidato 3 na Seção 2: ");
		cand3_Secao2 = leia.nextInt();
		
		// 3 - cálculos
		somaVotosCand1 = cand1_Secao1 + cand1_Secao2;
		somaVotosCand2 = cand2_Secao1 + cand2_Secao2;
		somaVotosCand3 = cand3_Secao1 + cand3_Secao2;
		
		// 4 - saídas
		if (somaVotosCand1 > somaVotosCand2 && somaVotosCand1 > somaVotosCand3) {
			System.out.println("O candidato 1 é o vencedor");
		} else if (somaVotosCand2 > somaVotosCand3) {
			System.out.println("O candidato 2 é o vencedor");
		} else {
			System.out.println("O candidato 3 é o vencedor");
		}

	}

}
