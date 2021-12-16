package entities;

public class Product {
	private int qtd;
	private String code;
	private double price;
	private String provider;
	private String descrition;

	public Product (String code, String descrition, String provider, double price, int qtd) {
		this.qtd = qtd;
		this.code = code;
		this.price = price;
		this.provider = provider;
		this.descrition = descrition;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	@Override
	public String toString() {
		return "Código: "+this.getCode()
		+"\nDestrição: "+this.getDescrition()
		+"\nFornecedor: "+this.getProvider()
		+"\nPreço: R$"+this.getPrice()
		+"\nQuantidade em estoque: "+this.getQtd()+"\n";
	}
	
	public int compareTo (String code) {
		return this.getCode().compareTo(code);
	}
}
