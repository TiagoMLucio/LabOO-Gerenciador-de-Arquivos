
public class ItemDeColeção {
	private int anoDeAquisição;
	private int anoDeEmissão;
	private int valorEstimado;
	private String valorDeFace;
	private String país;

	public int getAnoDeAquisição() {
		return anoDeAquisição;
	}

	public int getAnoDeEmissão() {
		return anoDeEmissão;
	}

	public int getValorEstimado() {
		return valorEstimado;
	}

	public String getValorDeFace() {
		return valorDeFace;
	}

	public String getPaís() {
		return país;
	}

	public ItemDeColeção(int anoDeAquisição, int valorEstimado) {
		this.anoDeAquisição = anoDeAquisição;
		this.valorEstimado = valorEstimado;
	}

	public ItemDeColeção(int anoDeAquisição, int anoDeEmissão, int valorEstimado, String valorDeFace, String país) {
		this.anoDeAquisição = anoDeAquisição;
		this.anoDeEmissão = anoDeEmissão;
		this.valorEstimado = valorEstimado;
		this.valorDeFace = valorDeFace;
		this.país = país;
	}
	
}
