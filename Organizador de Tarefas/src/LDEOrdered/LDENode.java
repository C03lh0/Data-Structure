package LDEOrdered;

public class LDENode {
	private Tarefa tarefa;
	private LDENode prox;
	private LDENode ant;
	
	public LDENode (Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public LDENode getProx() {
		return prox;
	}

	public void setProx(LDENode prox) {
		this.prox = prox;
	}

	public LDENode getAnt() {
		return ant;
	}

	public void setAnt(LDENode ant) {
		this.ant = ant;
	}
}
