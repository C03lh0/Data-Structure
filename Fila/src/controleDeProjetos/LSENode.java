package controleDeProjetos;

public class LSENode {
	private Project project;
	private LSENode next;


	public LSENode(Project project) {
		this.project = project;
	}

	public LSENode getNext() {
		return next;
	}
	public void setNext(LSENode next) {
		this.next = next;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
}
