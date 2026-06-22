import java.util.*;
public class Exercicio6_1 {

	public static void main(String[] args) {
		// 1 - variáveis
		String nome;
		byte fileira;
		byte cadeira;
		float precoPassagem;
		String mapaVoo[][] = new String[20][6];
		float somaPrecoPass = 0;
		float somaPreco_1aClasse = 0;
		byte contVagasJanela = 40;
		Scanner leia = new Scanner(System.in);
		
		do {
			// 2 - entrada de dados
			System.out.print("Digite o nome do passageiro (FIM p/ finalizar): ");
			nome = leia.nextLine();
			if (nome.equals("FIM")) {
				break;
			}
			
			do {
				System.out.print("Digite a Fileira do assento: ");
				fileira = leia.nextByte();
				if (fileira < 1 || fileira > 20) {
					System.out.println("Fileira inválida, digite de 1 a 20");
				}
			}while(fileira < 1 || fileira > 20);
			
			do {
				System.out.print("Digite a cadeira do assento: ");
				cadeira = leia.nextByte();
				if (cadeira < 1 || cadeira > 6) {
					System.out.println("Cadeira inválida, digite de 1 a 6");
				}
			}while(cadeira < 1 || cadeira > 6);
			
			// 3 - cálculos
			mapaVoo[ fileira - 1 ][ cadeira - 1 ] = nome;
			if (fileira <= 3) {
				precoPassagem = 900;
				somaPreco_1aClasse = somaPreco_1aClasse + precoPassagem;
			} else if (fileira <= 8) {
				precoPassagem = 700;
			} else {
				precoPassagem = 350;
			}
			somaPrecoPass = somaPrecoPass + precoPassagem;
			if (cadeira == 1 || cadeira == 6) {
				contVagasJanela --;
			}
			// 4 - saídas
			System.out.println("Preco da passagem: " + precoPassagem);
			leia.nextLine();
		}while( ! nome.equals("FIM"));
		
		System.out.println("Total faturado do voo: " + somaPrecoPass);
		System.out.println("Total faturado na 1a classe: " + somaPreco_1aClasse);
		System.out.println("Número de assentos vagos na janela: " + contVagasJanela);
		
		System.out.println();
		System.out.println("MAPA DO VOO");
		System.out.println("       1         2         3         4         5        6");
		for (byte linha = 0; linha <= 19; linha ++) {
			System.out.print(linha + 1);
			for (byte coluna = 0; coluna <= 5; coluna ++) {
				if (mapaVoo[linha][coluna] == null) {
					System.out.print("     VAZIO");
				} else {
					System.out.print("     " + mapaVoo[linha][coluna]);
				}
			}
			System.out.println();
		}
	}

}
