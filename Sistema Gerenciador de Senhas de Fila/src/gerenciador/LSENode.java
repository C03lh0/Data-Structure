package gerenciador;

public class LSENode {
	private Integer num;
	private LSENode next;
	
	public LSENode (Integer value) {
		this.num = value;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer value) {
		this.num = value;
	}

	public LSENode getNext() {
		return next;
	}

	public void setNext(LSENode next) {
		this.next = next;
	}
}
