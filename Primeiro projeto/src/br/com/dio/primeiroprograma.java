package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros Livros = new Livros();
		Cachorro Cachorro = new Cachorro();
		

		System.out.println(gato);
		System.out.println(Livros);
		System.out.println(Cachorro);
		
		/*
		 * int a = 2; int b = 3; System.out.println("hello world!" + (a+b));
		 */

	}

}

class Livros {
	private String nome;
	private String npage;
	
}

class Cachorro {
	private String nome;
	private String cor;

}

	
