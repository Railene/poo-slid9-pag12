package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataDeFabricacao;

	public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public Date getManufactureDate() {
		return dataDeFabricacao;
	}

	public void setManufactureDate(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}

	@Override
	public String precoTag() {
		return getNome() 
				+ " (usado) $ " 
				+ String.format("%.2f", getPreco())
				+ " (Data de fabricação: "
				+ sdf.format(dataDeFabricacao)
				+ ")";
	
	}
}