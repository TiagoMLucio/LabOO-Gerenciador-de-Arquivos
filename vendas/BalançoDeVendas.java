import java.util.*;

public class BalançoDeVendas {
	
	private List<Venda> vendas;
	private int valorTotalDoImposto;
	private int receitaLiquidaTotal;
	private int valorTotalDoFrete;

	public BalançoDeVendas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BalançoDeVendas meuBalanço = new BalançoDeVendas();
		
		meuBalanço.lerVendas();
		meuBalanço.imprimirRelatório();
		}
	
	public void lerVendas() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Insira a quantidade de vendas: ");
		int quantidadeDeVendas = sc.nextInt();
		
		for (int i = 0; i < quantidadeDeVendas; i++) {
			System.out.println("===== Venda " + i + "=====");
			System.out.println("Insira o código do item: ");
			String códigoDoItem = sc.next();
			System.out.println("Insira o nome do item: ");
			String nomeDoItem = sc.next();
			System.out.println("Insira o valor da venda: ");
			int valorDaVenda = sc.nextInt();
			System.out.println("Selecione uma das opções abaixo para local de residência do morador:\n"
					+ "1. Dentro do Estado de São Paulo\n"
					+ "2. Para outros Estados\n"
					+ "3. Para o exterior"
					);
			int local = sc.nextInt();
			this.vendas.add(new Venda(códigoDoItem, nomeDoItem, valorDaVenda, local));
			}
		sc.close();
	}
	
	public void imprimirRelatório() {
		for(Venda venda: this.vendas) System.out.println(venda);
	}
	

}
