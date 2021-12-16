
public class SearchBinaryTree {
	public TreeNode source;
	
	public boolean isEmpty() {
		return this.source == null ? true : false;
	}
	
	public void insert (Integer value) {
		if(this.isEmpty()) {
			this.source = new TreeNode (value);
		} else {
			this.source.insertNode(value);
		}
	}
	
	public void remove(int value) {
		if (this.isEmpty() == true) {
			System.out.println ("Árvore vazia!");
		} else {
			this.source = this.removeNode (this.source, value);
		}
	}
	
	private TreeNode removeNode(TreeNode s, int value) {
		if (s != null) {
			if (value == s.getInfo()){
				TreeNode dad, son;
				
				if (s.getLeft() == null && s.getRight() == null) { // Não tem filhos
					s = null;
				} else if (s.getLeft() == null) { // Não tem filho a esquerda
					s = s.getRight();
				}
				else if (s.getRight() == null) { // Não tem filho a direita
					s = s.getLeft();
				}
				else { // Tem ambos os filhos
					dad = s;
					son = dad.getLeft();
					while (son.getRight() != null){
						dad = son;
						son = son.getRight();
					}
					dad.setRight(son.getLeft());
					s.setInfo(son.getInfo());
				}
			} else if (value < s.getInfo()) {
				s.setLeft(removeNode (s.getLeft(), value));
			} else {
				s.setRight(removeNode (s.getRight(), value));
			}
		}
		return s;
	}

	public void inOrder() {
		if (this.isEmpty()) {
			System.out.println("Ávore vazia");
		}else {
			runInOrder(this.source);
		}
	}

	private void runInOrder(TreeNode s) {
		if(s != null) {
			this.runInOrder(s.getRight());
			System.out.print(s.getInfo()+" ");
			this.runInOrder(s.getLeft());
		}
	}
	
	public void preOrder() {
		if (this.isEmpty()) {
			System.out.println("Ávore vazia");
		}else {
			preRunOrder(this.source);
		}
	}
	
	private void preRunOrder(TreeNode s) {
		if(s != null) {
			System.out.print(s.getInfo()+" ");
			this.runInOrder(s.getRight());
			this.runInOrder(s.getLeft());
		}
	}
	
	public void postOrder() {
		if (this.isEmpty()) {
			System.out.println("Ávore vazia");
		}else {
			postRunOrder(this.source);
		}
	}
	
	private void postRunOrder(TreeNode s) {
		if(s != null) {
			this.runInOrder(s.getRight());
			this.runInOrder(s.getLeft());
			System.out.print(s.getInfo()+" ");
		}
	}
}
