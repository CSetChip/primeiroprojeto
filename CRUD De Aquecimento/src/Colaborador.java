import java.util.ArrayList;

public class Colaborador {
	
	private String nome;
	private String telefone;
	private Generos sexo;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Generos getSexo() {
		return sexo;
	}
	public void setSexo(Generos sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Colaborador(String name, String tell, Generos g, String e) {
		nome = name;
		telefone = tell;
		sexo = g;
		email = e;
	}
	public Colaborador() {
	}
	
	public String toString() {
		return "Nome: " +  nome + ", Num: " + telefone + ", Sexo: " + String.valueOf(sexo)
		+ ", E-mail: " +  email;
	}
	public boolean equals(Colaborador p) {
		if(email.equals(p.getEmail()))
			return true;
		return false;
	}

}
