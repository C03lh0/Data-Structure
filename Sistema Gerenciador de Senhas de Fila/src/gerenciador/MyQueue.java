package gerenciador;

public class MyQueue {
	private LSENode head;
	private LSENode tail;
	private int qtd, limit, senha;
	
	
	public MyQueue (int limit) {
		this.limit = limit;
		this.qtd = 0;
		this.senha = 0;
	}
	
	public LSENode getHead() {
		return head;
	}
	public void setHead(LSENode head) {
		this.head = head;
	}
	public LSENode getTail() {
		return this.tail;
	}
	public void setTail(LSENode tail) {
		this.tail = tail;
	}
	public int getLimit() {
		return this.limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public Integer enqueue () {
		this.senha++;
		LSENode newNumber = new LSENode (this.senha);
		
		if(this.isEmpty()) {
			this.head = this.tail = newNumber;
			this.qtd++;
			return newNumber.getNum();
		} else {
			this.getTail().setNext(newNumber);
			this.setTail(newNumber);
			this.qtd++;
			return newNumber.getNum();
		}
	}
	
	public Integer deenqueue () {
		Integer num = this.getHead().getNum();
		
		this.setHead(this.getHead().getNext());
		this.qtd--;
		return num;
	}
	
	
	public Integer head () {
		return this.getHead().getNum();
	}
	
	public boolean isEmpty () {
		if(this.qtd == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull () {
		if(this.qtd >= this.limit) {
			return true;
		} else {
			return false;
		}
	}
}

	
