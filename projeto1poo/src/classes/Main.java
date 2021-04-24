package classes;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in); 
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();		
		int flag;
		do {
			flag = 0;
			System.out.println("Escolha o tipo de acesso:");
			System.out.println("1 - Usuário");
			System.out.println("2 - Administrador");
			int op = sc.nextInt();
			switch(op) {
			   case 1:		
					for (int i =0; i<2; i++) {
						Usuario novoUsu = new Usuario();
						System.out.println("Cadastro:");
						System.out.println("Informe o nome:");
						novoUsu.setNome(input.nextLine());
						
						System.out.println("Informe o e-mail:");
						novoUsu.setEmail(input.nextLine());
						
						System.out.println("Informe o CPF:");
						novoUsu.setCpf(input.nextLine());
						
						System.out.println("Informe o RG:");
						novoUsu.setRg(input.nextLine());
						
						System.out.println("Informe o telefone:");
						novoUsu.setTelefone(input.nextLine());
						
						System.out.println("Informe o sexo:");
						novoUsu.setSexo(input.nextLine());
						
						System.out.println("Informe a cidade:");
						novoUsu.setCidade(input.nextLine());
						
						System.out.println("Informe a idade:");
						novoUsu.setIdade(sc.nextInt());
						
						System.out.println("---------------");
						System.out.println("Agendamento:");
						System.out.println(" ---------------------------------------------------------");
						System.out.println("|    Pontos de Vacinação:     |     Vacinas Disponíveis:   |");
						System.out.println("|       Aguas Claras          |            H1N1            |");
						System.out.println("|        Taguatinga           |          CoronaVac         |");
						System.out.println("|       Plano Piloto          |         AstraZeneca        |");
						System.out.println(" ----------------------------------------------------------");
						
						System.out.println("Informe a dose:");
						int ds = sc.nextInt();
						
						System.out.println("Informe o nome da vacina:");
						String nm = input.nextLine();
						
						System.out.println("Informe o ponto de vacinação:");
						String local = input.nextLine();
						
						Vacinacao vacinacao = new Vacinacao();
						vacinacao.setNomeVacina(local);
						vacinacao.setDoses(ds);
						vacinacao.setNomeVacina(nm);
						
						novoUsu.getVacinacoes().add(vacinacao);
						
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
					break;
			   case 2:
				   //entrar
					System.out.println(" --------------------------- ");
					Administrador admin = new Administrador();
					
					System.out.println("Informe sua matrícula:");
					admin.setMatricula(input.nextLine());
					
					System.out.println("Informe o Cpf:");
					admin.setCpf(input.nextLine());
					
					
					//confirmarvacinacao
					System.out.println("Informe o Cpf do vacinado:");
					String cpfVacinado = input.nextLine();
					for (Usuario usuario1 : usuarios) {
						if(cpfVacinado.equals(usuario1.getCpf())) {
							
						}
							
						
					}
			
					
					System.out.println("-----------------------------");
					/*System.out.println("------------------");
					System.out.println("Dados administrador");
					System.out.println("Matricula: "+admin.getMatricula());
					System.out.println("Cpf: " + admin.getCpf());*/
		
					break;
				default:
					System.out.println("Comando inválido");
					flag = 1;
			}
		}while(flag==1);
				
	}

}
