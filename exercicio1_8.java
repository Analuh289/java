import java.util.*;
public class exercicio2_2 {

	public static void main(String[] args) {
		int num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		num = leia.nextInt();
		
		if(num > 0) {
			System.out.println("POSITIVO!");
		}else if(num == 0) {
			System.out.println("ZERO!");
		}else {
			System.out.println("NEGATIVO!");
		}

	}

}
