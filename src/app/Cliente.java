package app;

public class Cliente extends PessoaJuridica{
	
	private int limiteDeCredito;
	
	public Cliente(String nome, Endereco endereco, String cnpj, int limiteDeCredito) {
		super(nome, endereco, cnpj);
		setLimiteDeCredito(limiteDeCredito);
	}
	
	public int getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(int limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}	

}
