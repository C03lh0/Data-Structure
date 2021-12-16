package tdaDeque;

public class MyDeque {
	private LDENode first;
	private LDENode last;
	private int qtd;
	
	public MyDeque () {
		this.qtd = 0;
	}
	
	public LDENode getFirst() {
		return first;
	}

	public void setFirst(LDENode first) {
		this.first = first;
	}

	public LDENode getLast() {
		return last;
	}

	public void setLast(LDENode last) {
		this.last = last;
	}
	
	public void push(Integer num) {
		LDENode newNum = new LDENode (num);
		
		if(isEmpty()) {
			this.first = this.last = newNum;
			this.qtd++;
		} else {
			newNum.setNext(this.getFirst());
			this.getFirst().setPrevious(newNum);
			this.setFirst(newNum);
			this.qtd++;
		}
	}
	
	public void inject(Integer num) {
		LDENode newNum = new LDENode (num);
		
		if(isEmpty()) {
			this.first = this.last = newNum;
			this.qtd++;
		} else {
			this.getLast().setNext(newNum);
			newNum.setPrevious(this.getLast());
			this.setLast(newNum);
			qtd++;
		}
	}
	
	public Integer pop() {
		Integer num;
		
		if (qtd == 1) {
			num = this.getFirst().getNum();
			this.first = this.last = null;
			qtd--;
			return num;
		} else {
			num = this.getFirst().getNum();
			this.setFirst(this.getFirst().getNext());
			this.getFirst().setPrevious(null);
			qtd--;
			return num;
		}
	}
	
	public Integer eject () {
		Integer num;
		
		if (qtd == 1) {
			num = this.getLast().getNum();
			this.first = this.last = null;
			qtd--;
			return num;
		} else {
			num = this.getLast().getNum();
			this.setLast(this.getLast().getPrevious());
			this.getLast().setNext(null);
			qtd--;
			return num;
		}
	}
	
	public boolean isEmpty () {
		if(this.qtd == 0) {
			return true;
		} else {
			return false;
		}
	}
	

	public boolean isFull() {
		return false;
	}
} 
