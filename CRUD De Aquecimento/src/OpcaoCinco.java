
public class OpcaoCinco {
	
	public static void execucao(CentralDeInformacoes central) {
		
		if (central.getServi�os() != null) {
			for (int q = 0; q < central.getServi�os().size(); q++) {
				System.out.println("Id: " + central.getServi�os().get(q).getId() + " , Servi�o: "
						+ central.getServi�os().get(q).getNome());
			}
			System.out.println("\r\n");
		} else {
			System.out.println("N�o h� nenhum servi�o disponivel no momento\r\n");
		}
		
	}

}
