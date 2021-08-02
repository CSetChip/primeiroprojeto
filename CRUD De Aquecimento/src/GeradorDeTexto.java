import java.util.ArrayList;

public class GeradorDeTexto {

	public static String Gerador(CentralDeInformacoes central) {
		
		String texto = "";
		
		for(int i = 0; i < central.getServi�os().size(); i++) {
			
			texto += central.getServi�os().get(i).toString() + ": \n";
			
			for(int x = 0; x < central.getAssociacao().size(); x++) {
				
				if(central.getServi�os().get(i).getId() == central.getAssociacao().get(x).getServico().getId()) {
					
					texto += central.getAssociacao().get(x).getColaborador().getNome() + ". \n";
				}
			}
		}
		
		return texto;
	}

}
