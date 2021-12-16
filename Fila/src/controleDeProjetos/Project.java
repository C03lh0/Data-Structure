package controleDeProjetos;

public class Project {
	private String projetcDescrition;
	private int projectNum;
	
	public Project (String string) {
		this.projetcDescrition = string;
	}
	
	public String getProjetcDescrition() {
		return projetcDescrition;
	}
	public void setProjetcDescrition(String projetcDescrition) {
		this.projetcDescrition = projetcDescrition;
	}	
	public int getProjectNum() {
		return projectNum;
	}
	public void setProjectNum(int projectNum) {
		this.projectNum = projectNum;
	}
}
