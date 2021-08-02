import java.util.Scanner;

public class OpcaoUm {
	
	public static void execucao(Persistencia recuperar, CentralDeInformacoes central, Scanner leitor) {
		
		Colaborador pessoa = new Colaborador();
		System.out.print("Digite seu nome:");
		pessoa.setNome(leitor.nextLine());
		while (true) {
			System.out.print("Digite o seu Sexo [M/F]:");
			String mf = leitor.nextLine();
			if (mf.equalsIgnoreCase("m") || (mf.equalsIgnoreCase("masculino"))) {
				pessoa.setSexo(Generos.MASCULINO);
				break;
			} else if (mf.equalsIgnoreCase("f") || (mf.equalsIgnoreCase("feminino"))) {
				pessoa.setSexo(Generos.FEMININO);
				break;
			} else {
				System.out.println("Palavra invalida");
			}
		}

		System.out.print("Digite seu numero de telefone:");
		pessoa.setTelefone(leitor.nextLine());
		System.out.print("Digite seu E-mail:");
		pessoa.setEmail(leitor.nextLine());

		boolean ver = false;
		if (central.getTodosOsColaboradores() != null) {
			for (int a = 0; a < central.getTodosOsColaboradores().size(); a++) {
				if (pessoa.equals(central.getTodosOsColaboradores().get(a))) {
					ver = true;
				}
			}
		}

		if (ver == false) {
			central.adicionarColaborador(pessoa);
			try {
				recuperar.salvarCentral(central, "arquivos-Central.xml");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Informações salvas\r\n");
		} else {
			System.out.println("Colaborador ja cadastrado\r\n");
		}
		
	}

}
