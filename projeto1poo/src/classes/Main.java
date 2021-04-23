package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Usuario novoUsu = new Usuario();
		
		System.out.println("Informe o nome:");
		novoUsu.setNome(input.nextLine());
		
		System.out.println("Informe o e-mail:");
		novoUsu.setEmail(input.nextLine());
		
		System.out.println("Informe o CPF:");
		novoUsu.setCpf(input.nextLine());
		
		System.out.println("Informe o RG:");
		novoUsu.setRg(input.nextLine());
		
		System.out.println("Informe a cidade:");
		novoUsu.setCidade(input.nextLine());

		System.out.println("Informe a idade:");
		novoUsu.setIdade(input.nextInt());
		
		System.out.println("Informe o telefone:");
		novoUsu.setTelefone(input.nextLine());
		
		System.out.println("Informe o sexo");
		novoUsu.setSexo(input.nextLine());
		
		
		System.out.println(" --------------------------- ");
		Administrador admin = new Administrador();
		
		System.out.println("Informe sua matrícula:");
		admin.setMatricula(input.nextLine());
		
		System.out.println("Informe a cidade:");
		admin.setCidade(input.nextLine());
		
		System.out.println("Informe o nome:");
		admin.setNome(input.nextLine());
		
		System.out.println("Informe o Cpf:");
		admin.setCpf(input.nextLine());
		
		System.out.println("Informe o RG:");
		admin.setRg(input.nextLine());
		
		
		System.out.println("-----------------------------");
		System.out.println("Dados usuário");
		System.out.println("Nome: " + novoUsu.getNome());
		System.out.println("Email: "+ novoUsu.getEmail());
		System.out.println("Cpf: " + novoUsu.getCpf());
		System.out.println("Rg: "+ novoUsu.getRg());
		System.out.println("Cidade: "+ novoUsu.getCidade());
		System.out.println("Idade: "+novoUsu.getIdade());
		System.out.println("Telefone:" + novoUsu.getTelefone());
		System.out.println("Sexo: "+novoUsu.getSexo());
		System.out.println("------------------");
		System.out.println("Dados administrador");
		System.out.println("Matricula: "+admin.getMatricula());
		System.out.println("Nome: " + admin.getNome());
		System.out.println("Cpf: " + admin.getCpf());
		System.out.println("Rg: "+ admin.getRg());
		System.out.println("Cidade: "+ admin.getCidade());
		
	}

}
