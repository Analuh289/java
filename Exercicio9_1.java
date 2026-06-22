import java.util.*;
public class Exercicio9_1 {

	public static void main(String[] args) {
		// 1 - variáveis
		String dataHoje;
		String dataNasc;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite a data de Hoje (DD/MM/AAAA): ");
		dataHoje = leia.next();
		System.out.print("Digite a data de Nascimento (DD/MM/AAAA): ");
		dataNasc = leia.next();
		// 3 - cálculo saída
		System.out.println("A idade é: " + calcularIdade(dataHoje, dataNasc));

	}
	
	public static int calcularIdade (String dtHoje, String dtNasc) {
		int idade;	
		int diaHoje;
		int mesHoje;
		int anoHoje;
		int diaNasc;
		int mesNasc;
		int anoNasc;
		
		diaHoje = Integer.parseInt(dtHoje.substring(0,2));
		mesHoje = Integer.parseInt(dtHoje.substring(3,5));
		anoHoje = Integer.parseInt(dtHoje.substring(6));
		
		diaNasc = Integer.parseInt(dtNasc.substring(0,2));
		mesNasc = Integer.parseInt(dtNasc.substring(3,5));
		anoNasc = Integer.parseInt(dtNasc.substring(6));

		idade = anoHoje - anoNasc;
		if (mesNasc > mesHoje  ||  mesNasc == mesHoje && diaNasc > diaHoje) {
			idade --;
		} 
		return idade;
		
	}

}
