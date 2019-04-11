package q2;

public class Aplicacao {

	public static void main(String[] args) {
		CalendarioGragoriano[] datas = new CalendarioGragoriano[10];
		for(int i=0; i<10; i++) {
			int dia = (int) (Math.random() * (28 - 1) + 1);
			int mes = (int) (Math.random() * (12 - 1) + 1);
			int ano = (int) (Math.random() * (2399 - 1900) + 1900);
			datas[i] = new CalendarioGragoriano(ano, mes, dia);		
		}
		datas = (CalendarioGragoriano[]) Ordenador.crescente(datas);
		for(int i = 0; i<datas.length;i++) {
            System.out.println(datas[i]);
        }
		datas = (CalendarioGragoriano[]) Ordenador.decrescente(datas);
		for(int i = 0; i<datas.length;i++) {
            System.out.println(datas[i]);
        }
	}
}
