
public class NotaDeDinheiro extends ItemDeColeção {
	
	public NotaDeDinheiro(int anoDeAquisição, int anoDeEmissão, int valorEstimado, String valorDeFace, String país) {
		super(anoDeAquisição, anoDeEmissão, valorEstimado, valorDeFace, país);
	}

	@Override
	public String toString() {
		return "Nota de " + this.getValorDeFace();
	}

}
