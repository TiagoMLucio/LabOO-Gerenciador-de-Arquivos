
public class Selo extends ItemDeColeção {

	public Selo(int anoDeAquisição, int anoDeEmissão, int valorEstimado, String valorDeFace, String país) {
		super(anoDeAquisição, anoDeEmissão, valorEstimado, valorDeFace, país);
	}

	@Override
	public String toString() {
		return "Selo de " + this.getValorDeFace();
	}
	
}
