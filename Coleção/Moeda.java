
public class Moeda extends ItemDeColeção {

	private String material;
	
	public Moeda(int anoDeAquisição, int anoDeEmissão, int valorEstimado, String valorDeFace, String país, String material) {
		super(anoDeAquisição, anoDeEmissão, valorEstimado, valorDeFace, país);
		this.material = material;
	}

	@Override
	public String toString() {
		return "Moeda de " + this.material + " de " + this.getValorDeFace();
	}
	
}
