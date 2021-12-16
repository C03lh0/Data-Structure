package controleDePedidos;

public class LSENode {
	private Order order;
	private LSENode next;


	public LSENode(Order order) {
		this.order = order;
	}

	public LSENode getNext() {
		return next;
	}

	public void setNext(LSENode next) {
		this.next = next;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
