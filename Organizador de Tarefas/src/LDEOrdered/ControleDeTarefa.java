package LDEOrdered;

import java.util.Scanner;

public class ControleDeTarefa {

	public static void main(String[] args) {
		Tarefa tarefa;
		String descricao;
		LDE listaDeTarefas = new LDE();
		int opcao, prioridade, qtdTarefa;
		Scanner in = new Scanner (System.in);
	
		
		
		System.out.println(" | BEM VINDO AO GERNCIADOR DE TAREFAS! | ");
		do {
			exibirMenu();
			opcao = in.nextInt();
			
			switch (opcao) {
			case 1 : 
				System.out.println("HORA DE INSERIR UMA NOVA TAREFA!");
				System.out.print("POR FAVOR DESCREVA A TAREFA: ");
				descricao = in.next();
				do {
					System.out.print("DIGITE A PRIORIDADE DESTA TAREFA (1 a 10): ");
					prioridade = in.nextInt();
					
				} while (prioridade < 1 || prioridade > 10);	
				tarefa = new Tarefa (prioridade, descricao);
				listaDeTarefas.inserirTarefaNaLista(tarefa);;
				break;
			
			case 2 :
				listaDeTarefas.executarTarefa();
				break;
				
			case 3 :
				System.out.println("CANCELAR TAREFA");
				System.out.print("POR FAVOR INFORME A DESCRIÇÃO DA TAREFA QUE DESEJA CANCELAR: ");
				descricao = in.next();
				listaDeTarefas.removerTarefa(descricao);
				break;
				
			case 4 :
				System.out.print("POR FAVOR INFORME A DESCRIÇÃO DA TAREFA QUE DESEJA SABER: ");
				descricao = in.next();
				qtdTarefa = listaDeTarefas.qtdTarefasASeremFeitas(descricao);
				
				if(qtdTarefa != -1){
					System.out.println("EXISTEM "+qtdTarefa+" TAREFAS A SEREM FEITAS ANTES DA TAREFA '"+descricao+"'.");
				} else {
					System.out.println("TAREFA NÃO ENCONTRADA!");
				}
				break;
			
			case 5 :
				listaDeTarefas.exibirListaDeTarefas();
				break;
			
			case 6 :
				do {
					System.out.print("POR FAVOR INFORME UMA DETERMINADA PRIORIDADE (1 a 10): ");
					prioridade = in.nextInt();
					
				} while (prioridade < 1 || prioridade > 10);
				listaDeTarefas.exibirListaDePrioridade(prioridade);
				break;
			
			case 7 :
				System.out.println("ALTERAR PRIORIDADE DA TAREFA");
				System.out.print("POR FAVOR INFORME A DESCRIÇÃO DA TAREFA QUE DESEJA ALTERAR: ");
				descricao = in.next();
				listaDeTarefas.alterarPrioridadeDaTarefa(descricao);
				break;
			
			case 0 :
				break; 
				
			default:
				break;
			}
			
		} while (opcao != 0);
		System.out.println("\nMUITO OBRIGADO POR USAR O GERNCIADOR DE TAREFAS!");
		System.out.println("\n*PROGRAMA ENCERRADO*");

	}

	private static void exibirMenu() {
		System.out.println(" \n*MENU DE OPÇÕES* ");
		System.out.println("1 - Inserir uma nova tarefa na lista");
		System.out.println("2 - Executar tarefa");
		System.out.println("3 - Cancelar tarefa");
		System.out.println("4 - Exibir quantidade de tarefas a serem cumpridas antes de uma determinada tarefa");
		System.out.println("5 - Exibir tarefas cadastradas");
		System.out.println("6 - Exibir tarefas com uma determinada prioridade");
		System.out.println("7 - Alterar prioridade de uma tarefa");
		System.out.println("0 - Sair do programa\n");
		System.out.print("Insira um número de acordo com a operação que deseja realizar: ");
	}

}
