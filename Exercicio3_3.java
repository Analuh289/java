import java.util.*;
public class Exercicio3_3 {

	public static void main(String[] args) {
		// 1 - variáveis
		char tipoVinho = 'X';
		int cont = 0;
		int contTanat = 0;
		int contMalbec = 0;
		int contCabernet = 0;
		Scanner leia = new Scanner(System.in);
		
		while (tipoVinho != 'F') {
			// 2 - entrada de dados
			System.out.print("Digite o tipo de vinho (T, M ou C) (F para finalizar): ");
			tipoVinho = leia.next().charAt(0);
			if (tipoVinho == 'F') {
				break;
			}
			
			// 3 - cálculos
			if (tipoVinho == 'T') {
				contTanat ++;
			} else if (tipoVinho == 'C') {
				contCabernet ++;
			} else {
				contMalbec ++;
			}
			cont ++;
		}
		System.out.println("Quatidade total de vinhos: " + cont);
		System.out.println("Quantidade de vinhos Tanat: " + contTanat);
		System.out.println("Quantidade de vinhos Cabernet: " + contCabernet);
		System.out.println("Quantidade de vinhos Malbec: " + contMalbec);
		
		

	}

}
