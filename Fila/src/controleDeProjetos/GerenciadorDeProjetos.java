package controleDeProjetos;

import java.util.Scanner;

public class GerenciadorDeProjetos {

	public static void main(String[] args) {
		int action;
		Project project;
		String descricao;
		MyQueue projectQueue = new MyQueue();
		Scanner in = new Scanner (System.in);
	
		System.out.println("*BEM-VINDO AO GERENCIADOR DE PROJETOS*");
		do{
			exibirMenu();
			action = in.nextInt();
		
			switch(action) {
				case 1:
					System.out.print("Nome do projeto: ");
					descricao = in.nextLine();
					descricao = in.nextLine();
					projectQueue.enqueue(new Project (descricao));
					break;
				case 2:
					project = projectQueue.deenqueue();
					if (project != null) {
						System.out.println(project);
					} else {
						System.out.println("TODOS OS PROJETOS JÁ FORAM VALIDADOS!");
					}
					break;
				case 0:
					break;
			}
		} while (action != 0);	
	}
	
	private static void exibirMenu() {
		System.out.println("1 - Adicionar projeto");
		System.out.println("2 - Validar projeto");
		System.out.println("0 - Sair");
		System.out.print("Informe o número da ação que deseja realizar: ");
	}

}


