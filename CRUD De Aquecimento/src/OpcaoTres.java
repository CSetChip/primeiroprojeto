import java.util.Scanner;

public class OpcaoTres {
	
	public static void execucao(Scanner leitor, CentralDeInformacoes central) {
		
		System.out.print("Digite o  E-mail do colaborador:");
		String email = leitor.nextLine();
		int cont = 0;
		for (int i = 0; i < central.getTodosOsColaboradores().size(); i++) {
			if (email.equals(central.getTodosOsColaboradores().get(i).getEmail())) {
				System.out.println(central.getTodosOsColaboradores().get(i).toString());
				cont++;
				break;
			}
		}
		if (cont == 0) {
			System.out.println("Colaborador inexistente");
		}
		System.out.println("\r\n");
	}

}
