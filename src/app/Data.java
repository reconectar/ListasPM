package app;

public class Data {

	private int ano, mes, dia;

	public Data(int ano, int mes, int dia) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	public Data() { // Hoje
		this.ano = 2019;
		this.mes = 2;
		this.dia = 19;
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void proximoDia() {
		if ((this.mes >= 1) && (this.mes <= 12)) {
			if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
				if(mes == 12) {
					if (this.dia < 31) {
						this.dia++;
					} else {
						this.ano++;
						this.dia = 1;
						this.mes = 1;
					}	
				}else {			
					if (this.dia < 31) {
						this.dia++;
					} else {
						this.mes++;
						this.dia = 1;
					}			
				}
			} else if (mes == 2) {
				if (this.eAnoBissexto()) {
					if (this.dia < 29) {
						this.dia++;
					} else {
						this.mes++;
						this.dia = 1;
					}
				} else {
					if (this.dia < 28) {
						this.dia++;
					} else {
						this.mes++;
						this.dia = 1;
					}
				}
			} else {
				if (this.dia < 30) {
					this.dia++;
				} else {
					this.mes++;
					this.dia = 1;
				}
			}
		} else {
			System.out.println(" Mes inválido! ");
		}
	}

	public void adicionaDias(int dias) {
		int n;
		for(n=dias;n>0;n--){
			this.proximoDia();			
		}
	}

	public int diasNoMes() {
		if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
			return 31;
		}else if(this.mes == 2){
			if(this.eAnoBissexto()) {
				return 29;
			}else {
				return 28;
			}
		}else {
			return 30;
		}
	}

	public String diaDaSemana() {
		
		return "Segunda-feira";
//		return "Terça-feira";
//		return "Quarta-feira";
//		return "Quinta-feira";
//		return "Sexta-feira";
//		return "Sábado";
//		return "Domingo";
	}

	public boolean eAnoBissexto() {
		return ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) );
	}
}