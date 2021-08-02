import java.util.Scanner;

public class OpcaoSete {
	
public static void execucao(CentralDeInformacoes central, Scanner leitor) {
		
		Colaborador c = null;
		Servico s = null;
		boolean ver = false;
		String nome = "";
		String servico = "";
		
		
		System.out.print("Digite o nome do colaborador : ");
		 nome = leitor.nextLine();
		
		for(int i = 0; i < central.getTodosOsColaboradores().size(); i++) {
			if(central.getTodosOsColaboradores().get(i).getNome().equalsIgnoreCase(nome)) {
				c = central.getTodosOsColaboradores().get(i);
				ver = true;
				break;
			}
		}
		
		if(ver == true) {
				
				System.out.print("Digite o nome do servi�o: ");
				 servico = leitor.nextLine();
				
				for(int i = 0; i < central.getServi�os().size(); i++) {
					if(central.getServi�os().get(i).getNome().equalsIgnoreCase(servico)) {
						s = central.getServi�os().get(i);
						central.associar(c.getEmail(),s.getId());
						ver = true;
						break;
					}
				}
				servico = "Associa��o n�o concluida, verifique o nome do colaborador ou servi�o";

				if(ver == false) {
					System.out.println("Associa��o concluida.");
				}
				else {
					System.out.println(servico);
				}
				
		}
		else {
			System.out.println(servico);
		}
	}
}


