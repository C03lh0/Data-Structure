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
				System.out.println("HORA DE INSERIR UM NOVO N�MERO!");
				System.out.print("Por favor digite um numero (inteiro): ");
				num = in.nextInt();
				if(!listDeque.isFull()) {
					listDeque.push(num);
					System.out.println("VALOR REGISTRADO COM SUCESSO!\n");
				} else {
					System.out.println("INFELIZMENTE A LISTA J� EST� CHEIA!\n");
				}
				break;
			
			case 2 :
				System.out.println("HORA DE INSERIR UM NOVO N�MERO!");
				System.out.print("Por favor digite um numero (inteiro): ");
				num = in.nextInt();
				if(!listDeque.isFull()) {
					listDeque.inject(num);
					System.out.println("VALOR REGISTRADO COM SUCESSO!\n");
				} else {
					System.out.println("INFELIZMENTE A LISTA J� EST� CHEIA!\n");
				}
				break;
				
			case 3 :
				if(!listDeque.isEmpty()) {
					num = listDeque.pop();
					System.out.println("O n�mero "+num+" foi removido da lista!\n");
				} else {
					System.out.println("A LISTA EST� VAZIA!\\n");
				}
				break;
				
			case 4 :
				if(!listDeque.isEmpty()) {
					num = listDeque.eject();
					System.out.print("O n�mero "+num+" foi removido da lista!\n");
				} else {
					System.out.print("A LISTA EST� VAZIA!\n");
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
		
		System.out.println(" *MENU DE OP��ES* ");
		System.out.println(" 1 - Inserir numero no �nicio da lista");
		System.out.println(" 2 - Inserir numero no final da lista");
		System.out.println(" 3 - Remover numero no �nicio da lista");
		System.out.println(" 4 - Remover numero no final da lista");
		System.out.println(" 0 - Sair do programa");
		System.out.print("Por favor digite a op��o que deseja realizar: ");
	}
}
