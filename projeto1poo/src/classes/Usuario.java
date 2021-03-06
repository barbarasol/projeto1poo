package classes;

import java.util.ArrayList;

public class Usuario extends Pessoa{
	private String email;
	private String telefone; 
	private String sexo;
	private int idade;
	private ArrayList<Vacinacao> vacinacoes = new ArrayList<Vacinacao>();

	
	public ArrayList<Vacinacao> getVacinacoes() {
		return vacinacoes;
	}
	public void setVacinacoes(ArrayList<Vacinacao> vacinacoes) {
		this.vacinacoes = vacinacoes;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
