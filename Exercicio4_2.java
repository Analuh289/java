import java.util.*;
public class Exercicio4_2 {

	public static void main(String[] args) {
		// 1 - variáveis
		byte voto;
		int contCand1 = 0;
		int contCand2 = 0;
		int contCand3 = 0;
		int contNulo = 0;
		int contBranco = 0;
		Scanner leia = new Scanner(System.in);
		
		for (int x = 1 ; x <= 10; x++) {
			// 2 - entrada de dados
			do {
				System.out.print("Digite o " + x + "o. voto (1 a 5): ");
				voto = leia.nextByte();		
				if (voto < 1 || voto > 5) {
					System.out.println("Voto inválido, digite novamente, mas de 1 a 5");
				}
			}while(voto < 1 || voto > 5);
			
			// 3 - cálculos
			if (voto == 1) {
				contCand1 ++;
			} else if (voto == 2) {
				contCand2 ++;
			} else if (voto == 3) {
				contCand3 ++;
			} else if (voto == 4) {
				contNulo ++;
			} else {
				contBranco ++;
			}
		}
		
		// 4 - saídas
		if (contCand1 > contCand2 && contCand1 > contCand3) {
			System.out.println("Candidato 1 é o vencedor");
		} else if (contCand2 > contCand3) {
			System.out.println("Candidato 2 é o vencedor");
		} else {
			System.out.println("Candidato 3 é o vencedor");
		}
		
		System.out.println("Quantidade de votos Nulos: " + contNulo);
		System.out.println("Quantidade de votos Brancos: " + contBranco);
		

	}

}
