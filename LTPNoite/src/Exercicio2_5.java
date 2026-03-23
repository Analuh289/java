import java.util.*;
public class Exercicio2_5 {

	public static void main(String[] args) {
	int cand1Secao1;;
	int cand2Secao1;;
	int cand3Secao1;
	int cand1Secao2;
	int cand2Seçao2;
	int cand3Secao2;
	int totalCand1;
	int totalCand2;
	int totalCand3;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println(" SEÇAO UM: ");
	System.out.println("o numero de votos do candidato um: ");
	cand1Secao1 = leia.nextInt();
	System.out.println("o numero de votos do candidato dois: ");
	cand2Secao1 = leia.nextInt();
	System.out.println("o numero de votos do candidato tres: ");
	cand3Secao1 = leia.nextInt();
	
	System.out.println(" SEÇAO DOIS : ");
	System.out.println("o numero de votos do candidato um: ");
	cand1Secao2 = leia.nextInt();
	System.out.println("o numero de votos do candidato dois: ");
	cand2Seçao2 = leia.nextInt();
	System.out.println("o numero de votos do candidato tres: ");
	cand3Secao2 = leia.nextInt();
	
	totalCand1 = cand1Secao1 + cand1Secao2;
	totalCand2 = cand2Secao1 + cand2Seçao2;
	totalCand3 = cand3Secao1 + cand3Secao2;
	
	System.out.println("total de votos do candidato um é: " + totalCand1);
	System.out.println("total de votos do candidato dois é: " + totalCand2);
	System.out.println("total de votos do candidato tres é: " + totalCand3);
	
	if(totalCand1 > totalCand2 && totalCand1 > totalCand3) {
		System.out.println("o vencedor é o candidato um!");
	}else if(totalCand2 > totalCand1 && totalCand2 > totalCand3) {
		System.out.println("o vencedor é o candidato dois! ");
	}else {
		System.out.println("o vencedor é o candidato tres! ");
	}

	}

}
