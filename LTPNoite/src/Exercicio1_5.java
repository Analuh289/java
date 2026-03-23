import java.util.*;
public class Exercicio1_5 {

	public static void main(String[] args) {
		// variaveis
		int pe;
		float pol; 
		float cm;
		float jarda;
		float milha;
		
		// entrada de dados
		Scanner leia = new Scanner(System.in);
		System.out.println("digite a medida em pes: ");
		pe = leia.nextInt();
		
		// calculo 
		pol = pe * 12;
		cm = (float)(pol * 2.54);
        jarda = pe / 3;
        milha = jarda / 1760;
        
        // saida de dados
        System.out.println("pé: " + pe);
        System.out.println("polegadas: " + pol);
        System.out.println("centimetros: " + cm);
        System.out.println("jarda: " + jarda);
        System.out.println("milha: " + milha);
	}

}
