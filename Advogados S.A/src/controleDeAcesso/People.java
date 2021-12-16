package controleDeAcesso;

public class People {
	private String name;
	private String rg;
	
	
	public People (String name, String rg) {
		this.name = name;
		this.rg = rg;
	}
	
	public People (String rg) {
		this.rg = rg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public int compareTo (People people) {
		return this.getRg().compareTo(people.getRg());
	}
	
	@Override
	public String toString () {
		return "Nome: "+this.getName()+"\nRG: "+this.getRg();
	}
}
