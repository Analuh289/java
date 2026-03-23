import java.util.*;
public class Exercicio2_6 {

	public static void main(String[] args) {
		float lado1;
		float lado2;
		float lado3;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("digite o primeiro lado: ");
		lado1 = leia.nextFloat();
		System.out.println("digite o segundo lado: ");
		lado2 = leia.nextFloat();
		System.out.println("digite o terceiro lado: ");
		lado3 = leia.nextFloat();
		
		if(lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
			System.out.println("nao é triangulo! ");
		}else if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("triangulo equilatero! ");
		}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("triangulo isoceles! ");
		}else {
			System.out.println("triangulo escaleno!");
		}

	}

}
