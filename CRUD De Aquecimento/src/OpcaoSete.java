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
				
				System.out.print("Digite o nome do serviço: ");
				 servico = leitor.nextLine();
				
				for(int i = 0; i < central.getServiços().size(); i++) {
					if(central.getServiços().get(i).getNome().equalsIgnoreCase(servico)) {
						s = central.getServiços().get(i);
						central.associar(c.getEmail(),s.getId());
						ver = true;
						break;
					}
				}
				servico = "Associação não concluida, verifique o nome do colaborador ou serviço";

				if(ver == false) {
					System.out.println("Associação concluida.");
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


