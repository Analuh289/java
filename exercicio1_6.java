import java.util.*;
public class Exercicio1_6 {

	public static void main(String[] args) {
		// variaveis
		float salario;
		float cheque1;
		float cheque2;
		float taxaJ1 , taxaJ2;
		float saldoFinal;
		
		// entrada de dados
		Scanner leia = new Scanner(System.in);
		System.out.println("o valor depositado: ");
		salario = leia.nextFloat();
		System.out.println("o primeiro cheque: ");
		cheque1 = leia.nextFloat();
		System.out.println("o segundo cheque: ");
		cheque2 = leia.nextFloat();
		
		
		// calculo 
		taxaJ1 = (float)(float)(cheque1 * 0.02/100);
		taxaJ2 = (float)(float)(cheque2* 0.02/100);
		saldoFinal = salario - (cheque1 + taxaJ1) - (cheque2 + taxaJ2);
		
		System.out.println("o saldo final é: " + saldoFinal);
		

	}

}
