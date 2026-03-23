import java.util.*;
public class Exercicio2_7 {

	public static void main(String[] args) {
		float peso;
		float altura;
		float imc;
		float pesoMin;
		float pesoMax;
		
		Scanner leia = new 	Scanner(System.in);
		System.out.println("qual é o peso em kg da pessoa: ");
		peso = leia.nextFloat();
		System.out.println("qual é a altura em m da pessoa: ");
		altura = leia.nextFloat();
		
		imc = peso/ altura;
		
		if(imc < 20) {
			System.out.println("abaixo do peso! ");
		}else if(imc <= 25) {
			System.out.println("peso ideal!");
		}else {
			System.out.println("acima do peso!");
		}

		
		pesoMin = 20 * (altura * altura);
		pesoMax = 25 * (altura * altura);
		System.out.println("o peso minimo ideal: %.2f kg " + pesoMin );
		System.out.println("peso maximo ideal: %.2f kg\\n " + pesoMax);
	}
	

}
