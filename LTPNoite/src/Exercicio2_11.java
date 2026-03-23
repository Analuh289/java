import java.util.*;
public class Exercicio2_11 {

	public static void main(String[] args) {
    int idade;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("digite a idade: ");
    idade = leia.nextInt();
    
    if(idade < 18) {
    	System.out.println("voce é menor de idade.");
    }else {
    	System.out.println("voce é maior de idade.");
    }
	}

}
