
public class TreeNode {
	private Integer info;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(Integer info) {
		this.info = info;
	}
	
	public Integer getInfo() {
		return info;
	}
	public void setInfo(Integer info) {
		this.info = info;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}

	public void insertNode(Integer value) {
		if(this.getInfo() == value) {
			System.out.println("Valor Repetido");
		} else if (value < this.getInfo()) {
			if (this.getLeft() == null) {
				this.setLeft(new TreeNode(value));
			} else {
				this.getLeft().insertNode(value);
			}
		} else {
			if(this.getRight() == null) {
				this.setRight(new TreeNode(value));
			} else {
				this.getRight().insertNode(value);
			}
		}
		
	}
	
}
