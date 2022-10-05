package com.soprasteria;

public class Main {

	public static void main(String[] args) {
		String nome = "Marco";
		String cognome = "Boriello";
		int età = 35;
		String città = "Milano";
		boolean patente = true;
		String genere = "maschio";
		double altezza = 1.85;
		System.out.println("il nome è:" + nome + " " + cognome);
		System.out.println("l'età è:" + età + "anni");
		System.out.println(città.toUpperCase());
		if(patente == true) {
			System.out.println("ha la patente");
		}else {
			System.out.println("non ha la patente");
		}
		System.out.println("l'altezza è:" + altezza);
		
	}

}
