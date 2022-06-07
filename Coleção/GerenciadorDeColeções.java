import java.util.ArrayList;

public class GerenciadorDeColeções {
	
	private ArrayList<ItemDeColeção> coleção;

	public void setColeção(ArrayList<ItemDeColeção> coleção) {
		this.coleção = coleção;
	}

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
		GerenciadorDeColeções MeuGerenciador =  new GerenciadorDeColeções();
		
		MeuGerenciador.coleção = new ArrayList<ItemDeColeção>() {
					{
						add(new Chaveiro(2012, 55, "da Copa de 2012"));
						add(new Moeda(2002, 1992, 25, "5000 cruzeiros", "Brasil", "inox"));
						add(new Selo(2012, 2003, 30, "2 reais", "Brasil"));
						add(new NotaDeDinheiro(2008, 2000, 10, "2 reais", "Brasil"));
						add(new Chaveiro(2018, 5, "de metal com meu nome gravado"));
						add(new Moeda(1995, 1794, 5000, "1 dólar", "USA", "prata"));
						add(new NotaDeDinheiro(2004, 1997, 15, "1000 iene", "Japão"));
						add(new NotaDeDinheiro(2008, 2003, 25, "1000 pesos chilenos", "Chile"));
						add(new Moeda(2009, 1992, 20, "1 real", "Brasil", "cobre"));
						add(new Moeda(2009, 1992, 55, "5 euros", "Espanha", "latão"));
					}
				};		
		
		MeuGerenciador.imprimeItensDoPeríodo(1990, 1999);
		MeuGerenciador.imprimeItensDoPeríodo(2000, 2009);
		MeuGerenciador.imprimeItensDoPeríodo(2010, 2019);
	}

	public ArrayList<ItemDeColeção> busqueItensDoPeríodo (int anoDeInício, int anoDeFim) {
		ArrayList<ItemDeColeção> itensDoPeríodo = new ArrayList<ItemDeColeção>();
		
		for (ItemDeColeção item: this.coleção) 
			if (item.getAnoDeAquisição() >= anoDeInício && item.getAnoDeAquisição() <= anoDeFim)
				itensDoPeríodo.add(item);
		
		return itensDoPeríodo;
	}
	
	public void imprimeItensDoPeríodo (int anoDeInício, int anoDeFim) {
		ArrayList<ItemDeColeção> itensDoPeríodo = this.busqueItensDoPeríodo(anoDeInício, anoDeFim);
		int valorEstimadoTotal = 0;
		
		System.out.println("Itens adquiridos no período [" + anoDeInício + ", " + anoDeFim + "]:");
		
		if (itensDoPeríodo.size() == 0)
			System.out.println("\tNenhum item de sua coleção foi adquirido nesse período.");
		
		for (ItemDeColeção item: itensDoPeríodo) {
			System.out.println("\t" + item);
			valorEstimadoTotal += item.getValorEstimado();
		}
		
		System.out.println("Valor estimado total: " + valorEstimadoTotal + " reais\n");
	}
}
