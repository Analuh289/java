import java.io.*;
import java.util.*;
public class Alteracao {
	public static class Aluno    {
		public char ativo;
		public String matricula;
		public String nomeAluno;
		public String dtNasc;
		public float mensalidade;
		public char sexo;
	}
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		RandomAccessFile arquivo;
		Scanner leia = new Scanner(System.in);
		boolean encontrou;
		String matriculaChave;
		char confirmacao;
		long posicaoRegistro = 0;
		byte opcao;

		do{
			do{
				System.out.println(" ***************  ALTERACAO DE ALUNOS  ***************** ");
				System.out.print("Digite a Matricula do Aluno ( FIM para encerrar ): ");
				matriculaChave = leia.nextLine();
				if (matriculaChave.equals("FIM")) {
					break;
				}
				encontrou = false;
				try { 
					arquivo = new RandomAccessFile("ALUNOS.DAT", "rw");
					while (true) {
						posicaoRegistro 	= arquivo.getFilePointer(); // guarda a posicao inicial do registro a ser alterado
						aluno.ativo			= arquivo.readChar();
						aluno.matricula   	= arquivo.readUTF();
						aluno.nomeAluno 	= arquivo.readUTF();	    		    	
						aluno.dtNasc     	= arquivo.readUTF();
						aluno.mensalidade 	= arquivo.readFloat();
						aluno.sexo        	= arquivo.readChar();
						if ( matriculaChave.equals(aluno.matricula) && aluno.ativo == 'S') {
							encontrou = true;
							break;
						}
					}
					arquivo.close();
				} catch (EOFException e) {
					encontrou = false;
					System.out.println("Esta matricula nao foi encontrada no arquivo !\n");
				} catch (IOException e) { 
					System.out.println("Erro na abertura do arquivo - programa sera finalizado");
					System.exit(0);
				}
			}while ( ! encontrou);

			if (matriculaChave.equals("FIM")) {
				System.out.println("\n ************  PROGRAMA ENCERRADO  ************** \n");
				break;
			}

			//aluno.ativo = 'S';
			//aluno.matricula = matriculaChave;

			do{
				System.out.println("[ 1 ] Nome do Aluno............: " + aluno.nomeAluno);
				System.out.println("[ 2 ] Data de nascimento ......: " + aluno.dtNasc);
				System.out.println("[ 3 ] Valor da mensalidade.....: " + aluno.mensalidade);
				System.out.println("[ 4 ] sexo do Aluno............: " + aluno.sexo);

				do{
					System.out.println("Digite o numero do campo que deseja alterar (0 para finalizar as alteracoes): ");
					opcao = leia.nextByte();
				}while (opcao < 0 || opcao > 4);

				switch (opcao) {
				case 1:
					leia.nextLine();
					System.out.print  ("Digite o NOVO NOME do Aluno..................: ");
					aluno.nomeAluno = leia.nextLine();
					break;
				case 2: 
					leia.nextLine();
					System.out.print  ("Digite a NOVA DATA de Nascimento (DD/MM/AAAA): ");
					aluno.dtNasc = leia.nextLine();
					break;
				case 3:
					System.out.print  ("Digite o NOVO VALOR da mensalidade...........: ");
					aluno.mensalidade = leia.nextFloat();
					break;
				case 4: 
					System.out.print  ("Digite o NOVO sexo do Aluno (M/F)............: ");
					aluno.sexo = leia.next().charAt(0);
					break;
				}
				System.out.println();
			}while (opcao != 0);

			do{
				System.out.print("Confirma as Alteracoes (S/N) ? ");
				confirmacao = leia.next().charAt(0);
				if (confirmacao == 'S') {
					try {
						arquivo = new RandomAccessFile("ALUNOS.DAT", "rw");
						// desativar o registro atual
						arquivo.seek(posicaoRegistro);  // posicionar o ponteiro no inicio do registro atual
						arquivo.writeChar('N');  // gravar N por cima do atual valor S contido no campo ATIVO

						// gravar um novo registro contendo os novos dados alterados
						arquivo.seek(arquivo.length());  // posicionar ponteiro no final do arquivo (EOF)
						arquivo.writeChar(aluno.ativo);
						arquivo.writeUTF(aluno.matricula);
						arquivo.writeUTF(aluno.nomeAluno);
						arquivo.writeUTF(aluno.dtNasc);
						arquivo.writeFloat(aluno.mensalidade);
						arquivo.writeChar(aluno.sexo);
						arquivo.close();
						System.out.println("Dados alterados com sucesso !\n");
					} catch (IOException e) { 
						System.out.println("Erro na gravacao do registro - programa sera finalizado");
						System.exit(0);
					}
				}
				System.out.println();
			}while (confirmacao != 'S' && confirmacao != 'N');

			leia.nextLine();
		}while ( ! aluno.matricula.equals("FIM"));

		leia.close();
	}
}
