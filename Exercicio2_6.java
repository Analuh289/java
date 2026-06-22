import java.util.*;
public class Exercicio2_6 {

	public static void main(String[] args) {
		// 1 - variável
		int lado1;
		int lado2;
		int lado3;
		Scanner leia = new Scanner (System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o tamanho do primeiro lado: ");
		lado1 = leia.nextInt();
		System.out.print("Digite o tamanho do segundo lado: ");
		lado2 = leia.nextInt();
		System.out.print("Digite o tamanho do terceiro lado: ");
		lado3 = leia.nextInt();
		
		// 3 - cálculo e 4 - saída
		if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
			System.out.println("Estes 3 lados não formam um triângulo");
		} else if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triângulo Isóceles");
		} else {
			System.out.println("Triangulo Escaleno");
		}
		
	}

}
