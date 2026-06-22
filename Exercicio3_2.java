import java.util.*;
public class Exercicio3_2 {

	public static void main(String[] args) {
		// 1 - variáveis
		byte numero;
		long fatorial = 1;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o número para o cálculo do fatorial: ");
		numero = leia.nextByte();
		
		// 3 - cálculo
		while (numero > 1) {
			fatorial = fatorial * numero;
			numero --;
		}
		
		// 4 - saída
		System.out.println("O valor do fatorial é: " + fatorial);

	}

}
