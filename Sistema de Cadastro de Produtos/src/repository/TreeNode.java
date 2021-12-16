package repository;

import entities.Product;

public class TreeNode {
	private TreeNode left;
	private TreeNode right;
	private Product product;
	
	public TreeNode (Product product) {
		this.setProduct(product);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	public void setRight(TreeNode rigth) {
		this.right = rigth;
	}
	
	public void insertNode(Product product) {
		if(this.getProduct().compareTo(product.getCode()) == 0) {
			System.out.println("Invalido ... Produto Repetido!");
			
		} else if (this.getProduct().compareTo(product.getCode()) > 0) {
			if (this.getLeft() == null) {
				this.setLeft(new TreeNode(product));
				System.out.println("Cadastrado com sucesso");
			} else {
				this.getLeft().insertNode(product);
			}
		} else {
			if(this.getRight() == null) {
				this.setRight(new TreeNode(product));
				System.out.println("Cadastrado com sucesso");
			} else {
				this.getRight().insertNode(product);
			}
		}	
	}

	public TreeNode findNode(String code) {
		if (this.getProduct().compareTo(code) == 0) {
			return this;
		} else if (this.getProduct().compareTo(code)>0) {
			if (this.getLeft() == null){
				return null;
			} else {
				return this.left.findNode (code);
			}
		} else {
			if (this.getRight() == null){
				return null;
			} else {
				return this.right.findNode (code);
			}
		}
	}
}
