package controleDePedidos;

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
	
	public void enqueue (Order order) {
		LSENode newOrder = new LSENode (order);
		
		if(this.isFull()) {
			System.out.println("A LISTA ESTÁ CHEIA!");
		} else if(this.isEmpty()) {
			this.head = this.tail = newOrder;
			this.qtd ++;
			newOrder.getOrder().setOrderNum(qtd);
		} else {
			this.getTail().setNext(newOrder);
			this.setTail(newOrder);
			this.qtd++;
			newOrder.getOrder().setOrderNum(qtd);
		}
	}
	
	public Order deenqueue () {
		
		if(this.isEmpty()) {
			return null;
		} else {
			Order order = this.getHead().getOrder(); 
			this.setHead(this.getHead().getNext());
			this.qtd--;
			return order;
		}
	}
	
	public Order head () {
		return this.getHead().getOrder();
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
