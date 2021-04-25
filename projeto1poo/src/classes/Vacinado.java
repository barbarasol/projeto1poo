package classes;

import java.util.ArrayList;

public class Vacinado extends Usuario {
	private ArrayList<Vacinacao> vacinacoes = new ArrayList<Vacinacao>();

	public ArrayList<Vacinacao> getVacinacoes() {
		return vacinacoes;
	}

	public void setVacinacoes(ArrayList<Vacinacao> vacinacoes) {
		this.vacinacoes = vacinacoes;
	}
	
}
