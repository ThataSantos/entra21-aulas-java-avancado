package br.com.entra21.java.avancado;

import java.util.Scanner;

import br.com.entra21.java.avancado.aula01.enums.PersonagemJogo;

public class Main {

	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}

	public static void main(String[] args) {

		byte option;

		do {

			System.out.println(exibirMenu());
			option = input.nextByte();

			switch (option) {
			case 0:

				System.out.println("Saindo");

				break;
			case 1:

				learningWrapper();

				break;
			case 2:

				learningENUM();

				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}

		} while (option != 0);

	}

	private static String exibirMenu() {

		String menu = "Vamos aprender sobre conceitos avançados em JAVA!";
		menu += "\n0 - Sair";
		menu += "\n1- Wrapper";
		menu += "\n2 - ENUM";
		menu += "\nEscolha uma das Opções";

		return menu;
	}

	public static void learningWrapper() {

		// converter valores em tipos primitivos

		char letra = Character.valueOf('C');
		boolean verdade = Boolean.parseBoolean("True");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade2 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");

		byte inteiroUm = Byte.parseByte("127");
		short inteiroDois = Short.parseShort("128");
		int inteiroTres = Integer.parseInt("10000");
		long inteiroQuatro = Long.parseLong("100000");

		float decimalUm = Float.parseFloat("1000.10");
		double decimalDois = Double.parseDouble("2000.20 ");

	}

	private static void learningENUM() {

		System.out.println("Testando Enum: " + DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEGUNDA;
		System.out.println(hoje ? "sim" : "nao");

		for (int dia = 0; dia < DiasSemana.values().length; dia++) {
			System.out.println((dia + 1) + " - " + DiasSemana.values()[dia]);
		}

		System.out.println("Gosto deste tipo de personagem " + PersonagemJogo.ANAO);
		System.out.println("Geralmente a classe " + PersonagemJogo.ANAO + " tem HP = " + PersonagemJogo.ANAO.getHP());
		System.out.println("Veja a caracteristica masi comum dele: " + PersonagemJogo.ANAO.getDESCRICAO());

		System.out.println("O mago esta no indice do enum " + PersonagemJogo.MAGO.ordinal());
		System.out.println("\n Veja a descrição completa do " + PersonagemJogo.MAGO + " sua vida é "
				+ PersonagemJogo.MAGO.getHP() + " e sua habilidade principal " + PersonagemJogo.MAGO.getDESCRICAO());

		System.out.println(PersonagemJogo.BARBARO.getDetails());

		System.out.println("");
		for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {

			System.out.println(
					"Contador = " + personagem + " posicao do Enum = " + PersonagemJogo.values()[personagem].ordinal());
			System.out.println("O personagem " + PersonagemJogo.values()[personagem].name());
			System.out.println(PersonagemJogo.values()[personagem].getHP());
			System.out.println(PersonagemJogo.values()[personagem].getDESCRICAO());
			System.out.println("-----------------------------------------");
		}

		for (PersonagemJogo variavel : PersonagemJogo.values()) {
			System.out.println(variavel.ordinal() + " - " + variavel.getDetails());
		}
		System.out.println("");
		System.out.println("O Druida esta na posicao " + PersonagemJogo.DRUIDA.ordinal());
	}
}
