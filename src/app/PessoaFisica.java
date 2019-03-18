package app;

public class PessoaFisica extends Person {
	
	protected char sexo;
	protected int idade;
	protected String cpf;
	
	
	public PessoaFisica(String nome, Endereco endereco, char sexo, int idade, String cpf){
		super(nome, endereco);
		setSexo(sexo);
		setIdade(idade);
		setCpf(cpf);
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;		
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
