import java.util.Scanner;

public class OpcaoSeis {
	
	public static void execucao(CentralDeInformacoes central, Scanner leitor) {
		
		boolean ver = false;
		while (ver == false) {
			System.out.print("Digite o numero de identifica��o do servi�o(Id):");
			String test = leitor.nextLine();
			try {
				long servico = Long.parseLong(test);
				if (central.getServi�os() != null) {

					for (int i = 0; i < central.getServi�os().size(); i++) {
						if (central.getServi�os().get(i).getId() == servico) {
							Servico ser = central.getServi�os().get(i);
							System.out.println(ser.toString());
							ver = true;
							break;
						}
					}
					if (ver == false) {
						System.out.println("Id n�o encontrado\r\n");
						break;
					}
				} else {
					System.out.println("Servi�o inexistente\r\n");
					break;
				}
			} catch (RuntimeException e) {
				System.out.println("O id n�o pode conter letras\r\n");
			}
		}
		
	}

}
