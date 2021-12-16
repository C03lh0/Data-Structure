package LDEOrdenadaNaoAceitaRepetidos;


public class LDEOrderedInUnrepeated {
	private LDENode first;
	private LDENode last;
	private int qtd = 0;
	
	private LDENode getFirst() {
		return first;
	}
	private void setFirst(LDENode first) {
		this.first = first;
	}
	private LDENode getLast() {
		return last;
	}
	private void setLast(LDENode last) {
		this.last = last;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	private boolean isEmpty () {
		if (qtd == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//Não insere valores repetidos
	public void insertOdered (Integer num) {
		LDENode newValue = new LDENode (num);
		
		if(isEmpty()) {
			this.first = this.last = newValue;
			qtd++;
			System.out.println("VALOR INSERIDO!");
			
		} else if (newValue.getValue() == this.getFirst().getValue()) {
			System.out.println("VALOR NÃO INSERIDO!");
			
		} else if (newValue.getValue() < this.getFirst().getValue()) {
			newValue.setNext(this.getFirst());
			this.getFirst().setPrevious(newValue);
			this.setFirst(newValue);
			qtd++;
			System.out.println("VALOR INSERIDO!");
			
		} else if (newValue.getValue() == this.getLast().getValue()) {
			System.out.println("VALOR NÃO INSERIDO!");
			
		}else if (newValue.getValue() > this.getLast().getValue()) {
			newValue.setPrevious(this.getLast());
			this.getLast().setNext(newValue);
			this.setLast(newValue);
			qtd++;
			System.out.println("VALOR INSERIDO!");
			
		} else {
			LDENode aux = this.getFirst();
			while (aux != null) {
				if (newValue.getValue() == aux.getValue()) {
					System.out.println("VALOR NÃO INSERIDO!");
					break;
				} else if (newValue.getValue() < aux.getValue()) {
					LDENode auxPrevious = aux.getPrevious();
					
					newValue.setNext(aux);
					newValue.setPrevious(auxPrevious);
					aux.setPrevious(newValue);
					auxPrevious.setNext(newValue);
					System.out.println("VALOR INSERIDO!");
					break;
				} else {
					aux = aux.getNext();
				}
				
			}
		}
	}
}
