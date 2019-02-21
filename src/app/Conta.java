package app;

public class Conta {
	private String numConta;
	private int saldo;
	
	public Conta() {
		this.numConta = null;
		this.saldo = 0;
	}
	
	public Conta(int saldo, String numConta) {
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public void contaDeposit(int dinheiros, String numConta) {
		if(dinheiros>0) {
			this.saldo += dinheiros;
		}else {
			System.out.println("Dinheiros negativo não pode!");
		}
	}
	
	public void contaWithdraw(int dinheiros, String numConta) {
		if((dinheiros>0)&&(this.saldo-dinheiros>0)) {
			this.saldo -= dinheiros;
		}else {
			System.out.println("Dinheiros negativo não pode!");
		}
	}
	
	public String getConta() {
		return this.numConta;
	}

	public int getSaldo() {
		return this.saldo;
	}
}
