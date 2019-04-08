//cliente
package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
	private Integer id;
	private String nome;
	private String email;
	private List<Produto> produtos;

	public Cliente() {
	}

	public Cliente(Integer id, String nome, String email, List<Produto> produtos) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Cliente [ nome=" + nome + ", email=" + email + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Boolean isNome() {
		Pattern p = Pattern.compile(".@.+[a-z]");
		Matcher m = p.matcher(this.nome);
		return m.matches();
	}

	public Boolean isEmail() {
		if (this.email == null)
			return false;
		Pattern p = Pattern.compile(".@.+\\.[a-z]+");
		Matcher m = p.matcher(this.email);
		return m.matches();
	}

	public Boolean isId() {
		if (this.id == null)
			return false;
		if (this.id.equals(id))
			return false;
		if (this.id < 0)
			return false;
		return true;
	}

}
