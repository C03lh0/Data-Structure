package LDEOrdered;

public class Tarefa {
	private int prioridade;
	private String descricao;
	
	public Tarefa (int prioridade, String descricao) {
		this.prioridade = prioridade;
		this.descricao = descricao;
	}
	
	public Tarefa (String descricao) {
		this.descricao = descricao;
	}
	
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descri��o) {
		this.descricao = descri��o;
	}
	
	public int compareTo (Tarefa tarefa) {
		return this.descricao.compareTo(tarefa.getDescricao());
	}
	
	@Override
	public String toString () {
		return "\nDescri��o da tarefa: "+this.getDescricao()+"\n"+"Prioridade da tarefa: "+this.getPrioridade();
	}
}
