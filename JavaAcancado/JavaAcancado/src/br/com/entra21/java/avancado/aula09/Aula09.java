package br.com.entra21.java.avancado.aula09;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;

public class Aula09 extends Aula {
	public static HashMap<String, Pessoa> pessoas = new HashMap<>();

	public Aula09(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

	}

	@Override
	public byte capturarOpcao() {
		byte opcao = super.capturarOpcao();
		switch (opcao) {
		case 1:
			ExercicioWrappers.executar();
			break;

		case 2:
			Enum.practicingEnum();
			break;
		case 3:
			Collections.practicingCollecntions();
			break;
		case 4:
			Data.praticingData();
			break;
		case 5:
			Data.computador();
			break;
			

		}
		return opcao;

	}

}
