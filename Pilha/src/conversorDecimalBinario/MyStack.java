package conversorDecimalBinario;

public class MyStack {
	private LSENode top;

	public LSENode getTop() {
		return top;
	}

	public void setTop(LSENode top) {
		this.top = top;
	}
	
	public void push(Integer num) {
		LSENode newValue = new LSENode(num);
		
		if(isEmpty()) {
			this.setTop(newValue);
		} else {
			newValue.setNext(this.getTop());
			this.setTop(newValue);
		}
	}
	
	public int pop() {
		int value = this.getTop().getValue();
		this.setTop(this.getTop().getNext());
		return value;
	}
	
	public int top() {
		return this.getTop().getValue();
	}
	
	public boolean isEmpty() {
		
		if(this.getTop() == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		return false;
	}
}
