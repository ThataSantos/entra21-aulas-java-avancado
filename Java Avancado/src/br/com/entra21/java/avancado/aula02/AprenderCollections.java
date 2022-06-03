package br.com.entra21.java.avancado.aula02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import br.com.entra21.java.avancado.aula03.assuntos.Lembrete;

public class AprenderCollections {

	static Scanner input = new Scanner(System.in);

	@Lembrete(value="Chamando de forma estatica esse meu SUBMENU")
	public static void aprender() {

		byte option;

		do {
			System.out.println("Escolha uma das opções:\n");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender ArrayList");
			System.out.println("2 - Aprender LinkedList");
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderArrayList();
				break;

			case 2:
				aprenderLinkedList();
				break;

			default:
				System.out.println("Escolha uma opção válida");
				break;

			}

		} while (option != 0);
		System.out.println("Volte sempre quando quiser aprender collections - list");

	}

	private static void aprenderArrayList() {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Geovani");
		nomes.add("Geovanne");
		nomes.add(0, "Primeiro"); // colocando um número no inicio, definimos a posição
		nomes.add("Geovane"); // caso contrário ele adiciona no final
		nomes.add("Rubem");

		System.out.println("Quantos nomes? " + nomes.size());

		// foreach > ctrl + espaço > resultado abaixo
		for (String item : nomes) { // esse tipo de for trabalha com uma variavel temporária. Percorrendo todos os
									// itens da lista

			System.out.println("O nome no momento é " + item);

		}

		for (int nome = 0; nome < nomes.size(); nome++) {

			System.out.println("No índice " + nome + " temos o valor " + nomes.get(nome));

		}

		System.out.println("O primeiro nome é: " + nomes.get(0));
		System.out.println("O terceiro nome é: " + nomes.get(2));

		nomes.set(0, "Primierissimo"); // o primeiro lugar no indice passa a ter outro nome desse jeito
		nomes.set(0, nomes.get(0).toUpperCase()); // assim ele pega o valor atual e coloca tudo em caixa alta
		nomes.set(0, nomes.get(3).toLowerCase()); // atualizei um valor e deixei tudo em caixa baixa
		System.out.println("Agora o primeiro nome é: " + nomes.get(0));

		System.out.println("Onde será que está o Rubem? " + nomes.indexOf("Rubem")); // usando o index para pegar a
																						// posição do elemento
		System.out.println("Vou deletar quem estiver no índice 2 " + nomes.get(2));
		nomes.remove(2); // removendo o item no indice 2
		nomes.remove(nomes.indexOf("Rubem")); // removendo o índice onde o Rubem está
		// fazendo dessa maneira consigo fazer de forma dinamica, já que a lista está
		// sempre sendo alterada

		// Criar uma lista de interesses
		// Inclua 5 interesses
		// Liste todos os interesses
		// Dessa lista escolha 2 que são favoritos para mostrar
		// Exclua um item por posição e outro por valor.
		// um syso para cada ação dessa

		ArrayList<String> interesses = new ArrayList<String>();
		interesses.add("Games");
		interesses.add("Musica");
		interesses.add(1, "programação");
		interesses.add("literatura");
		interesses.add(2, "Dramas Chineses");
		System.out.println("Tenho " + interesses.size() + " interesses e eles são:");
		for (String interesse : interesses) {

			System.out.println("\t" + interesse);

		}
		System.out.println("O primeiro favorito é : " + interesses.get(1));
		System.out.println("O segundo favorito é : " + interesses.get(2));

		System.out.println("Vou remover o interesse " + interesses.get(4));
		interesses.remove(4);
		System.out.println("Vou remover o interesse " + interesses.get(0));
		interesses.remove(interesses.indexOf("Games"));
		for (String interesse : interesses) {
			System.out.println("\t" + interesse);
		}

	}

	@Deprecated
	private static void aprenderLinkedList() {
		LinkedList<String> nomes = new LinkedList<>();
		 

		System.out.println("---------------Inserindo itens no LINKED ------------------");
		nomes.add("Rubem");
		nomes.add("Fulano");
		nomes.addFirst("Teste");
		nomes.addLast("Ultimo");
		nomes.add(2, "Inserido");

		System.out.println("Quantos nomes? " + nomes.size());

		System.out.println("---------------Acessando itens no LINKED ------------------");
		System.out.println("Quem é o primeiro? " + nomes.getFirst());
		System.out.println("Quem é o segundo? " + nomes.get(1));
		System.out.println("Quem é o ultimo? " + nomes.getLast());

		System.out.println("---------------Percorrendo itens no LINKED com iteração em array------------------");
		System.out.println("Ordem de inserção");
		for (String nome : nomes) {
			System.out.println("nome = " + nome);
		}

		System.out.println("---------------Percorrendo itens no LINKED com index em array------------------");
		System.out.println("De forma inversa");
		for (int nome = nomes.size() - 1; nome >= 0; nome--) {

			System.out.println("(" + nome + ") cargo = " + nomes.get(nome));

		}

		System.out.println("---------------Removendo itens no LINKED ------------------");
		System.out.println("Removendo quem estava no indice 0 ou seja " + nomes.getFirst());
		nomes.removeFirst();// removi o item no indice 0

		System.out.println("Removendo quem tem o nome \"Fulano\" pelo valor, sem saber que esta no indice "
				+ nomes.indexOf("Fulano"));
		nomes.remove("Fulano");// remove o elemento que tiver esse valor, o indice será procurado

		System.out.println("---------------Percorrendo itens no LINKED com forEach------------------");
		nomes.forEach(nome -> {
			System.out.println("nome " + nome);
		});

	}

}
