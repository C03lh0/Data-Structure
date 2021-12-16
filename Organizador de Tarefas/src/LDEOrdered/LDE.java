package LDEOrdered;
import java.util.Scanner;

public class LDE {
	private LDENode prim;
	private LDENode ult;
	private int qtd;
	
	public LDE () {
		this.setQtd(0);
	}
	
	private LDENode getPrim() {
		return prim;
	}
	private void setPrim(LDENode prim) {
		this.prim = prim;
	}
	private LDENode getUlt() {
		return ult;
	}
	private void setUlt(LDENode ult) {
		this.ult = ult;
	}
	private int getQtd() {
		return qtd;
	}
	private void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public boolean isEmpty () {
		if (this.getQtd() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void inserirTarefaNaLista (Tarefa tarefa) {
		LDENode novaTarefa = new LDENode (tarefa);
		int prioridade = tarefa.getPrioridade();
		String descricao = tarefa.getDescricao();
		
			if(isEmpty()) {
				this.prim = this.ult = novaTarefa;
				qtd++;
				System.out.println("TAREFA INSERIDA!");
					
			} else if (descricao.equals(getPrim().getTarefa().getDescricao())) {
				System.out.println("TAREFA JÁ CADASTRADA! TENTE NOVAMENTE...");
					
			} else if (prioridade > this.getPrim().getTarefa().getPrioridade()) {
				novaTarefa.setProx(this.getPrim());
				this.getPrim().setAnt(novaTarefa);
				this.setPrim(novaTarefa);
				qtd++;
				System.out.println("TAREFA INSERIDA!");
					
			} else if (descricao.equals(getUlt().getTarefa().getDescricao())) {
				System.out.println("TAREFA JÁ CADASTRADA! TENTE NOVAMENTE...");
					
			} else if (prioridade <= this.getUlt().getTarefa().getPrioridade()) {
				novaTarefa.setAnt(this.getUlt());
				this.getUlt().setProx(novaTarefa);
				this.setUlt(novaTarefa);
				qtd++;
				System.out.println("TAREFA INSERIDA!");
					
			} else {
				LDENode aux = this.getPrim();
				while (aux != null) {
					if (descricao.equals(getPrim().getTarefa().getDescricao())) {
						System.out.println("TAREFA JÁ CADASTRADA! TENTE NOVAMENTE...");
							
					} else if (prioridade > aux.getTarefa().getPrioridade()) {
						LDENode auxPrevious = aux.getAnt();
							
						novaTarefa.setProx(aux);
						novaTarefa.setAnt(auxPrevious);
						aux.setAnt(novaTarefa);
						auxPrevious.setProx(novaTarefa);
						this.qtd++;
						System.out.println("TAREFA INSERIDA!");
						break;
						
					} else {
						aux = aux.getProx();
					}
				}
			}
		}
	
	public void executarTarefa() {
		LDENode auxProx = this.getPrim().getProx();
		
		auxProx.setAnt(null);
		this.setPrim(auxProx);
		System.out.println("TAREFA EXECUTADA!");
	}
	
	public void removerTarefa (String descricao) {
		
		if (isEmpty()) {
			System.out.println("LISTA VAZIA!");
			
		} else  { 
			LDENode removerTarefa = buscarTarefa (descricao);
			
			if(removerTarefa == null) {
				System.out.println("A TAREFA '"+descricao+"' NÃO ESTÁ CONTIDA NA LISTA!");
				
			} else if(this.qtd == 1) {
				this.prim = this.ult = null;
				qtd--;
				System.out.println("TAREFA REMOVIDA!"); 
				
			} else if (removerTarefa.getTarefa().compareTo(this.getPrim().getTarefa()) == 0){
				this.setPrim(this.getPrim().getProx());
				this.getPrim().setAnt(null);
				qtd--;
				System.out.println("TAREFA REMOVIDA!");
				
			} else if (removerTarefa.getTarefa().compareTo(this.getUlt().getTarefa()) == 0){
				this.setUlt(this.getUlt().getAnt());
				this.getUlt().setProx(null);
				qtd--;
				System.out.println("TAREFA REMOVIDA!");
			} else {
				LDENode auxProx = removerTarefa.getProx();
				LDENode auxAnt = removerTarefa.getAnt();
				
				auxAnt.setProx(auxProx);
				auxProx.setAnt(auxAnt);
				qtd--;
				System.out.println("TAREFA REMOVIDA!");
			}
		}
	}
	
	private LDENode buscarTarefa (String descricao) {
		Tarefa tarefa = new Tarefa (descricao);
		LDENode aux = this.getPrim();
		
		while(aux != null) {
			if (aux.getTarefa().compareTo(tarefa) == 0) {
				return aux;
			} 
			aux = aux.getProx();
		}
		return aux;
	}

	public int qtdTarefasASeremFeitas (String descricao) {
		Tarefa tarefa = new Tarefa (descricao);
		LDENode aux = this.getPrim();
		int quantidadeDeTarefas = 0;
		
		while(aux != null) {
			if (aux.getTarefa().compareTo(tarefa) == 0) {
				return quantidadeDeTarefas;
			}
			quantidadeDeTarefas++;
			aux = aux.getProx();
		}
		return -1;
	}
	
	public void exibirListaDeTarefas () {
		
		if (isEmpty()) {
			System.out.println("LISTA VAZIA");
			
		} else {
			LDENode aux = this.getPrim();
			while(aux != null) {
				System.out.println(aux.getTarefa());
				aux = aux.getProx();
			}
		}
	}
	
	public void exibirListaDePrioridade (int prioridade) {
		int qtdDePrioridadeX = 0;
		
		if (isEmpty()) {
			System.out.println("LISTA VAZIA");
			
		} else {
			LDENode aux = this.getPrim();
			while(aux != null) {
				if(aux.getTarefa().getPrioridade() == prioridade) {
					System.out.println(aux.getTarefa());
					qtdDePrioridadeX++;
				}
				aux = aux.getProx();
			}
			if(qtdDePrioridadeX == 1) {
				System.out.println("\nEXISTE APENAS 1 TAREFA DE PRIORIDADE "+prioridade+".");
			} else {
				System.out.println("EXISTEM "+qtdDePrioridadeX+" TAREFAS DE PRIORIDADE "+prioridade+".");
			}
			
		}
	}
	
	public void alterarPrioridadeDaTarefa (String descricao) {
		LDENode tarefaAlterarPrioridae = buscarTarefa (descricao);
		Scanner in = new Scanner (System.in);
		int prioridade;
		
		if(tarefaAlterarPrioridae == null) {
			System.out.println("TAREFA NÃO ENCONTRADA!");
		} else {
			System.out.println(tarefaAlterarPrioridae.getTarefa());
			System.out.println("");
			do {
				System.out.println("DIGITE A NOVA PRIORIDADE DESTA TAREFA (1 a 10): ");
				prioridade = in.nextInt();
				
			} while (prioridade < 1 || prioridade > 10);
			
			tarefaAlterarPrioridae.getTarefa().setPrioridade(prioridade);
			System.out.println("ATUALIZANDO...");
			this.removerTarefa(descricao);
			this.inserirTarefaNaLista(tarefaAlterarPrioridae.getTarefa());
			System.out.println("ATUALIZADO!");
			
		}
	}
}
