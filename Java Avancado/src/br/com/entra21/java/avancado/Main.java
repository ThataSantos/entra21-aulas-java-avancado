package br.com.entra21.java.avancado;

import java.util.Scanner;

import br.com.entra21.java.avancado.aula01.enums.PersonagemJogo;
import br.com.entra21.java.avancado.aula02.AprenderCollections;
import br.com.entra21.java.avancado.aula03.Aula03;

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
			case 3:
				AprenderCollections.aprender();
				break;
			case 4:
				Aula03.aprender();
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
		menu += "\n3 - Collection Menu";
		menu += "\nEscolha uma das Opções";
		menu += "\n4 - Anotações e datas";

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


//
//	static Scanner entrada = new Scanner(System.in);
//
//	public static void main(String[] args) {
//
//		byte opcao;
//		do {
//			System.out.println(montarMenu());
//			opcao = entrada.nextByte();
//
//			switch (opcao) {
//			case 0:
//				System.out.println("Até a proxima!");
//				break;
//			case 1:
//				Wrappers.aprender();
//				break;
//			case 2:
//				Enuns.aprender();
//				break;
//			case 3:
//				AprenderList.aprender();
//				break;
//			case 4:
//				Aula03.aprender();
//				break;
//			case 5:
//				pedirPaciencia();
//				break;
//			case 6:
//				pedirPaciencia();
//				break;
//			case 7:
//				pedirPaciencia();
//				break;
//			case 8:
//				pedirPaciencia();
//				break;
//			case 9:
//				pedirPaciencia();
//				break;
//			case 10:
//				pedirPaciencia();
//				break;
//
//			default:
//				System.out.println("Escolha uma opção válida para aprender um assunto avançado sobre JAVA");
//				break;
//			}
//
//		} while (opcao != 0);
//		System.out.println("Obrigado, volse sempre que quiser aprender mais sobre JAVA AVANÇADO");
//
//	}
//
//	private static String montarMenu() {
//		String menu = "Módulo sobre JAVA AVANÇADO:";
//		menu += "\n  0 - Sair";
//		menu += "\n  1 - Aula 01 (pronto)- Classes Wrapper";// juntos 01
//		menu += "\n  2 - Aula 01 (pronto)- ENUM";// juntos 01
//
//		menu += "\n  3 - Aula 02 - Collections - LIST";// somente 02
//		menu += "\n  4 - Aula 03 - Annotations e Datas";// juntos 03
//		menu += "\n  5 - Aula 04 - Collections - SET";// somente 04
//		menu += "\n  6 - Aula 05 - Collections - MAP";// somente 05
//		menu += "\n  7 - Aula 06 - Generics";// somente 06
//		menu += "\n  8 - Aula 07 - Exceções e tratamento de erros";// somente 07
//		menu += "\n  9 - Aula 08 - Funções Lambda"; // somente 08
//		menu += "\n--------------------------------------------------------";
//		menu += "\n Escolha uma opção para aprender:";
//		menu += "\n--------------------------------------------------------";
//
//		return menu;
//	}
//
//	@Responsavel(ordemPrioridade = Responsavel.OrdemPrioridade.DOCUMENTAR, item = "Mostrar que não ta na hora", quemAssume = "Rubem Oliota")
//	private static void pedirPaciencia() {
//		System.out.println("CALMA CALMA CALMA, muita CALMA... ainda não esta pronto.");
//		System.out.println("--------------------------------------------------------");
//
//	}

