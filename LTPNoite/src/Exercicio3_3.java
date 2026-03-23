import java.util.*;
public class Exercicio3_3 {

	public static void main(String[] args) {
    int vinhoC = 0;
    int vinhoM = 0;
    int vinhoT = 0;
    int estoque = 1;
    
    char tipo;
    
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Digite o tipo de vinho (C, M, T) ou 'F' para finalizar: ");
    tipo = leia.next().toUpperCase().charAt(0);
    
    while(tipo != 'F') {
    	if(tipo == 'C') {
    		vinhoC++;
    		estoque++;
    	}else if(tipo == 'M') {
    		vinhoM++;
    		estoque++;
    	}else if(tipo == 'T') {
    		vinhoT++;
    		estoque++;
    	}else {
    		System.out.println("Tipo invalido! Use C, M, T ou F.");
    	}
    	
    	System.out.println("Proximo vinho (ou F para sair): ");
    	tipo = leia.next().toUpperCase().charAt(0);
    }
    
    System.out.println("----- RELATÓRIO DE ESTOQUE -----");
    System.out.println("Cabernet savion: " + vinhoC);
    System.out.println("Malbec: "+ vinhoM);
    System.out.println("Tanat: " + vinhoT);
    System.out.println("---------------------------");
    System.out.println("Quantidade total de estoque: "+ estoque);
    
	}

}
