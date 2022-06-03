package br.com.entra21.java.avancado.aula03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.entra21.java.avancado.aula03.assuntos.InProgress;
import br.com.entra21.java.avancado.aula03.assuntos.Lembrete;
import br.com.entra21.java.avancado.aula03.assuntos.Responsavel;

public class Aula03 {

	static Scanner input = new Scanner(System.in);
	@Responsavel(ordemPrioridade = Responsavel.OrdemPrioridade.CRITICO, item = "Mostrar API de datas e anotações", quemAssume = "Rubem Oliota")
	static public  void aprender() {
		System.out.println(
				"Com a nova API de datas ficou mais facil programar e as anotações facilitam a configuração do código");

		Instant inicio = Instant.now();
		byte opcao;
		do {
			System.out.println("Menu - AULA 03:");
			System.out.println("0 - Voltar");
			System.out.println("1 - Datas");
			System.out.println("2 - Anotações");
			opcao = input.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Até a proxima!");
				break;
			case 1:
				aprenderDatas();
				break;
			case 2:
				aprenderAnotacoes();
				break;
			default:
				System.out.println("Escolha uma opção válida para aprender sobre Datas e Anotações");
				break;
			}

		} while (opcao != 0);
		Instant fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);

		System.out.println("--------------------------------------------");
		System.out.println("Milisegundos dedicados ao aprendizado = " + duracao.toMillis());
		System.out.println("Segundos dedicados ao aprendizado = " + duracao.toSeconds());
		System.out.println("Minutos dedicados ao aprendizado = " + duracao.toMinutes());
		System.out.println("Horas dedicadas ao aprendizado = " + duracao.toHours());
		System.out.println("Obrigado, volte sempre que quiser aprender mais sobre Datas e Anotações");
		System.out.println("--------------------------------------------");

		exemplo();
	}

	private static void aprenderDatas() {

		Instant inicio = Instant.now();

		System.out.println("Escolha um numero aleatorio, menos esse que voce acabou de pensar");
		long numero = input.nextLong();

		Instant fim = Instant.now();
		Duration tempo = Duration.between(inicio, fim);
		System.out.println("Voce demorou " + tempo.toSeconds() + " segundos para escolher o numero " + numero);
		System.out.println("Para datas, levamos " + tempo.toSeconds() + " segundos");

		aprenderDatasHumanizadas();

	}

	private static void aprenderDatasHumanizadas() {

		LocalDate today = LocalDate.now();
		System.out.println("Hoje é: " + today);

		LocalDate birthday = LocalDate.of(1994, 8, 3);
		System.out.println("Seu aniversário é: " + birthday);

		LocalDate thisThursday = LocalDate.of(2022, Month.JUNE, 3); // Month.JUNE -> ENUM.
		System.out.println("Essa Quinta: " + thisThursday);

		// Formata a data para uma melhor visualização
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YY"); // MMM aparece o mes(august)
		System.out.println("\n" + formatter.format(birthday));

		System.out.println("----------\n" + DateTimeFormatter.ofPattern("YYYY").format(thisThursday));

		Period lifetime = Period.between(birthday, today);
		System.out.println("\nEu vivi um total de: " + lifetime.getYears() + " anos, " + lifetime.getMonths()
				+ " meses e " + lifetime.getDays() + " dias.");

		LocalTime lanche = LocalTime.of(20, 10);
		LocalTime finalAula03 = LocalTime.of(22, 15);
		LocalTime avaliacao = LocalTime.of(22, 0);

		System.out.println("Fomos lanchar as: " + lanche + " Vamos avaliar a aula as " + avaliacao
				+ " temos que aprender tudo até " + finalAula03);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void aprenderAnotacoes() {
		System.out.println("Assunto anotações");
		ArrayList lista = new ArrayList();
		lista.add("dado");

		aindaNaoFiz();

		detalharAtributo();

		exercitar();
	}

	@InProgress
	private static void aindaNaoFiz() {
		// eu avisei que não fiz né?
	}

	@Lembrete(value = "o value esta lá na interface e o conteudo fica aqui")
	private static void detalharAtributo() {
		// TODO Auto-generated method stub

	}

	@Responsavel(item = "Praticar o que aprendeu", quemAssume = "Alunos")
	private static void exercitar() {
		// TODO Auto-generated method stub

	}

	@Lembrete(value = "Isso serve de exemplo para aprender anotações com valor")
	private static void exemplo() {
		// somente exemplo
	}

}
