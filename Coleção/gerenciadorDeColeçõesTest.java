import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

@SuppressWarnings("serial")
class gerenciadorDeColeçõesTest {

	@Test
	void testBusqueItensDoPeríodo() {
		GerenciadorDeColeções MeuGerenciador =  new GerenciadorDeColeções();
		
		Chaveiro chaveiro1 = new Chaveiro(1993, 15, "da Copa de 2012");
		NotaDeDinheiro nota1 = new NotaDeDinheiro(1995, 1990, 10, "2 reais", "Brasil");
		Selo selo1 = new Selo(1999, 1978, 30, "2 reais", "Brasil");
		Moeda moeda1 = new Moeda(1980, 1976, 20, "1 real", "Brasil", "cobre");
		Chaveiro chaveiro2 = new Chaveiro(2012, 15, "da Copa de 2012");
		NotaDeDinheiro nota2 = new NotaDeDinheiro(2008, 2003, 10, "2 reais", "Brasil");
		Selo selo2 = new Selo(2012, 2003, 30, "2 reais", "Brasil");
		Moeda moeda2 = new Moeda(2021, 2003, 20, "1 real", "Brasil", "cobre");
		
		MeuGerenciador.setColeção(new ArrayList<ItemDeColeção>() {
			{
				add(chaveiro1);
				add(nota1);
				add(selo1);
				add(moeda1);
				add(chaveiro2);
				add(nota2);
				add(selo2);
				add(moeda2);
			}
		});
		
		assertEquals(
				MeuGerenciador.busqueItensDoPeríodo(1900, 1990), 
				new ArrayList<ItemDeColeção> () { 
					{
						add(moeda1); 
					} 
				});
		
		assertEquals(
				MeuGerenciador.busqueItensDoPeríodo(1990, 1999), 
				new ArrayList<ItemDeColeção> () { 
					{
						add(chaveiro1); 
						add(nota1); 
						add(selo1); 
					} 
				});
		
		assertEquals(
				MeuGerenciador.busqueItensDoPeríodo(2012, 2012), 
				new ArrayList<ItemDeColeção> () { 
					{
						add(chaveiro2); 
						add(selo2); 
					} 
				});
		
		assertEquals(
				MeuGerenciador.busqueItensDoPeríodo(2000, 2020), 
				new ArrayList<ItemDeColeção> () { 
					{
						add(chaveiro2); 
						add(nota2);
						add(selo2); 
					} 
				});
	}

}
