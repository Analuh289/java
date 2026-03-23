import java.util.*;
public class Exercicio2_8 {

	public static void main(String[] args) {
		 // variaveis
		float salario;
		int tempoCasa;
		float bonus;
		float vlrTransp;
		Scanner leia = new Scanner(System.in);
	// entrada de dados
		System.out.println("digite o salario do empregado: ");
		salario = leia.nextFloat();
		System.out.println("digite o tempo de casa do empregado: ");
		tempoCasa = leia.nextInt();
	// calculos
		if(tempoCasa <= 5) {
			if(salario <= 300) {
				bonus = 50;
				vlrTransp = salario * 5/100;
			}else {
				bonus = 80;
				vlrTransp = salario * 6/100;
			}
		}else if(tempoCasa <= 10) {
			if(salario <= 500) {
				bonus = salario * 15/100;
				vlrTransp = 70;
			}else if(salario >= 2000) {
				bonus = salario * 13/100;
				vlrTransp = 90;
			}else {
				bonus = salario * 12/100;
				vlrTransp = salario * 8/100;
			}
		}else {
			bonus = 300;
			vlrTransp = salario * 4/100;
		}
	// saidas de dados
		System.out.println("o valor do bonus é: " + bonus);
		System.out.println("o valor do vale transporte é: " + vlrTransp);

	}

}
