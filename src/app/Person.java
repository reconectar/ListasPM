package app;

public class Person {
	
	private String nome;
	private String cpf;
	private char sexo;
	private int idade;
	
	public Person() {
		this.nome = "Capistrano(a)";
		this.cpf = "000000000";
		this.sexo = 'A';
		this.idade = 0;
	}	
	
	
	public Person (String nome, String cpf, char sexo, int idade){
			this.nome = nome;
			this.cpf = cpf;
			this.sexo = sexo;
			this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome(String n) {
		this.nome = n;		
	}
	
	public void setCpf(String c) {
		this.cpf = c;
	}
	
	public void setSexo(char s) {
		this.sexo = s;		
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public boolean isMaior(int idadeRecebida) {
		return (idadeRecebida>=18);
	}
	
}



