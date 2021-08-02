
public class OpcaoCinco {
	
	public static void execucao(CentralDeInformacoes central) {
		
		if (central.getServiços() != null) {
			for (int q = 0; q < central.getServiços().size(); q++) {
				System.out.println("Id: " + central.getServiços().get(q).getId() + " , Serviço: "
						+ central.getServiços().get(q).getNome());
			}
			System.out.println("\r\n");
		} else {
			System.out.println("Não há nenhum serviço disponivel no momento\r\n");
		}
		
	}

}
