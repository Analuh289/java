import java.util.*;
public class Exercicio8_3 {

	static String vetCidades[] = {"BELO HORIZONTE","SAO PAULO",
			"RIO DE JANEIRO","SALVADOR","CURITIBA","MANAUS"};
	
	public static void main(String[] args) {
		// 1 - variáveis
		String nomeHosp[] = new String[100];
		byte diaEntrada;
		byte diaSaida;
		String tipoQuarto;
		String cidadeHotel;
		float vlrConta[] = new float[100];
		float somaVlrConta = 0;
		byte contHosp;
		boolean encontrou;
		float mediaVlrConta;
		Scanner leia = new Scanner(System.in);
		
		for (contHosp = 0; contHosp < 100; contHosp ++) {
			System.out.print("Digite o nome do hóspede (Fim p ecerrar): ");
			nomeHosp[contHosp] = leia.nextLine();
			if (nomeHosp[contHosp].equalsIgnoreCase("fim")) {
				break;
			}
			
			do {
				System.out.print("Digite o dia da entrada no hotel: ");
				diaEntrada = leia.nextByte();
				System.out.print("Digite o dia da saída do hotel: ");
				diaSaida = leia.nextByte();
				if (diaEntrada >= diaSaida) {
					System.out.println("Valor invalido, digite Saída maior que a Entrada");
				}		
			}while(diaEntrada >= diaSaida);
			
			do {
				System.out.print("Digite o tipo de quarto: ");
				tipoQuarto = leia.next();
				if (! tipoQuarto.equals("STANDARD") && 
						! tipoQuarto.equals("LUXO") &&
						! tipoQuarto.equals("SUPER-LUXO")) {
					System.out.println("Tipo de quarto inválido, "
							+ "digite STANDARD, LUXO ou SUPER-LUXO");
				}
			}while(! tipoQuarto.equals("STANDARD") && 
					! tipoQuarto.equals("LUXO") &&
					! tipoQuarto.equals("SUPER-LUXO"));
			
			leia.nextLine();
			do {
				System.out.print("Digite a cidade onde está localizado o hotel: ");
				cidadeHotel = leia.nextLine();
				encontrou = cidadeEhValida(cidadeHotel);
				if ( ! encontrou) {
					System.out.println("Não há hoteis neste cidade");
				}
			}while(! encontrou );
			
			// 3 - cálculos
			vlrConta[contHosp] = calcularConta(diaEntrada, diaSaida, tipoQuarto);
			somaVlrConta = somaVlrConta + vlrConta[contHosp];
			System.out.println("O valor da conta é: " + vlrConta[contHosp]);			
			
		} // fim do for
 
		mediaVlrConta = somaVlrConta / contHosp;
		System.out.println();
		System.out.println("Relatório de contas acima da média");
		System.out.println("Nome Hóspede   Conta");
		System.out.println("-------------- -----");
		for (byte x = 0; x < contHosp; x ++) {
			if (vlrConta[x] > mediaVlrConta) {
				System.out.println(nomeHosp[x] + "         " + vlrConta[x]);
			}
		}

	} // fim do main
	
	public static boolean cidadeEhValida (String cidade) {
		for (byte x = 0; x < vetCidades.length; x ++ ) {
			if (cidade.equals(vetCidades[x])) {
				return true;
			}
		}
		
		return false;
	}
	
	public static float calcularConta( byte entrada, byte saida, String quarto) {
		float vlrDiaria;
//		float vlrConta;
		if (quarto.equals("STANDARD")) {
			vlrDiaria = 120;
		}else if (quarto.equals("LUXO")) {
			vlrDiaria = 150;
		} else {
			vlrDiaria = 180;
		}
		
//		vlrConta = (saida - entrada) * vlrDiaria;
//		return vlrConta;
		
		return (saida - entrada) * vlrDiaria;
		
	}

}
