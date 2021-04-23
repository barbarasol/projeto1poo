package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
		
		for (int i =0; i<2; i++) {
			Usuario novoUsu = new Usuario();
			System.out.println("Informe o nome:");
			novoUsu.setNome(input.next());
			
			System.out.println("Informe o e-mail:");
			novoUsu.setEmail(input.next());
			
			System.out.println("Informe o CPF:");
			novoUsu.setCpf(input.next());
			
			System.out.println("Informe o RG:");
			novoUsu.setRg(input.next());
			
			System.out.println("Informe a cidade:");
			novoUsu.setCidade(input.next());

			System.out.println("Informe o telefone:");
			novoUsu.setTelefone(input.next());
			
			System.out.println("Informe o sexo:");
			novoUsu.setSexo(input.next());
			
			System.out.println("Informe a idade:");
			novoUsu.setIdade(input.nextInt());
			
			usuarios.add(novoUsu);
			
		}
		for (Usuario usuario : usuarios) {
			System.out.println("-----------------");
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Email: "+ usuario.getEmail());
			System.out.println("Cpf: " + usuario.getCpf());
			System.out.println("Rg: "+ usuario.getRg());
			System.out.println("Cidade: "+ usuario.getCidade());
			System.out.println("Idade: "+usuario.getIdade());
			System.out.println("Telefone:" + usuario.getTelefone());
			System.out.println("Sexo: "+usuario.getSexo());
		}
		
		
		System.out.println(" --------------------------- ");
		Administrador admin = new Administrador();
		
		System.out.println("Informe sua matrícula:");
		admin.setMatricula(input.next());
		
		System.out.println("Informe a cidade:");
		admin.setCidade(input.next());
		
		System.out.println("Informe o nome:");
		admin.setNome(input.next());
		
		System.out.println("Informe o Cpf:");
		admin.setCpf(input.next());
		
		System.out.println("Informe o RG:");
		admin.setRg(input.next());
		
		
		System.out.println("-----------------------------");
	
		/*System.out.println("Dados usuário");
		System.out.println("Nome: " + novoUsu.getNome());
		System.out.println("Email: "+ novoUsu.getEmail());
		System.out.println("Cpf: " + novoUsu.getCpf());
		System.out.println("Rg: "+ novoUsu.getRg());
		System.out.println("Cidade: "+ novoUsu.getCidade());
		System.out.println("Idade: "+novoUsu.getIdade());
		System.out.println("Telefone:" + novoUsu.getTelefone());
		System.out.println("Sexo: "+novoUsu.getSexo());*/
		System.out.println("------------------");
		System.out.println("Dados administrador");
		System.out.println("Matricula: "+admin.getMatricula());
		System.out.println("Nome: " + admin.getNome());
		System.out.println("Cpf: " + admin.getCpf());
		System.out.println("Rg: "+ admin.getRg());
		System.out.println("Cidade: "+ admin.getCidade());
		
		
		
		System.out.println("-------------------------");
		Vacina novaVac = new Vacina();
		System.out.println("Informe o nome da vacina:");
		novaVac.setNomeVacina(input.next());
		
		System.out.println("Informe a quantidade de doses:");
		novaVac.setQtdeDoses(input.nextInt());
		
		System.out.println("--------------");
		System.out.println("Dados vacina");
		System.out.println("Nome vacina:" + novaVac.getNomeVacina());
		System.out.println("Quantidade de doses: " + novaVac.getQtdeDoses());
		
	}

}
