import java.util.ArrayList;

public class MainTeste {
	public static void main(String[] args) {
		
		/*ArrayList<Servico> s = new ArrayList<Servico>();
		Servico ser= new Servico(),serco = new Servico();
		ser.setNome("jen");
		ser.setDescricao("bom");
		ser.setDuracaoMedia(100);
		serco.setDescricao("ruim");
		serco.setDuracaoMedia(20);
		serco.setNome("ju");
		s.add(ser);
		s.add(serco);
		
		GeradorDeRelatorio g = new GeradorDeRelatorio();
		g.gerarRelatorio(s);*/
		
		Mensageiro men = new Mensageiro();
		Colaborador c = new Colaborador();
		
		c.setEmail("ttestes091@gmail.com");
		men.enviaremailAocolaborador(c, "Olá");
	}
	
	
	

}
