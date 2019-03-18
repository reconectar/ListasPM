package app;

public class Empresa extends PessoaJuridica{
	
	private Funcionario presidente;
	private Cliente[] clientes;
    private Funcionario[] funcionarios;
	
	public Empresa(String nome, Endereco endereco, String cnpj, Funcionario presidente, Cliente[] clientes, Funcionario[] funcionarios){
		super(nome, endereco, cnpj);
		setPresidente(presidente);
		setClientes(clientes);
		setFuncionarios(funcionarios);
	}

	public Funcionario getPresidente() {
		return presidente;
	}

	public void setPresidente(Funcionario presidente) {
		this.presidente = presidente;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

}
