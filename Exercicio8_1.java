import java.util.*;
public class Exercicio8_1 {

	public static void main(String[] args) {
		int numA, numB, numC;
		int resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		numA = leia.nextInt();
		System.out.print("Digite o valor de B: ");
		numB = leia.nextInt();
		System.out.print("Digite o valor de C: ");
		numC = leia.nextInt();

		resultado = somarInteirosEntreAeB(numA, numB);
		System.out.println("A soma dos inteiros entre A e B é: " + resultado);
		
		imprimirIntEntreAeB_DivisivelPorC(numA, numB, numC);
		
		System.out.println("Percentual de C em relação a A: " + 
				calcularPercentual_C_sobre_A(numA, numC));
	}

	public static int somarInteirosEntreAeB (int a, int b) {
		int soma = 0;
		for (int x = a + 1; x < b; x ++) {
			soma = soma + x;
		}
		return soma;
	}
	
	public static void imprimirIntEntreAeB_DivisivelPorC (int a, int b, int c) {
		for (int x = a + 1; x < b; x ++) {
			if (x % c == 0) {
				System.out.println(x + " é divisível por " + c);
			}
		}
	}
	
	public static float calcularPercentual_C_sobre_A (int a, int c) {
		float percentual;
		percentual = c * 100 / (float)a;
		return percentual;
	}
}
