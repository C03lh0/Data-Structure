package system;

import java.util.Scanner;

import controller.ProductRegister;

public class Application {

	public static void main(String[] args) {
		double price;
		int choice =0, qtd;
		String code, descrition, provider;
		Scanner in = new Scanner(System.in);
		ProductRegister register = new ProductRegister ();
		
		do {
			Menu();
			choice = in.nextInt();
			switch(choice) {
				
				case 1:
					System.out.println("           CADASTRO DE PRODUTO");
					System.out.print("Informe o codigo: ");in.nextLine();
					code = in.nextLine();
					
					System.out.print("Informe a descrição:");
					descrition = in.nextLine();
					
					System.out.print("Informe o fornecedor:");
					provider = in.nextLine();
					
					System.out.print("Informe o preço:");
					price = in.nextDouble();
					System.out.print("Informe a quantidade de unidade no estoque:");
					qtd = in.nextInt();
					register.registerNewProduct(code, descrition, provider, price, qtd);
					break;
					
				case 2:
					register.showProducts();
					break;
					
				case 3:
					System.out.print("Informe o codigo do produto: ");in.nextLine();
					code = in.nextLine();
					register.alteredPrice(code);
					break;
					
				case 4:
					System.out.print("Informe o codigo do produto: ");in.nextLine();
					code = in.nextLine();
					register.alteredQtd(code);
					break;
					
				case 5:
					System.out.print("Informe o codigo do produto: ");in.nextLine();
					code = in.nextLine();
					register.showProductInfo(code);
					break;
				
				case 6:
					System.out.print("Informe o codigo do produto: ");in.nextLine();
					code = in.nextLine();
					register.removeProduct(code);
					break;
					
				case 0:
					break;
					
				default:
					break;
			}
			
		} while(choice != 0);
	}
	
	public static void Menu() {
		System.out.println("");
		System.out.println("MENU DE OPÇÕES: ");
		System.out.println("1- Cadastrar produto");
		System.out.println("2- Exibir produtos cadastrados");
		System.out.println("3- Alterar preço do produto");
		System.out.println("4- Alterar quantidade do produto");
		System.out.println("5- Exibir um produto");
		System.out.println("6- Remover um produto");
		System.out.println("0- Sair");
		System.out.println(" OPÇÃO:");
	}
}
