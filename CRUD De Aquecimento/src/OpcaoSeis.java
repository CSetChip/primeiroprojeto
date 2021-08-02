import java.util.Scanner;

public class OpcaoSeis {
	
	public static void execucao(CentralDeInformacoes central, Scanner leitor) {
		
		boolean ver = false;
		while (ver == false) {
			System.out.print("Digite o numero de identificação do serviço(Id):");
			String test = leitor.nextLine();
			try {
				long servico = Long.parseLong(test);
				if (central.getServiços() != null) {

					for (int i = 0; i < central.getServiços().size(); i++) {
						if (central.getServiços().get(i).getId() == servico) {
							Servico ser = central.getServiços().get(i);
							System.out.println(ser.toString());
							ver = true;
							break;
						}
					}
					if (ver == false) {
						System.out.println("Id não encontrado\r\n");
						break;
					}
				} else {
					System.out.println("Serviço inexistente\r\n");
					break;
				}
			} catch (RuntimeException e) {
				System.out.println("O id não pode conter letras\r\n");
			}
		}
		
	}

}
