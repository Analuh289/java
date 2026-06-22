import java.io.*;
import java.util.*;

public class Exclusao {
   public static class Aluno  {
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
    	boolean encontrou;
    	String matriculaChave;
    	char confirmacao;
    	long posicaoRegistro = 0;
    	do {
    		do {
    			System.out.println(" ***************  EXCLUSAO DE ALUNOS  ***************** ");
    			System.out.print("Digite a Matricula do Aluno que deseja excluir ( FIM para encerrar ): ");
    			matriculaChave = leia.nextLine();
    			
    			if (matriculaChave.equals("FIM")) {
    			   break;
    			}
    			
    			encontrou = false;
    			try { 
	    		   arqAluno = new RandomAccessFile("ALUNOS.DAT", "rw");
	    		   while (true) {
	    		    	posicaoRegistro = arqAluno.getFilePointer();  // guarda a posicao inicial do 												registro a ser exclu�do
	    		    	aluno.ativo		 = arqAluno.readChar();
	    		    	aluno.matricula   = arqAluno.readUTF();
	    		    	aluno.nomeAluno  = arqAluno.readUTF();
	    		    	aluno.dtNasc     = arqAluno.readUTF();
	    		    	aluno.mensalidade = arqAluno.readFloat();
	    		    	aluno.sexo        = arqAluno.readChar();
	    		    	if ( matriculaChave.equals(aluno.matricula) && aluno.ativo == 'S') {
	    		    		encontrou = true;
	    		    		break;
	    		    	}
	    		   }
	    		   arqAluno.close();
	    		} catch (EOFException e) {
	    			encontrou = false;
	    			System.out.println("Esta matricula nao foi encontrada no arquivo !\n");
	    		} catch (IOException e) { 
	    			System.out.println("Erro na abertura do arquivo - programa sera finalizado");
	    			System.exit(0);
	    		}
    		} while ( ! encontrou);

    		if (matriculaChave.equals("FIM")) {
    			System.out.println("\n ************  PROGRAMA ENCERRADO  ************** \n");
    			break;
    		}
    		//aluno.ativo = 'N';  // desativar o registro => exclusao
    		System.out.println("Nome do aluno.......: " + aluno.nomeAluno);
    		System.out.println("Data de nascimento..: " + aluno.dtNasc);
    		System.out.println("Valor da mensalidade: " + aluno.mensalidade);
    		System.out.println("Sexo do aluno.......: " + aluno.sexo);
    		System.out.println();
	    	do {
	    		System.out.print("\nConfirma a exclusao deste aluno (S/N) ? ");
	    		confirmacao = leia.next().charAt(0);
	    		if (confirmacao == 'S') {
	    		   try {
	    			   arqAluno = new RandomAccessFile("ALUNOS.DAT", "rw");
	    			   // desativando o registro => exclusao
	    			   arqAluno.seek(posicaoRegistro);
	    			   arqAluno.writeChar('N');
			    	    
	    			   arqAluno.close();
	    			   System.out.println("Aluno excluido com sucesso !\n");
	    		    } catch (IOException e) { 
	    		    	System.out.println("Erro na gravacao do registro - programa sera finalizado");
	    		    	System.exit(0);
	    		    }
	    		 }
	    	} while (confirmacao != 'S' && confirmacao != 'N');
	    	leia.nextLine();
    	} while ( ! aluno.matricula.equals("FIM"));
    	leia.close();
   }
}
