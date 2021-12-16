package controller;

import java.util.Scanner;

import entities.Product;
import repository.Tree;
import repository.TreeNode;

public class ProductRegister {
	private Tree repositoryTree;
	Scanner in = new Scanner (System.in);
	
	public ProductRegister () {
		this.repositoryTree = new Tree();
	}
	
	public void registerNewProduct (String codeProduct, String descritionProduct, String providerProduct, double priceProduct, int qtdProduct) {
		
		Product prod = new Product(codeProduct, descritionProduct, providerProduct, priceProduct, qtdProduct);
		this.repositoryTree.insert(prod);
	}
	
	private TreeNode searchProduct (String code) {
		return this.repositoryTree.find(code);
	}
	
	public void alteredPrice (String code) {
		TreeNode aux = this.searchProduct(code);
		
		if(aux != null) {
			double newPrice;
			System.out.println("Digite o preço do produto: ");
			newPrice = in.nextDouble();
			aux.getProduct().setPrice(newPrice);
			System.out.println("Preço alterado com sucesso!");
		} else {
			System.out.println("Produto não encontrado!");
		}
	}
	
	public void alteredQtd (String code) {
		TreeNode aux = this.searchProduct(code);
		
		if(aux != null) {
			int newQtd;
			System.out.println("Digite a quantidade do produto: ");
			newQtd = in.nextInt();
			aux.getProduct().setQtd(newQtd);
			System.out.println("Quantidade alterada com sucesso!");
		} else {
			System.out.println("Produto não encontrado!");
		}
	}
	
	public void showProductInfo (String code) {
		TreeNode aux = this.searchProduct(code);
		
		if(aux != null) {
			System.out.println(aux.getProduct().toString());
		} else {
			System.out.println("O produto não se encontra no cadastro");
		}
	}
	
	public void removeProduct (String code) {
		TreeNode aux = this.searchProduct(code);
		
		if(aux != null) {
			this.repositoryTree.remove(code);
		} else {
			System.out.println("O produto não se encontra no cadastro");
		}
	}
	
	public void showProducts() {
		this.repositoryTree.inOrder();
	}
}
