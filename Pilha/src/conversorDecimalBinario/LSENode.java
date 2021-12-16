package conversorDecimalBinario;

public class LSENode {
	private Integer value;
	private LSENode next;
	
	public LSENode (Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public LSENode getNext() {
		return next;
	}

	public void setNext(LSENode next) {
		this.next = next;
	}
}
