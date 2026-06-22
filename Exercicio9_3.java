import java.util.*;
public class Exercicio9_3 {

	public static void main(String[] args) {
		// 1 - variáveis
		String horarioInicio;
		String HorarioFim;
		float custoChamada;
		float somaCustoChamada = 0;
		boolean valido;
		byte horaInicio = 0;
		byte minutoInicio = 0;
		byte horaFim = 0;
		byte minutoFim = 0;
		int minutoDuracao;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			do {
				do {
					System.out.print("Digite o horário inicial da chamada (FIM para encerrar: ");
					horarioInicio = leia.next();
					if (horarioInicio.equalsIgnoreCase("fim")) {
						break;
					}
					valido = horaEhValida(horarioInicio);
					if ( ! valido ) {
						System.out.println("Horário Invalido, digite formato HH:MM");
					}
				}while( ! valido );
				
				if (horarioInicio.equalsIgnoreCase("fim")) {
					break;
				}
				
				do {
					System.out.print("Digite o horário final da chamada: ");
					HorarioFim = leia.next();
					valido = horaEhValida(HorarioFim);
					if ( ! valido ) {
						System.out.println("Horário Invalido, digite formato HH:MM");
					}
				}while( ! valido );
				
				horaInicio = Byte.parseByte( horarioInicio.substring(0,2) );
				minutoInicio = Byte.parseByte( horarioInicio.substring(3) );
				horaFim = Byte.parseByte( HorarioFim.substring(0,2) );
				minutoFim = Byte.parseByte( HorarioFim.substring(3) );
				if (horaInicio > horaFim || horaInicio == horaFim && 
						minutoInicio > minutoFim) {
					System.out.println("Horário inválido, "
							+ "Horario final deve ser maior que Inicial");
				}
			}while( horaInicio > horaFim || horaInicio == horaFim && 
					minutoInicio > minutoFim );
			
			if (horarioInicio.equalsIgnoreCase("fim")) {
				break;
			}
			
			// 3 - cálculos
			minutoDuracao = (horaFim - horaInicio) * 60 + minutoFim - minutoInicio;
			if (horaInicio < 6) {
				custoChamada = minutoDuracao * 0.10f;
			} else if (horaInicio < 8) {
				custoChamada = minutoDuracao * 0.15f;
			} else if (horaInicio < 18) {
				custoChamada = minutoDuracao * 0.20f;
			} else {
				custoChamada = minutoDuracao * 0.15f;
			}
			System.out.println("O custo desta chamada é: " + custoChamada);
			somaCustoChamada = somaCustoChamada + custoChamada;
			
		}while( ! horarioInicio.equalsIgnoreCase("fim") );

		System.out.println("Preço total da conta: " + somaCustoChamada);
	}

	public static boolean horaEhValida (String horario) {
		
		if (horario.length() != 5) {
			return false;
		}
		
		int hora;
		int minuto;
		try {
			hora = Integer.parseInt( horario.substring(0,2) );
			minuto = Integer.parseInt( horario.substring(3) );
		} catch (NumberFormatException erro) {
			return false;
		}
		
		if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
			return false;
		}
		
		return true;
	}
}
