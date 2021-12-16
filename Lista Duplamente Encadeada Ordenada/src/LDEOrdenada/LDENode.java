package LDEOrdenada;

public class LDENode {
	private Integer value;
	private LDENode next;
	private LDENode previous;
	
	public LDENode (Integer value) {
		this.setValue(value);
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

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
