import java.util.Scanner;

public class OpcaoNove extends Opcao {
	
	public static void execucao(Scanner leitor, CentralDeInformacoes central) {
			
			System.out.print("Digite o nome do colaborador:");
			String nome = leitor.nextLine();
			Colaborador d = null;
			boolean en = false;
			
			for(int i = 0; i < central.getTodosOsColaboradores().size(); i++) {
				if(central.getTodosOsColaboradores().get(i).getNome().equalsIgnoreCase(nome)) {
					d = central.getTodosOsColaboradores().get(i);
					en = true;
				}
			}
			if(en == true) {
				System.out.print("Digite a mensagem:");
				String texto = leitor.nextLine();
				Mensageiro correio = new Mensageiro();
				correio.enviaremailAocolaborador(d, texto);
			}
			else {
				System.out.print("Nenhum colaborador com esse nome foi encontrado!");
			}
	}
}


