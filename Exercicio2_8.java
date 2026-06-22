import java.util.*;
public class Exercicio2_8 {

	public static void main(String[] args) {
		// 1 - variáveis
		float salario;
		int tempoCasa;
		float bonus;
		float valeTransp;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o tempo de casa do empregado: ");
		tempoCasa = leia.nextInt();
		System.out.print("Digite o salário do empregado: ");
		salario = leia.nextFloat();
		
		// 3- cálculos
		if (tempoCasa <= 5) {
			if (salario <= 300) {
				bonus = 50;
				valeTransp = salario * 5/100;
			} else {
				bonus = 80;
				valeTransp = salario * 6/100;
			}
		} else if (tempoCasa <= 10) {
			if (salario <= 500) {
				bonus = salario * 15/100;
				valeTransp = 70;						
			} else if (salario <= 2000) {
				bonus = salario * 13/100;
				valeTransp = 90;
			} else {
				bonus = salario * 12/100;
				valeTransp = salario * 8/100;
			}
		} else {
			bonus = 300;
			valeTransp = salario * 4/100;
		}
		// 4 - saídas
		System.out.println("Valor do Bonus: " + bonus);
		System.out.println("Valor do vale transporte: " + valeTransp);
		
	}

}
