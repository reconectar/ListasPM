package app;

import java.util.*;

public class RunPerson {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		Person a = new Person();
		System.out.println("Nome: " + a.getNome() + "\nidade: " + 
							a.getIdade() + "\ncpf: " + a.getCpf() + "\nsexo: " + a.getSexo() + "\n");
		
		Person b = new Person("Arthur", "12361050609", 'M', 26);
		System.out.println("Nome: " + b.getNome() + "\nidade: " + 
				b.getIdade() + "\ncpf: " + b.getCpf() + "\nsexo: " + b.getSexo() + "\n");
				
		Person c = new Person();
		c.setNome("Rajha");
		c.setIdade(19);
		System.out.println("Nome: " + c.getNome() + "\nidade: " + 
				c.getIdade() + "\ncpf: " + c.getCpf() + "\nsexo: " + c.getSexo() + "\nMaior?: " +
				c.isMaior(c.getIdade()) + "\n");		
	}	

}
