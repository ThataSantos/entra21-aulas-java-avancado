package br.com.entra21.java.avancado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.java.avancado.aula01.Aula01;
import br.com.entra21.java.avancado.aula01.enuns.Enuns;
import br.com.entra21.java.avancado.aula01.wrappers.Wrappers;
import br.com.entra21.java.avancado.aula02.Aula02;
import br.com.entra21.java.avancado.aula03.Aula03;
import br.com.entra21.java.avancado.aula03.anotacoes.Responsavel;
import br.com.entra21.java.avancado.aula04.Aula04;
import br.com.entra21.java.avancado.aula04.Aula04Alunos;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;
		do {
			System.out.println(montarMenu());
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("At� a proxima!");
				break;
			case 1:
				Aula01.aprender();
				break;
			case 2:
				Aula02.aprender();
				break;
			case 3:
				Aula03.aprender();
				break;
			case 4:
				new Aula04("Aula04 - Collections - SET - HashSet", new ArrayList<>(Arrays.asList("Definir","CRUD"))).aprender();
				//Aula04Alunos.aprender();
				break;
			case 5:
				//new Aula05("Aula05 - Collections - MAP - HashMap", null).aprender();
				pedirPaciencia();
				break;
			case 6:
				pedirPaciencia();
				break;
			case 7:
				pedirPaciencia();
				break;
			case 8:
				pedirPaciencia();
				break;
			case 9:
				pedirPaciencia();
				break;
			case 10:
				pedirPaciencia();
				break;

			default:
				System.out.println("Escolha uma op��o v�lida para aprender um assunto avan�ado sobre JAVA");
				break;
			}

		} while (opcao != 0);
		System.out.println("Obrigado, volse sempre que quiser aprender mais sobre JAVA AVAN�ADO");

	}

	private static String montarMenu() {
		String menu = "M�dulo sobre JAVA AVAN�ADO:";
		menu += "\n  0 - Sair";
		menu += "\n  1 - Aula 01  ENUM e Classes Wrapper";
		menu += "\n  2 - Aula 02 - Collections - LIST";// somente 02
		menu += "\n  3 - Aula 03 - Annotations e Datas";// juntos 03
		menu += "\n  4 - Aula 04 - Collections - SET";// somente 04
		menu += "\n  5 - Aula 05 - Collections - MAP";// somente 05
		menu += "\n  6 - Aula 06 - Generics";// somente 06
		menu += "\n  7 - Aula 07 - Exce��es e tratamento de erros";// somente 07
		menu += "\n  8 - Aula 08 - Fun��es Lambda"; // somente 08
		menu += "\n  9 - Aula 09 - Fun��es Lambda"; 
		menu += "\n 10 - Aula 10 - Fun��es Lambda"; 
		menu += "\n--------------------------------------------------------";
		menu += "\n Escolha uma op��o para aprender:";
		menu += "\n--------------------------------------------------------";

		return menu;
	}

	@Responsavel(ordemPrioridade = Responsavel.OrdemPrioridade.DOCUMENTAR, item = "Mostrar que n�o ta na hora", quemAssume = "Rubem Oliota")
	private static void pedirPaciencia() {
		System.out.println("CALMA CALMA CALMA, muita CALMA... ainda n�o esta pronto.");
		System.out.println("--------------------------------------------------------");

	}

}
