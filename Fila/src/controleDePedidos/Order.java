package controleDePedidos;

public class Order {
	private String descricao;
	private int orderNum;
	
	public Order (String descricao) {
		this.descricao = descricao;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString () {
		return "O pedido de n�mero \""+this.getOrderNum()+"\" foi entregue! \n Descri��o: "+this.getDescricao();
	}
}
