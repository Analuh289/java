import java.util.*;
public class Exercicio2_1 {
	public static void main(String[] args) {
		// 1 - variáveis
		byte idade;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite a idade da pessoal: ");
		idade = leia.nextByte();
		
		// 3 - cálculo e saída
		if (idade >= 18) { 
			System.out.println("Você é maior de idade");
		} else {   // idade < 18
			System.out.println("Você é menor de idade");
		}
	}

}
