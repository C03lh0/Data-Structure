package controleDePedidos;

import java.util.Scanner;

public class GerenciadorDePedidos {
	
	
	public static void main (String[] args) {
		int action;
		Order order;
		String descricao;
		MyQueue orderQueue = new MyQueue();
		Scanner in = new Scanner (System.in);
	
		System.out.println("*BEM-VINDO AO GERENCIADOR DE PEDIDOS*");
		do{
			exibirMenu();
			action = in.nextInt();
		
			switch(action) {
				case 1:
					System.out.print("Anote o pedido aqui: ");
					descricao = in.nextLine();
					descricao = in.nextLine();
					orderQueue.enqueue(new Order (descricao));
					break;
				case 2:
					order = orderQueue.deenqueue();
					if (order != null) {
						System.out.println(order);
					} else {
						System.out.println("TODOS OS PEDIDOS JÁ FORAM ENTREGUES!");
					}
					break;
				case 0:
					break;
			}
		} while (action != 0);	
	}
	
	private static void exibirMenu() {
		System.out.println("1 - Adicionar pedido");
		System.out.println("2 - Entregar pedido");
		System.out.println("0 - Sair");
		System.out.print("Informe o número da ação que deseja realizar: ");
	}
}
