import java.util.*;
public class Exercicio3_1 {

	public static void main(String[] args) {
    int nota;
    int cont = 0;
    int quantAprovados = 0;
    int quantReprovados = 0;
    
    Scanner leia = new Scanner(System.in);
    
    while(cont <= 10) {
    	 System.out.println("digite a nota do aluno: ");
    	 nota = leia.nextInt();
    	if(nota >= 60) {
    		System.out.println("Aprovado! ");
    		quantAprovados++;
    	}else {
    		System.out.println("Reprovado!");
    		quantReprovados++;
    	}
    	cont++;
    } 
    System.out.println("Digite a quantidade de alunos aprovados: " + quantAprovados);
    System.out.println("Digite a quantidade de alunos reprovados: " + quantReprovados);
	}

}
