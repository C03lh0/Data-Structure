package tdaDeque;

import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		int option, num;
		MyDeque listDeque = new MyDeque();
		Scanner in = new Scanner (System.in);
		
		System.out.println(" |BEM VINDO AO LIST-DEQUE| \n");
		do {
			exibirMenu();
			option = in.nextInt();
			
			switch(option) {
			case 1 : 
				System.out.println("HORA DE INSERIR UM NOVO NÚMERO!");
				System.out.print("Por favor digite um numero (inteiro): ");
				num = in.nextInt();
				if(!listDeque.isFull()) {
					listDeque.push(num);
					System.out.println("VALOR REGISTRADO COM SUCESSO!\n");
				} else {
					System.out.println("INFELIZMENTE A LISTA JÁ ESTÁ CHEIA!\n");
				}
				break;
			
			case 2 :
				System.out.println("HORA DE INSERIR UM NOVO NÚMERO!");
				System.out.print("Por favor digite um numero (inteiro): ");
				num = in.nextInt();
				if(!listDeque.isFull()) {
					listDeque.inject(num);
					System.out.println("VALOR REGISTRADO COM SUCESSO!\n");
				} else {
					System.out.println("INFELIZMENTE A LISTA JÁ ESTÁ CHEIA!\n");
				}
				break;
				
			case 3 :
				if(!listDeque.isEmpty()) {
					num = listDeque.pop();
					System.out.println("O número "+num+" foi removido da lista!\n");
				} else {
					System.out.println("A LISTA ESTÁ VAZIA!\\n");
				}
				break;
				
			case 4 :
				if(!listDeque.isEmpty()) {
					num = listDeque.eject();
					System.out.print("O número "+num+" foi removido da lista!\n");
				} else {
					System.out.print("A LISTA ESTÁ VAZIA!\n");
				}
				break;
				
			case 0 :
				break;
			
			default:
				break;
			}
			
		} while (option != 0);
		System.out.println("\n*PROGRAMA ENCERRADO*");
	}
	
	public static void exibirMenu() {
		
		System.out.println(" *MENU DE OPÇÕES* ");
		System.out.println(" 1 - Inserir numero no ínicio da lista");
		System.out.println(" 2 - Inserir numero no final da lista");
		System.out.println(" 3 - Remover numero no ínicio da lista");
		System.out.println(" 4 - Remover numero no final da lista");
		System.out.println(" 0 - Sair do programa");
		System.out.print("Por favor digite a opção que deseja realizar: ");
	}
}
