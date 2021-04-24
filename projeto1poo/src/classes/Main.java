package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in); 
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();		
		ArrayList<Vacinado> vacinados = new ArrayList<Vacinado>();
		
		int flag;
		int exitflag = 0;
		int flag2;
		do {
			flag = 0;
			while(exitflag == 0) {
				System.out.println("Escolha o tipo de acesso:");
				System.out.println("1 - Usuário");
				System.out.println("2 - Administrador");
				System.out.println("3 - Visualizar pessoas vacinadas");
				System.out.println("4 - Sair");
				int op = sc.nextInt();
				switch(op) {
				   case 1:		
					   do {
						   	flag2=0;
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
							
						    System.out.println("Deseja cadastrar novo usuário? Sim ou Não");
						    String resp = input.nextLine();
						    if(resp.equalsIgnoreCase("Sim")) {
						    	flag2= 1;
						    }	
					   }while(flag2==0);
								
						
					   //apresentando usuários
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
						Vacinado vacinado = new Vacinado();
						System.out.println("Informe o Cpf do vacinado:");
						String cpfVacinado = input.nextLine();
						for (Usuario usuario1 : usuarios) {
							if(cpfVacinado.equals(usuario1.getCpf())) {
								vacinado.setNome(usuario1.getNome());
								vacinado.setCpf(usuario1.getCpf());
								vacinado.setRg(usuario1.getRg());
								vacinado.setCidade(usuario1.getCidade());
								vacinado.setEmail(usuario1.getEmail());
								vacinado.setTelefone(usuario1.getTelefone());
								vacinado.setSexo(usuario1.getSexo());
								vacinado.setIdade(usuario1.getIdade());
																
								vacinados.add(vacinado);
							}
						}
						
						System.out.println("-----------------------------");
						/*System.out.println("------------------");
						System.out.println("Dados administrador");
						System.out.println("Matricula: "+admin.getMatricula());
						System.out.println("Cpf: " + admin.getCpf());*/
			
						break;
				   case 3:
					   
						
						break;
				   case 4:
					   System.exit(0);
					   break;
					default:
						System.out.println("Comando inválido");
						flag = 1;
				}
			}
		}while(flag==1);
				
	}

}
