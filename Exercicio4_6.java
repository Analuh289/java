import java.util.*;
public class Exercicio4_6 {

	public static void main(String[] args) {
		// 1 - variáveis
		byte numVoo;
		byte quantPassagens;
		float precoPassagem;
		float vlrArrecadadoVoo;
		float maiorVlrArrecadado = 0;
		byte numVooMaiorVlrArrec = 0;
		float somaVlrArrecadado = 0;
		float menorPrecoPassagem = 200;
		byte numVooMenorPrecoPass = 0;
		Scanner leia = new Scanner(System.in);
		
		for (byte cont = 1; cont <= 3; cont++) {
			// 2 - entrada de dados
			do {
				System.out.print("Digite o número do voo: ");
				numVoo = leia.nextByte();
				if (numVoo < 1 || numVoo > 3) {
					System.out.println("Voo inválido, digite 1, 2 ou 3");
				}
			}while(numVoo < 1 || numVoo > 3);
			
			do {
				System.out.print("Digite a quantidade de passagens vendida: ");
				quantPassagens = leia.nextByte();
				if (quantPassagens < 0 || quantPassagens > 100) {
					System.out.println("Quantidade inválida, digite de 0 a 100");
				}
			}while(quantPassagens < 0 || quantPassagens > 100);
			
			// 3 - cálculos
			if (numVoo == 1) {
				precoPassagem = 100;
			} else if (numVoo == 2) {
				precoPassagem = 150;
			} else {
				precoPassagem = 200;
			}
			
			if (quantPassagens >= 70) {
				precoPassagem = precoPassagem * 40/100;
			} else if (quantPassagens >= 50) {
				precoPassagem = precoPassagem * 70/100;
			}
			
			vlrArrecadadoVoo = precoPassagem * quantPassagens;
			if (vlrArrecadadoVoo > maiorVlrArrecadado) {
				maiorVlrArrecadado = vlrArrecadadoVoo;
				numVooMaiorVlrArrec = numVoo;
			}
			somaVlrArrecadado = somaVlrArrecadado + vlrArrecadadoVoo;
			if (precoPassagem < menorPrecoPassagem) {
				menorPrecoPassagem = precoPassagem;
				numVooMenorPrecoPass = numVoo;
			}
			
			// 4 - saídas
			System.out.println("Preco da passagem: " + precoPassagem);
		} // fim do for
		
		System.out.println("Maior valor arecadado em voo: " + maiorVlrArrecadado);
		System.out.println("Número do voo maior valor arrecadado: " + numVooMaiorVlrArrec);
		System.out.println("Média de arrecadação dos voos: " + somaVlrArrecadado / 3);
		System.out.println("Menor preço de passagem: " + menorPrecoPassagem);
		System.out.println("Voo do menor preço de passagem: " + numVooMenorPrecoPass);
 
	}

}
