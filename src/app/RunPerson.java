package app;

import java.util.*;

public class RunPerson {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		Person a = new Person();
		System.out.println("Nome: " + a.getNome() + " idade: " + 
							a.getIdade() + " cpf: " + a.getCpf() + " sexo: " + a.getSexo());
		
		Person b = new Person("Arthur", "12361050609", 'M', 26);
		System.out.println("Nome: " + b.getNome() + " idade: " + 
				b.getIdade() + " cpf: " + b.getCpf() + " sexo: " + b.getSexo());
				
		Person c = new Person();
		c.setNome("Rajha");
		c.setIdade(19);
		System.out.println("Nome: " + c.getNome() + " idade: " + 
				c.getIdade() + " cpf: " + c.getCpf() + " sexo: " + c.getSexo() + " Maior?: " +
				c.isMaior(c.getIdade()));		
	}	

}
