package app;
import java.util.ArrayList;

public class Empresa extends PessoaJuridica{
	
	private Funcionario presidente;
	private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;
	
	public Empresa(String nome, Endereco endereco, String cnpj, Funcionario presidente){
		super(nome, endereco, cnpj);
		this.presidente = presidente;
		this.clientes = new ArrayList<>();
		this.funcionarios = new ArrayList<>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Funcionario getPresidente() {
		return presidente;
	}

	public void setPresidente(Funcionario presidente) {
		this.presidente = presidente;
	}
	
	@Override
	public String toString() {
		return (nome + "\n Presidente: " + presidente + "\n" + clientes + "\n" + funcionarios);
	}

}
