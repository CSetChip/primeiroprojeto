import java.util.Scanner;

public class OpcaoQuatro {
	
public static void execucao(Scanner leitor, CentralDeInformacoes central) {
		
		System.out.print("Digite o nome do servi�o:");
		String nomeSer = leitor.nextLine();
		System.out.print("Descreva o servi�o:");
		String des = leitor.nextLine();
		boolean tr = true;
		
		for(int i = 0; i < central.getServi�os().size(); i++) {
			if(central.getServi�os().get(i).getNome().equals(nomeSer)) {
				tr = false;
			}
		}
		if(tr == true) {
			while (true) {
				try {
					System.out.print("Quantos minutos para concluir esse servi�o:");
					int duracao = Integer.parseInt(leitor.nextLine());
					Servico s = new Servico(nomeSer, des, duracao);
					central.adicionarServi�o(s);
					System.out.println("Servi�o salvo\r\n");
					break;
				} catch (RuntimeException e) {
					System.out.println("Ops s� pode apenas numeros");
				}
			}
		}
		else {
			System.out.println("Servi�o existente");
		}
		
		
	}

}
