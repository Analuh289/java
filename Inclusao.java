import java.io.*;
import java.util.*; 
public class Inclusao {
   public static class Aluno {
	   public char 		ativo;
	   public String 	matricula;
	   public String 	nomeAluno;
	   public String 	dtNasc;
	   public float 	mensalidade;
	   public char 		sexo;
   }
   public static void main(String[] args) {
    	Aluno aluno = new Aluno();
    	RandomAccessFile arquivo;
    	Scanner leia = new Scanner(System.in);
    	boolean encontrou;
    	String matriculaChave;
    	char confirmacao;
    	do {
    		do {
    			System.out.println(" ***************  INCLUSAO DE ALUNOS  ***************** ");
    			System.out.print("Digite a Matricula do Aluno( FIM para encerrar): ");
    			matriculaChave = leia.nextLine();
    			if (matriculaChave.equals("FIM")) {
    			   break;
    			}
    			encontrou = false;
    			try { 
	    		    arquivo = new RandomAccessFile("ALUNOS.DAT", "rw");
	    		    while (true) {
		    		    	aluno.ativo		  = arquivo.readChar();
		    		    	aluno.matricula   = arquivo.readUTF();
		    		    	aluno.nomeAluno   = arquivo.readUTF();
		    		    	aluno.dtNasc      = arquivo.readUTF();
		    		    	aluno.mensalidade = arquivo.readFloat();
		    		    	aluno.sexo        = arquivo.readChar();
		    		    	if ( matriculaChave.equals(aluno.matricula) && aluno.ativo == 'S') {
		    		    		System.out.println("Matricula ja cadastrada, digite outro valor\n");
		    		    		encontrou = true;
		    		    		break;
		    		    	}
	    		    }
    		    	arquivo.close();
	    		}catch (EOFException e) {
	    			encontrou = false;
	    		}catch (IOException e) { 
	    			System.out.println("Erro na abertura do arquivo - programa sera' finalizado");
	    			System.exit(0);
	    		}
    		}while (encontrou);

    		if (matriculaChave.equals("FIM")) {
    			System.out.println("\n ************  PROGRAMA ENCERRADO  ************** \n");
    			break;
    		}
    		aluno.ativo = 'S';
    		aluno.matricula = matriculaChave;
    		System.out.print("Digite o nome do aluno.........................: ");
    		aluno.nomeAluno = leia.nextLine();
    		System.out.print("Digite a data de nascimento (DD/MM/AAAA).......: ");
	    	aluno.dtNasc = leia.nextLine();	    	
    		System.out.print("Digite o valor da mensalidade..................: ");
	    	aluno.mensalidade = leia.nextFloat();
    		System.out.print("Digite o Sexo do aluno (M/F)...................: ");
	    	aluno.sexo = leia.next().charAt(0);
	    	do {
	    		System.out.print("\nConfirma a gravacao dos dados (S/N) ? ");
	    		confirmacao = leia.next().charAt(0);
	    		if (confirmacao == 'S') {
	    		   try {
	    			   arquivo = new RandomAccessFile("ALUNOS.DAT", "rw");
	    			   arquivo.seek(arquivo.length());  // posiciona o ponteiro no final do arquivo (EOF)
	    			   arquivo.writeChar(aluno.ativo);
	    			   arquivo.writeUTF(aluno.matricula);
	    			   arquivo.writeUTF(aluno.nomeAluno);
	    			   arquivo.writeUTF(aluno.dtNasc);
	    			   arquivo.writeFloat(aluno.mensalidade);
	    			   arquivo.writeChar(aluno.sexo);
	    			   arquivo.close();
	    			   System.out.println("Dados gravados com sucesso !\n");
	    		    }catch (IOException e) { 
	    		    	System.out.println("Erro na gravacao do registro - programa sera finalizado");
	    		    	System.exit(0);
	    		    }
	    		 }
	    	}while (confirmacao != 'S' && confirmacao != 'N');
	    	leia.nextLine();
    	}while ( ! aluno.matricula.equals("FIM"));	     
    	leia.close();
   }
}
