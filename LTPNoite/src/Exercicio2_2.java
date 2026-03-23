import java.util.*;
public class Exercicio2_2 {

	public static void main(String[] args) {
		// variaveis
		int idade;
		int diaNasc;
		int mesNasc;
		int anoNasc;
		int diaAtual;
		int mesAtual;
		int anoAtual;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o dia de nascimento: ");
		diaNasc = leia.nextInt();
		System.out.println("Digite o mes de nascimento: ");
		mesNasc = leia.nextInt();
		System.out.println("Digite o ano de nascimento: ");
		anoNasc = leia.nextInt();
		
		System.out.println("Digite o dia atual: ");
		diaAtual = leia.nextInt();
		System.out.println("Digite o mes atual: ");
		mesAtual = leia.nextInt();
		System.out.println("Digite o ano de atual: ");
		anoAtual = leia.nextInt();
		
		idade = anoAtual - anoNasc;
		
		if((mesNasc == mesAtual) || (mesNasc == mesAtual && diaNasc > diaAtual)) {
			idade = idade - 1;
		}
		System.out.println("a idade da pessoa é: " + idade);
	}

}
