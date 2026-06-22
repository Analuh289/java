import java.util.*;
public class Exercicio7_1 {

	public static void main(String[] args) {
		// 1 - variáveis
		String cidades[] = new String[20];
		int distancias[] = new int[20];
		String cidadePesquisa;
		byte cont;
		boolean encontrou;
		byte x;
		float preco;
		int tempoVoo;
		byte numEscala;
		Scanner leia = new Scanner(System.in);
		
		for (cont = 0; cont <= 19; cont++) {
			do {
				System.out.print("Digite o nome da cidade (fim p/ encerrar): ");
				cidades[cont] = leia.nextLine();
				if (cidades[cont].equals("")) {
					System.out.println("Digitação do nome da cidade é obrigatória");
				}
			}while(cidades[cont].equals(""));
			
			if (cidades[cont].equalsIgnoreCase("fim")) {
				break;
			}
			
			do {
				System.out.print("Digite a distância em KM até Belo Horizonte: ");
				distancias[cont] = leia.nextInt();
				if (distancias[cont] < 500) {
					System.out.println("Distância inválida, digite 500 ou acima");
				}
			}while(distancias[cont] < 500);
			
			leia.nextLine();
		} // fim do for
		
		do {
			System.out.print("Digite o cidade de destino para o voo (sair p/ finalizar): ");
			cidadePesquisa = leia.nextLine();
			if (cidadePesquisa.equalsIgnoreCase("sair")) {
				break;
			}
			
			encontrou = false;
			for (x = 0; x < cont; x ++) {
				if (cidadePesquisa.equalsIgnoreCase(cidades[x])) {
					encontrou = true;
					break;
				}
			}
			
			if (encontrou) {
				preco = 0.25f * distancias[x];
				tempoVoo = (int)(distancias[x] / (float)800 * 60);
				numEscala = (byte)(tempoVoo / 180);
				System.out.println("Preço da passagem: " + preco);
				System.out.println("Tempo de voo em minutos: " + tempoVoo);
				System.out.println("Número de escalas: " + numEscala);
			} else {
				System.out.println("Não há voos para esta cidade");
			}
			
		}while(! cidadePesquisa.equalsIgnoreCase("sair"));

	}

}
