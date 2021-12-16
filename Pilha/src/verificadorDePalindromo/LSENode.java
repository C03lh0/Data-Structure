package verificadorDePalindromo;

public class LSENode {
	private char value;
	private LSENode next;
	
	public LSENode (char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public LSENode getNext() {
		return next;
	}

	public void setNext(LSENode next) {
		this.next = next;
	}
}
