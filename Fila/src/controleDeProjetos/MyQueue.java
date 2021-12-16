package controleDeProjetos;

public class MyQueue {
	private LSENode head;
	private LSENode tail;
	private int qtd;
	
	public MyQueue () {
		this.qtd = 0;
	}
	
	public LSENode getHead() {
		return head;
	}
	public void setHead(LSENode head) {
		this.head = head;
	}
	public LSENode getTail() {
		return tail;
	}
	public void setTail(LSENode tail) {
		this.tail = tail;
	}
	
	public void enqueue (Project project) {
		LSENode newProject = new LSENode (project);
		
		if(this.isFull()) {
			System.out.println("A LISTA ESTÁ CHEIA!");
		} else if(this.isEmpty()) {
			this.head = this.tail = newProject;
			this.qtd ++;
			newProject.getProject().setProjectNum(qtd);
		} else {
			this.getTail().setNext(newProject);
			this.setTail(newProject);
			this.qtd++;
			newProject.getProject().setProjectNum(qtd);
		}
	}
	
	public Project deenqueue () {
		
		if(this.isEmpty()) {
			return null;
		} else {
			Project project = this.getHead().getProject(); 
			this.setHead(this.getHead().getNext());
			this.qtd--;
			return project;
		}
	}
	
	public Project head () {
		return this.getHead().getProject();
	}
	
	public boolean isEmpty () {
		
		if(this.qtd == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull () {
		return false;
	}
}
