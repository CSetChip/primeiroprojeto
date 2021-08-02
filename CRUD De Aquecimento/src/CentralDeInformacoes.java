import java.util.ArrayList;

public class CentralDeInformacoes {
	
	private ArrayList<Colaborador> todosOsColaboradores = new ArrayList<Colaborador>();
	private ArrayList<Servico> servi�os = new ArrayList<Servico>();
	private ArrayList<Associador> associacao = new ArrayList<Associador>();
	
	public ArrayList<Colaborador> getTodosOsColaboradores() {
		return todosOsColaboradores;
	}
	public void setTodosOsColaboradores(ArrayList<Colaborador> todosOsColaboradores) {
		this.todosOsColaboradores = todosOsColaboradores;
	}
	
	public ArrayList<Servico> getServi�os() {
		return servi�os;
	}
	public void setServi�os(ArrayList<Servico> servi�os) {
		this.servi�os = servi�os;
	}
	
	public ArrayList<Associador> getAssociacao() {
		return associacao;
	}
	public void setAssociacao(ArrayList<Associador> associacao) {
		this.associacao = associacao;
	}
	
	public boolean adicionarColaborador(Colaborador colaborador) {
			this.todosOsColaboradores.add(colaborador);
			if(recuperarColaborador(colaborador.getEmail()) != null) {
				return true;
		     } 
			return false;
	}
	
	public Colaborador recuperarColaborador(String e) {
		Colaborador v = null;
		for(int i = 0; i < todosOsColaboradores.size(); i++) {
			if(todosOsColaboradores.get(i).getEmail().equals(e) == true) {
				v = todosOsColaboradores.get(i);
			}
	     }
		return v;
	}
	public boolean adicionarServi�o(Servico a1) {
		if(recuperarServi�o(a1.getId()) == null) {
			servi�os.add(a1);
			return true;
	     } 
		return false;
	}

	public Servico recuperarServi�o(long i) {
		Servico s = null;
		for(int n = 0; n < servi�os.size(); n++) {
			if(servi�os.get(n).getId() == i) {
				s = servi�os.get(n);
			}
	     }
		return s;
	}
	
	public void adcionarAssociador(Associador associador) {
		associacao.add(associador);
	}
	public boolean associar(String email, long id) {
		for(int i = 0; i < associacao.size(); i++) {
			if(associacao.get(i).getColaborador().getEmail().equals(email) && associacao.get(i).getServico().getId() == id) {
				return true;
			}
		}
		adcionarAssociador(new Associador(recuperarColaborador(email), recuperarServi�o(id)));
		return false;
	}

}
