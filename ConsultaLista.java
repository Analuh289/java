import java.io.*;
import java.util.*;
public class ConsultaLista {
	public static class Aluno {
		public char ativo;
		public String matricula;
		public String nomeAluno;
		public String dtNasc;
		public float mensalidade;
		public char sexo;
	}
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		RandomAccessFile arqAluno;
		Scanner leia = new Scanner(System.in);
		byte opcao;
		String matriculaChave;
		char sexoAux;
		long posicaoRegistro;
		boolean encontrou;

		do {
			do {
				System.out.println(" ***************  CONSULTA DE ALUNOS  ***************** ");
				System.out.println(" [1] CONSULTAR APENAS 1 ALUNO ");
				System.out.println(" [2] LISTA DE TODOS OS ALUNOS ");
				System.out.println(" [3] LISTA SOMENTE SEXO MASCULINO OU FEMININO ");
				System.out.println(" [0] SAIR");
				System.out.print("\nDigite a opcao desejada: ");
				opcao = leia.nextByte();
				if (opcao < 0 || opcao > 3) {
					System.out.println("opcao Invalida, digite novamente.\n");
				}
			}while (opcao < 0 || opcao > 3);

			switch (opcao) {
			case 0:
				System.out.println("\n ************  PROGRAMA ENCERRADO  ************** \n");
				break;

			case 1:  // consulta de uma unica matricula
				leia.nextLine();  // limpa buffer de memoria
				System.out.print("Digite a Matricula do Aluno: ");
				matriculaChave = leia.nextLine();
    			try	{ 
	    		    arqAluno = new RandomAccessFile("ALUNOS.DAT", "rw");
	    		    while (true)  {
	    		    	aluno.ativo		  = arqAluno.readChar();
	    		    	aluno.matricula   = arqAluno.readUTF();
	    		    	aluno.nomeAluno   = arqAluno.readUTF();
	    		    	aluno.dtNasc      = arqAluno.readUTF();
	    		    	aluno.mensalidade = arqAluno.readFloat();
	    		    	aluno.sexo        = arqAluno.readChar();
	    		    	if ( matriculaChave.equals(aluno.matricula) && aluno.ativo == 'S') {
	    		    		imprimirCabecalho();
	    					imprimirAluno(aluno);
	    					System.out.println("\n FIM DE RELATORIO - ENTER para continuar...\n");
	    					leia.nextLine();
	    		    		break;
	    		    	}
    			    }
    		    	arqAluno.close();
    			}catch (EOFException e) {
    				System.out.println("Esta matricula nao foi encontrada no arquivo !\n");
    			}
    			catch (IOException e) { 
    				System.out.println("Erro na abertura do arquivo - programa sera finalizado");
    				System.exit(0);
    			}
				break;

			case 2:  // imprime todos os alunos
				try { 
					arqAluno = new RandomAccessFile("ALUNOS.DAT" , "rw");
					imprimirCabecalho();
					while (true) {
						aluno.ativo		  = arqAluno.readChar();
						aluno.matricula   = arqAluno.readUTF();
						aluno.nomeAluno   = arqAluno.readUTF();
						aluno.dtNasc      = arqAluno.readUTF();
						aluno.mensalidade = arqAluno.readFloat();
						aluno.sexo        = arqAluno.readChar();
						if ( aluno.ativo == 'S') {
							imprimirAluno(aluno);
						}
					}
					//    arqAluno.close();
				} catch (EOFException e) {
					System.out.println("\n FIM DE RELATORIO - ENTER para continuar...\n");
					leia.nextLine();
					matriculaChave = leia.nextLine();
				} catch (IOException e) { 
					System.out.println("Erro na abertura do arquivo - programa sera finalizado");
					System.exit(0);
				}
				break;

			case 3:  // imprime alunos do sexo desejado
				do {
					System.out.print("Digite o Sexo desejado (M/F): ");
					sexoAux = leia.next().charAt(0);
					if (sexoAux != 'F' && sexoAux != 'M') {
						System.out.println("Sexo Invalido, digite M ou F");
					}
				}while (sexoAux != 'F' && sexoAux != 'M');

				try { 
					arqAluno = new RandomAccessFile("ALUNOS.DAT", "rw");
					imprimirCabecalho();
					while (true) {
						aluno.ativo		  = arqAluno.readChar();
						aluno.matricula   = arqAluno.readUTF();
						aluno.nomeAluno   = arqAluno.readUTF();
						aluno.dtNasc      = arqAluno.readUTF();
						aluno.mensalidade = arqAluno.readFloat();
						aluno.sexo        = arqAluno.readChar();

						if ( sexoAux == aluno.sexo && aluno.ativo == 'S') {
							imprimirAluno(aluno);
						}
					}
				} catch (EOFException e) {
					System.out.println("\n FIM DE RELATORIO - ENTER para continuar...\n");
					leia.nextLine();
					matriculaChave = leia.nextLine();
				} catch (IOException e) { 
					System.out.println("Erro na abertura do arquivo - programa sera finalizado");
					System.exit(0);
				}

			}

		} while ( opcao != 0 );
	}

	public static void imprimirCabecalho () {
		System.out.println("-MATRICULA-  -------- NOME ALUNO ----------  --DATA NASC--  -MENSALIDADE-  -SEXO- ");
	}

	public static void imprimirAluno (Aluno aluno) {
		System.out.println(	formatarString(aluno.matricula, 11 ) + "  " +
				formatarString(aluno.nomeAluno , 30) + "  " + 
				formatarString(aluno.dtNasc , 13) + "  " + 
				formatarString( String.valueOf(aluno.mensalidade) , 13 ) + "  " +
				formatarString( Character.toString(aluno.sexo) , 6 )   ); 
	}

	public static String formatarString (String texto, int tamanho) {	
		// retorna uma string com o n�mero de caracteres passado como par�metro em TAMANHO
		if (texto.length() > tamanho) {
			texto = texto.substring(0,tamanho);
		}else{
			while (texto.length() < tamanho) {
				texto = texto + " ";
			}
		}
		return texto;
	}
}
