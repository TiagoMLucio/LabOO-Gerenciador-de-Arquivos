
public class Venda {

	private String códigoDoItem;
	private String nomeDoItem;
	private int valorDaVenda;
	private int local;

	public Venda(String códigoDoItem, String nomeDoItem, int valorDaVenda, int local) {
		this.códigoDoItem = códigoDoItem;
		this.nomeDoItem = nomeDoItem;
		this.valorDaVenda = valorDaVenda;
		this.local = local;
	}
	
	public String toString() {
		return String.format("%" + 40 + "s", "#" + this.códigoDoItem + " (" + this.nomeDoItem + ") : R$ " + this.valorDaVenda);
	}

}
