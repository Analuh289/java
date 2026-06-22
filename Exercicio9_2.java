import java.util.*;
public class Exercicio9_2 {

	public static void main(String[] args) {
		// 1 - variáveis
		String codigo;
		boolean valido;
		String digVerifCalculado;
		String digVerifDigitado;
		
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		do {
			System.out.print("Digite o código: ");
			codigo = leia.next();
			valido = true;
			if (codigo.length() != 11) {
				System.out.println("Código inválido, digite 11 caracteres");
				valido = false;
			} else {
//				for (byte x = 0; x <= 10; x ++) {
//					if (Character.digit( codigo.charAt(x) , 10 ) == -1) {
//						System.out.println("Código inválido, digite 11 números");
//						valido = false;
//						break;
//					}
//				}
				for (byte x = 0; x <= 10; x ++) {
					if ( codigo.charAt(x) < '0' || codigo.charAt(x) > '9') {
						System.out.println("Código inválido, digite 11 números");
						valido = false;
						break;
					}
				}
			}
		}while( ! valido );  // valido == false
		
		// 3 - cálculos
		digVerifCalculado = calcularDigVerificador(codigo);
		digVerifDigitado = codigo.substring(9);
		if (digVerifCalculado.equals(digVerifDigitado)){
			System.out.println("DÍgitos corretos");
		} else {
			System.out.println("DÍgitos inválidos");
		}
		
//		if ( calcularDigVerificador(codigo).equals(codigo.substring(9)) ) { 
//			System.out.println("DÍgitos corretos");
//		} else {
//			System.out.println("DÍgitos inválidos");
//		}

	} // fim do main

	public static String calcularDigVerificador (String cod) {
		int soma = 0;
		int mult = 1;
		int numero;
		int dig1, dig2;
		for (byte x = 0; x <= 8; x ++) {
			numero = Character.digit( cod.charAt(x) , 10 );
			soma = soma + numero;
			mult = mult * numero;
		}
		dig1 = soma / 10;
		dig2 = mult % 10;		
		return dig1 + "" + dig2;
		
//		String multSTR = String.valueOf(mult);
//		String dig2STR = multSTR.substring( multSTR.length() - 1 );
//		return dig1 + dig2STR;
		
	}
}
