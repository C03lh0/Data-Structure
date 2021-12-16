package tdaDeque;

public class LDENode {
	private Integer num;
	private LDENode next;
	private LDENode previous;
	
	public LDENode(Integer inteiro) {
		this.setNum(inteiro);
	}
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public LDENode getNext() {
		return next;
	}

	public void setNext(LDENode next) {
		this.next = next;
	}

	public LDENode getPrevious() {
		return previous;
	}

	public void setPrevious(LDENode previous) {
		this.previous = previous;
	}
	
}
