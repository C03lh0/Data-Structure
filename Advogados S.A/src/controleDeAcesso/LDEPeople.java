package controleDeAcesso;

public class LDEPeople {
	private LDENode first;
	private LDENode last;
	private int qtd = 0;
	
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
	
	public int getQtd() {
		return qtd;
	}
	
	public void insertEndList (People people) {
		LDENode presentPerson = new LDENode (people);
		boolean exist;
		
		if(isEmpty()) {
			this.first = this.last = presentPerson;
			qtd++;
			
		} else {
			exist = exist(people);
			if (!exist) {
				this.getLast().setNext(presentPerson);
				presentPerson.setPrevious(this.getLast());
				this.setLast(presentPerson);
				System.out.println("CADASTRADO");
				qtd++;
				
			} else {
				System.out.println("ERRO!!! "+people.getName()+ "JÁ ESTÁ CADASTRADO(A)");
			}
		}
	}
	
	public void removeEndList () {
		
		if(this.qtd == 1) {
			this.first = this.last = null;
			
		} else {
			this.getLast().getPrevious().setNext(null);
			this.setLast(this.getLast().getPrevious());
		}
	}
	
	public void remove (String RG) {
		LDENode peopleRemove = search (RG);
		
		if (isEmpty()) {
			System.out.println("LISTA VAZIA");
			
		} else if(peopleRemove == null) {
			System.out.println("NÃO ENCONTRADO");
			
		} else if(this.qtd == 1) {
			this.first = this.last = null;
			qtd--;
			System.out.println("SAIU DO PRÉDIO"); 
			
		} else if (peopleRemove == this.getFirst()){
			this.setFirst(this.getFirst().getNext());
			this.getFirst().setPrevious(null);
			qtd--;
			System.out.println("SAIU DO PRÉDIO");
			
		} else if (peopleRemove == this.getLast()){
			this.setLast(this.getLast().getPrevious());
			this.getLast().setNext(null);
			qtd--;
			System.out.println("SAIU DO PRÉDIO");
		} else {
			LDENode auxNext = peopleRemove.getNext();
			LDENode auxPrevious = peopleRemove.getPrevious();
			
			auxPrevious.setNext(auxNext);
			auxNext.setPrevious(auxPrevious);
			qtd--;
			System.out.println("SAIU DO PRÉDIO");
		}
	}
	
	private boolean exist(People pelople) {
		People people = pelople;
		LDENode aux = this.getFirst();
		
		while (aux != null) {
			if(people.compareTo(aux.getPeople()) == 0) {
				return true;
			}
			aux = aux.getNext();
		}
		return false;
	}
	
	public void showList () {
		
		if (isEmpty()) {
			System.out.println("LISTA VAZIA");
			
		} else {
			LDENode aux = this.getFirst();
			while(aux != null) {
				System.out.println(aux.getPeople());
				aux = aux.getNext();
			}
		}
	}
	
	public void inverseShowList () {
		
		if (isEmpty()) {
			System.out.println("LISTA VAZIA");
			
		} else {
			LDENode aux = this.getLast();
			
			while(aux != null) {
				System.out.println(aux.getPeople());
				aux = aux.getPrevious();
			}
		}
	}
	
	public LDENode search (String RG) {
		People people = new People (RG);
		LDENode aux;
		
		if (isEmpty()) {
			return aux = null;
			
		} else {
			aux = this.getFirst();
			
			while(aux != null) {
				if (people.compareTo(aux.getPeople()) == 0) {
					return aux;
				} 
				aux = aux.getNext();
			}
			return aux;
		}
	}

	private boolean isEmpty () {
		if (qtd == 0) {
			return true;
		} else {
			return false;
		}
	}
}
