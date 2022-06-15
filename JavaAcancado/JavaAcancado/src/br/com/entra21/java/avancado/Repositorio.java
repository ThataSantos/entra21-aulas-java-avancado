package br.com.entra21.java.avancado;

import java.util.HashMap;

public class Repositorio {
	 
    public static HashMap<String, Pessoa> pessoas = new HashMap<>();
 
    public static void inicializarPessoas() {
        if (pessoas.isEmpty()) {
            pessoas.put("Stephanie", new Pessoa("Stephanie", (byte) 28));
            pessoas.put("Ciro", new Pessoa("Ciro", (byte) 30));
            pessoas.put("Lucas", new Pessoa("Lucas", (byte) 24));
        }
    }
}