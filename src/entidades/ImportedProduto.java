package entidades;

public class ImportedProduto extends Produto{

	private Double customsFee;

	public ImportedProduto(String nome, Double preco, Double customsFee) {
		super(nome, preco);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double precoTotal() {
		return getPreco() + customsFee;
	}
	
	@Override
	public String precoTag() {
		return getNome() 
				+ " $ " 
				+ String.format("%.2f", precoTotal())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}

}
