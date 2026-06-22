import java.util.*;
public class Exercicio6_2 {

	public static void main(String[] args) {
		// 1 - variaveis
		char aposta[][] = new char[3][13];
		byte contDuplos = 0;
		byte contTriplos = 0;
		byte contX = 0;
		float valorAposta = 10;
		byte linha;
		byte coluna;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		for (coluna = 0; coluna <= 12; coluna++) {
			for(linha = 0; linha <= 2; linha++) {
				System.out.print("Digite a escolha da linha " + (linha+1) + 
						" do jogo " + (coluna+1) + " :");
				aposta[linha][coluna] = leia.next().charAt(0);
				if (aposta[linha][coluna] == 'X') {
					contX ++;
				}
			}
			if (contX == 2) {
				contDuplos++;
			} else if (contX == 3) {
				contTriplos++;
			}
			contX = 0;
		}
		
		valorAposta = (float)(valorAposta * Math.pow(2, contDuplos) * Math.pow(3, contTriplos));
		System.out.println("Valor da aposta: " + valorAposta);
		
		System.out.println(" JOGOS          1  2  3  4  5  6  7  8  9  10 11 12 13");
		for (linha = 0; linha <= 2; linha++) {
			if (linha == 0) {
				System.out.print("Time 1 vencedor ");
			} else if (linha == 1) {
				System.out.print("     Empate     ");
			} else {
				System.out.print("Time 2 vencedor ");
			}
			for (coluna = 0; coluna <= 12; coluna++) {
				System.out.print(aposta[linha][coluna] + "  " );
			}
			System.out.println();
		}

	}

}
