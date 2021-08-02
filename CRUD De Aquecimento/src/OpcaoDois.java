
public class OpcaoDois {
	
	public static void execucao(CentralDeInformacoes central) {
		
		if (central.getTodosOsColaboradores() == null) {
			System.out.println("Sem colabores, adicione os colaboradores\r\n");
		} else {
			for (int i = 0; i < central.getTodosOsColaboradores().size(); i++) {
				System.out.println(central.getTodosOsColaboradores().get(i).toString());
			}
			System.out.print("\r\n");
		}
		
	}

}
