
public class Chaveiro extends ItemDeColeção {

	private String descrição;
	
	public Chaveiro(int anoDeAquisição, int valorEstimado, String descrição) {
		super(anoDeAquisição, valorEstimado);
		this.descrição = descrição;
	}
	
	@Override
	public String toString() {
		return "Chaveiro " + this.descrição;
	}

}
