package repository;

import entities.Product;

public class Tree {
	public TreeNode source;

	public boolean isEmpty() {
		return this.source == null ? true : false;
	}
	
	public void insert (Product product) {
		if(this.isEmpty()) {
			this.source = new TreeNode (product);
		} else {
			this.source.insertNode(product);
		}
	}
	
	public void remove(String code) {
		if (this.isEmpty()) {
			System.out.println ("Árvore vazia!");
		} else {
			this.source = this.removeNode (this.source, code);
		}
	}
	
	private TreeNode removeNode(TreeNode s, String code) {
		if (s != null) {
			if (s.getProduct().compareTo(code) == 0){
				TreeNode dad, son;
				
				if (s.getLeft() == null && s.getRight() == null) { 
					s = null;
				} else if (s.getLeft() == null) { 
					s = s.getRight();
				}
				else if (s.getRight() == null) { 
					s = s.getLeft();
				}
				else { 
					dad = s;
					son = dad.getLeft();
					while (son.getRight() != null){
						dad = son;
						son = son.getRight();
					}
					dad.setRight(son.getLeft());
					s.setProduct(son.getProduct());
				}
			} else if (s.getProduct().compareTo(code) > 0) {
				s.setLeft(removeNode (s.getLeft(), code));
			} else {
				s.setRight(removeNode (s.getRight(), code));
			}
		}
		return s;
	}

	public void inOrder() {
		if (this.isEmpty()) {
			System.out.println("Ávore vazia!");
		}else {
			runInOrder(this.source);
		}
	}

	private void runInOrder(TreeNode s) {
		if(s != null) {
			this.runInOrder(s.getLeft());
			System.out.print(s.getProduct().toString());
			this.runInOrder(s.getRight());
		}
	}
	
	ccc
}
