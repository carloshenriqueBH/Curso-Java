package trabalhandoComArquivos;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private String login;
	private String senha;
	private String CPF;
	private String nome;
	
	@Override
	public String toString() {
		return "usuario [login=" + login + ", senha=" + senha + ", CPF=" + CPF + ", nome=" + nome + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}

	
	
	
}
