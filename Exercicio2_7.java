import java.util.*;
public class Exercicio2_7 {

	public static void main(String[] args) {
		// 1 - variáveis
		float peso;
		float altura;
		float imc;
		float pesoIdealMax;
		float pesoIdealMin;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o peso do atleta: ");
		peso = leia.nextFloat();
		System.out.print("Digite a altura do atleta: ");
		altura = leia.nextFloat();
		
		// 3 -cálculos
		imc = peso / (altura * altura);
		pesoIdealMax = 25 * altura * altura;
		pesoIdealMin = 20 * altura * altura;
		
		// 4 - saídas
		if (imc < 20) {
			System.out.println("Atleta abaixo do peso");
		} else if (imc <= 25) {
			System.out.println("Atleta no peso ideal");
		} else {
			System.out.println("Atleta acima do peso");
		}
		System.out.println("Indice de Massa Corporal: " + imc);
		System.out.println("Peso ideal mínimo: " + pesoIdealMin);
		System.out.println("Peso ideal máximo: " + pesoIdealMax);

	}

}
