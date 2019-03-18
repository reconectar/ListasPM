package app;

public class PessoaJuridica extends Person{
	
	protected String cnpj;
	
	public PessoaJuridica(String nome, Endereco endereco, String cnpj){
		super(nome, endereco);
		setCnpj(cnpj);		
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}
}
