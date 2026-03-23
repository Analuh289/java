import java.util.*;
public class Exercicio2_4 {

	public static void main(String[] args) {
	 String nome;
	 float nota1;
	 float nota2;
	 float nota3;
	 float media;
	 
	 Scanner leia = new Scanner(System.in);
	 System.out.println("Digite o nome do aluno: ");
	 nome = leia.next();
	 System.out.println("Digite a primeira nota: ");
	 nota1 = leia.nextFloat();
	 System.out.println("Digite a segunda nota: ");
	 nota2 = leia.nextFloat();
	 System.out.println("Digite a terceira nota: ");
	 nota3 = leia.nextFloat();
	 
	 media = nota1 + nota2 + nota3 / 3;
	 
	 if(media < 4) {
		 System.out.println("Aluno reprovado: ");
	 }else if(media < 6.9) {
		 System.out.println("Aluno em recuperaçao: ");
	 }else {
		 System.out.println("Aluno aprovado: ");
	 }

	}

}
