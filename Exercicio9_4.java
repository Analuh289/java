import java.util.*;
public class Exercicio9_4 {

	public static void main(String[] args) {
		// 1 - variáveis
		String placa;
		String dataMulta;
		float vlrMulta;
		float somaVlrMulta = 0;
		int contMulta = 0;
		float menorVlrMulta = 99999;
		boolean valido;
		Scanner leia = new Scanner(System.in);
		
		do {
			do {
				System.out.print("Digite a placa do carro (FIM p/ encerrar): ");
				placa = leia.next();
				if (placa.equalsIgnoreCase("fim")) {
					break;
				}
				valido = true;
				if (placa.length() != 7) {
					System.out.println("Digite a placa com 7 caracteres, "
							+ "formato XXX9999");
					valido = false;
				} else {
					for (byte x = 0; x <= 6; x ++) {
						if (x <= 2) {
							if (placa.charAt(x) < 'A' || placa.charAt(x) > 'Z') {
								System.out.println("Placa Inválida, digite letra "
										+ "maiúscula nas 3 primeiras posições");
								valido = false;
								break;
							} 
						} else {
							if (placa.charAt(x) < '0' || placa.charAt(x) > '9') {
								System.out.println("Placa Inválida, digite número "
										+ "nas 4 últimas posições");
								valido = false;
								break;
							}
						}
					}
				}
			}while( ! valido );
			
			if (placa.equalsIgnoreCase("fim")) {
				break;
			}
			
			do {
				System.out.print("Digite a data da multa: ");
				dataMulta = leia.next();
			}while( ! dataEhValida(dataMulta) );
			
			do {
				System.out.print("Digite o valor da multa: ");
				vlrMulta = leia.nextFloat();
				if (vlrMulta <= 0) {
					System.out.println("Valor da multa inválido, digite acima de zero");
				}
			}while(vlrMulta <= 0);
				
			// 3 - cálculos
			somaVlrMulta = somaVlrMulta + vlrMulta;
			contMulta ++;
			if (vlrMulta < menorVlrMulta) {
				menorVlrMulta = vlrMulta;
			}
			
		}while(  ! placa.equalsIgnoreCase("fim") );
		
		System.out.println("Soma das mutas: " + somaVlrMulta);
		System.out.println("Média de valor das multas: " + somaVlrMulta / contMulta);
		System.out.println("Multa de menor valor: " + menorVlrMulta);

	} // fim do main

	public static boolean dataEhValida (String data) {
		int dia, mes, ano;
		
		if (data.length() != 10 || data.charAt(2) != '/' || data.charAt(5) != '/') {
			System.out.println("Data inválida, digite 10 caracteres no formato DD/MM/AAAA");
			return false;
		}
		
		try {
			dia = Integer.parseInt( data.substring(0,2) );
			mes = Integer.parseInt( data.substring(3,5) );
			ano = Integer.parseInt( data.substring(6) );
		} catch (NumberFormatException erro) {
			System.out.println("Data inválida, digite dia, mes e ano numéricos");
			return false;
		}
		
		if (ano > 2026) {
			System.out.println("Data Inválida, digite ano máximo 2026");
			return false;
		}
		
		if (mes < 1 || mes > 12) {
			System.out.println("Data Inválida, digite mes entre 1 e 12");
			return false;
		}
		
		if (dia < 1 || dia > 31) {
			System.out.println("Data inválida, digite dia entre 1 e 31");
			return false;
		}
		
		if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
			System.out.println("Data inválida, meses 4, 6, 9 e 11, digite dia até 30");
			return false;
		}
		
		if (mes == 2 ) {
			if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) { // ano bissexto
				if (dia > 29) {
					System.out.println("Data Inválida, Fevereiro em ano bissexto máximo 29 dias");
					return false;
				}
			} else {
				if (dia > 28) {
					System.out.println("Data Inválida, Fevereiro neste ano, máximo 28 dias");
					return false;
				}
			}
		}
		
		return true;
		
	}
}
