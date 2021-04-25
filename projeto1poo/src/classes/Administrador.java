package classes;

import interfaces.PermitirAcesso;

public class Administrador extends Pessoa implements PermitirAcesso{
	private String matricula;
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		return login.equals("admin") && senha.equals("admin");
	}

}
