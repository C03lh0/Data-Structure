package controleDeAcesso;

public class LDENode {
	private People people;
	private LDENode next;
	private LDENode previous;
	
	public LDENode (People people) {
		this.people = people;
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

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}
}
