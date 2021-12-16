package aplica��o;

import java.util.Random;
import java.util.Scanner;
import gerenciador.MyQueue;

public class SistemaDeGerenciamentoDeTicket {

	public static void main(String[] args) {
		Random randow = new Random();
		Integer action, ticket, atendente;
		Scanner in = new Scanner (System.in);
		MyQueue peopleQueue = new MyQueue(15);
		
		System.out.println("*BEM-VINDO A LOJA DE ELETR�NICOS Tudo Certo*");
		do{
			exibirMenu();
			action = in.nextInt();
		
			switch(action) {
				case 1:
					if(!peopleQueue.isFull()) {
						System.out.println("O n�mero do seu ticket �: "+peopleQueue.enqueue());
						System.out.println("� s� aguardar!");
					} else {
						System.out.println("LIMITE DE OCUPA��O EXCEDENTE...POR FAVOR VOLTE MAIS TARDE!");
					}
					break;
				case 2:
					if (!peopleQueue.isEmpty()) {
						ticket = peopleQueue.deenqueue();
						atendente = randow.nextInt(10);
						System.out.println("Ticket: "+ticket);
						System.out.println("Atendente: "+atendente);
					} else {
						System.out.println("N�O H� CLIENTES NA FILA DE ESPERA.");
					}
					break;
				case 0:
					break;
			}
		} while (action != 0);	
	}
	
	private static void exibirMenu() {
		System.out.println("-MENU-");
		System.out.println("1 - Cliente (Gerar ticket)");
		System.out.println("2 - Atendente (Chamar cliente para atendimento)");
		System.out.println("0 - Sair");
		System.out.print("Informe o n�mero da a��o que deseja realizar: ");
	}
}


