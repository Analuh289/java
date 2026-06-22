import java.util.*;
public class Exercicio10_2 {

	public static void main(String[] args) {
		// 1 - variáveis
		String nome;
		String loginGerado;
		String senhaGerada;
		boolean valido;
		Scanner leia = new Scanner(System.in);
		
		for (byte cont = 1; cont <= 30; cont ++) {
			do {
				System.out.print("Digite o nome (FIM para encerrar): ");
				nome = leia.nextLine().toUpperCase();
				if (nome.equalsIgnoreCase("fim")) {
					break;
				}
				valido = true;
				if (nome.length() < 15) {
					System.out.println("Nome inválido, digite 15 caracteres ou mais");
					valido = false;
				} else if (nome.charAt(0) == ' ' || nome.charAt( nome.length() - 1 ) == ' ') {
					System.out.println("Nome inválido, não digite espaço antes ou depois do nome");
					valido = false;
				} else if ( ! nome.contains(" ") ) {
					System.out.println("Nome inválido, digite pelo menos um sobrenome");
					valido = false;
				} else if ( nome.contains("  ")) {
					System.out.println("Nome inválido, digite apenas 1 espaçco entre sobrenomes");
					valido = false;
				} else {
					for (int x = 0; x < nome.length(); x ++ ) {
						if ((nome.charAt(x) < 'A' || nome.charAt(x) > 'Z') && 
								nome.charAt(x) != ' ') {
							System.out.println("Nome inválido, digite nome com apenas letras");
							valido = false;
							break;
						}
					}
				}
			}while( ! valido);
			
			if (nome.equalsIgnoreCase("fim")) {
				break;
			}
			
			// 3 - calculo
			loginGerado = gerarLogin(nome);
			System.out.println("Login : " + loginGerado);
			senhaGerada = gerarSenha(loginGerado);
			System.out.println("Senha: " + senhaGerada);
		}

	}
	
	public static String gerarLogin (String nome) {
		String login = nome.substring(0,1);
		for (int x = 1; x < nome.length(); x ++ ) {
			if (nome.charAt(x) == ' ') {
				login = login + nome.charAt(x+1);
			}
		}
		return login;
	}
	
	public static String gerarSenha (String login) {
		String senha = "";
		for (int x = 0; x < login.length(); x++) {
			senha = senha + (int) login.charAt(x) / 10;
		}
		return senha;
	}

}
