package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import app.Cliente;
import app.Empresa;
import app.Endereco;
import app.Funcionario;

class EmpresaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Funcionario[] funcs = new Funcionario[100];
		for(int i = 0; i < funcs.length; i++) {
		        Endereco end = ;
			funcs[i] = new Funcionario("joao", end, "123123", 1581);
		}

		Cliente[] clientes = new Cliente[100];
		for(int i = 0; i < clientes.length; i++) {
			Endereco end = // Cria o endereco do cliente (pode usar scanner)
			cliente[i] = new Cliente("Maria", end, "1824", 190248);
		}

		Endereco endDaEmpresa = new Endereco("Rua abc", .....);

		Funcionario presidente = new Funcionario("Bill Gates", ....);

		Empresa e = new Empresa("Shulambs", endDaEmpresa, "12381238", presidente, clientes, funcs);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
