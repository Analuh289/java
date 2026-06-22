import java.util.*;
public class Exercicio10_1 {

	public static void main(String[] args) {
		// 1 - variáveis
		String nomeDigitado;
		String nomeConvertido;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome em letras minúsculas: ");
		nomeDigitado = leia.nextLine();
		
		System.out.println(nomeDigitado);
		nomeConvertido = eliminarEspacoEsquerda(nomeDigitado);
		System.out.println(nomeConvertido);
				
		System.out.println( converterPrimLetraMaiusc(nomeConvertido) );
		nomeConvertido = convertePrimLetraCadaNomeMaiusc(nomeConvertido);
		System.out.println(nomeConvertido);
		

	}

	public static String converterPrimLetraMaiusc (String nome) {
		nome = Character.toUpperCase( nome.charAt(0) ) + nome.substring(1);
		return nome;
	}
	
	public static String convertePrimLetraCadaNomeMaiusc (String nome) {
		nome = converterPrimLetraMaiusc(nome);
		
		for (int x = 1; x < nome.length(); x ++ ) {
			if (nome.charAt(x) == ' ') {
				nome = nome.substring(0, x + 1 ) + 
						Character.toUpperCase( nome.charAt( x + 1 )) + nome.substring( x + 2 );
			}
		}
		return nome;
	}
	
	public static String eliminarEspacoEsquerda (String nome) {
		while (nome.charAt(0) == ' ') {
			//nome = nome.substring(1);
			nome = nome.replaceFirst(" ","");
		}
		return nome;
	}
}
