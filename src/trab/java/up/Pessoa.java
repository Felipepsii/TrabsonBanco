package trab.java.up;

public class Pessoa  {

	private static int cont = 1;
	
	private String nome;
	private int idade;
	private String cpf;
	private String email;
	private String nasc;
	private int saldo;
	
	public Pessoa(String nome, String CPF, String email, String  nasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.nasc = nasc;
		cont += 1;
		
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public  String getCPF() {
		return cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmai() {
		return email;
	}

	public void sertEmail(String email) {
		this.email = email;
	}
	
	public  String getNasc() {
		return nasc;
	}
	
	public void setNasc(String nasc) {
		this.nasc = nasc;
	}
	
	
	public String toString() {
		return "\nNome: + " +  this.getNome() +
					 "\nCPF : " + this.getCPF() + 
					 "\nEmail: " + this.getEmai()+
					 "\nData de Nascimento: " + this.getNasc();
 	}
	
}
