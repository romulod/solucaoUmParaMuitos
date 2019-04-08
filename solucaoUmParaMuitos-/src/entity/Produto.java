package entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Produto {

	private String nomeProduto;
	private Double preco = 0.;

	public Produto() {

	}

	public Produto(String produto, Double preco) {
		super();
		this.nomeProduto = produto;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", preco=" + preco + "]";
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Boolean isNomeProduto() {
		Pattern p = Pattern.compile(".@.+[a-z]");
		Matcher m = p.matcher(this.nomeProduto);
		return m.matches();
	}
	
	public Boolean isPreco() {
		if (this.preco == null)
			return false;
		if (this.preco < 0)
			return false;
		return true;
	}
}
