import java.util.*;
public class Exercicio3_2 {

	public static void main(String[] args) {
    int num = 0;
    long fatorial = 1;
    int cont;
    
    Scanner leia = new Scanner(System.in);
    
    System.out.println("digite um numero: ");
    num = leia.nextInt();
    
    cont = num;
    
    while(cont > 1) {
    	fatorial = fatorial * cont;
    	
    	cont--;
    }
    System.out.println("o fatorial de: " + num + " é " + fatorial );
	}

}
