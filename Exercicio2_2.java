import java.util.*;
public class Exercicio2_2 {
	public static void main(String[] args) {
		// 1 - variáveis
		byte diaNasc;
		byte mesNasc;
		int anoNasc;
		byte diaHj;
		byte mesHj;
		int anoHj;
		int idade;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o dia de nascimento: ");
		diaNasc = leia.nextByte();
		System.out.print("Digite o mes de nascimento: ");
		mesNasc = leia.nextByte();
		System.out.print("Digite o ano de nascimento: ");
		anoNasc = leia.nextInt();
		
		System.out.print("Digite o dia de hoje: ");
		diaHj = leia.nextByte();
		System.out.print("Digite o mes de hoje: ");
		mesHj = leia.nextByte();
		System.out.print("Digite o ano de hoje: ");
		anoHj = leia.nextInt();
		
		// 3 - cálculos
		idade = anoHj - anoNasc;
		if ((mesNasc > mesHj) || (mesNasc == mesHj && diaNasc > diaHj)) {
			idade = idade - 1;
		} 
		
		// 4 - saídas
		System.out.println("A idade é: " + idade);

	}

}
