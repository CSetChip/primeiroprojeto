import java.util.Scanner;

public class OpcaoQuatro {
	
public static void execucao(Scanner leitor, CentralDeInformacoes central) {
		
		System.out.print("Digite o nome do serviço:");
		String nomeSer = leitor.nextLine();
		System.out.print("Descreva o serviço:");
		String des = leitor.nextLine();
		boolean tr = true;
		
		for(int i = 0; i < central.getServiços().size(); i++) {
			if(central.getServiços().get(i).getNome().equals(nomeSer)) {
				tr = false;
			}
		}
		if(tr == true) {
			while (true) {
				try {
					System.out.print("Quantos minutos para concluir esse serviço:");
					int duracao = Integer.parseInt(leitor.nextLine());
					Servico s = new Servico(nomeSer, des, duracao);
					central.adicionarServiço(s);
					System.out.println("Serviço salvo\r\n");
					break;
				} catch (RuntimeException e) {
					System.out.println("Ops só pode apenas numeros");
				}
			}
		}
		else {
			System.out.println("Serviço existente");
		}
		
		
	}

}
