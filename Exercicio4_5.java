import java.util.*;
public class Exercicio4_5 {

	public static void main(String[] args) {
		// 1 - variáveis
		String jog1;
		String jog2;
		Scanner leia = new Scanner (System.in);
		
		do {
			// 2 - entrada de dados
			System.out.print("Digite a jogada do jogador 1: ");
			jog1 = leia.next();
			System.out.print("Digite a jogada do jogador 2: ");
			jog2 = leia.next();
			
			// testar o flag
			if ( ! jog1.equals("pedra") && ! jog1.equals("papel") && ! jog1.equals("tesoura") ||
					! jog2.equals("pedra") && ! jog2.equals("papel") && ! jog2.equals("tesoura")) {
				System.out.println("Jogo terminado.");
				break;
			}
			
			// testar o empate e o vencedor
			if (jog1.equals(jog2)) {
				System.out.println("Empate!");
			} else if ( jog1.equals("pedra") && jog2.equals("tesoura") || 
					jog1.equals("papel") && jog2.equals("pedra") ||
					jog1.equals("tesoura") && jog2.equals("papel") ) {
				System.out.println("Jogador 1 venceu o jogo!");
			} else {
				System.out.println("Jogador 2 venceu o jogo!");
			}
				
		} while (true);

	}

}
