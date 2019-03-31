package app;

abstract class Person {
	
	protected String nome;
	protected Endereco endereco;
	
	public Person() {
		this.nome = "Capistrano(a)";
		this.endereco = null;
	}	
	
	public Person (String nome, Endereco endereco){
		setNome(nome);
		setEndereco(endereco);
	}
	
	public boolean isMaior(int idadeRecebida) {
		return (idadeRecebida>=18);
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;		
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}



