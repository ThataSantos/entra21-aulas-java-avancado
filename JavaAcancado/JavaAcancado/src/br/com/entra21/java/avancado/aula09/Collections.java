package br.com.entra21.java.avancado.aula09;

import java.util.Scanner;
import br.com.entra21.java.avancado.aula09.annotations.Informacao;
import br.com.entra21.java.avancado.aula09.collections.ArrayList;
import br.com.entra21.java.avancado.aula09.collections.HashMap;
import br.com.entra21.java.avancado.aula09.collections.HashSet;
import br.com.entra21.java.avancado.aula09.collections.LinkedList;

@Informacao(informacoes = Informacao.Informacoes.DONE, value = "Conclusão do Uso de Collections")
public class Collections {
	
	public static void practicingCollecntions() {
		
		Scanner input = new Scanner(System.in);
		byte opcao;
				
		do {
			System.out.println("\nPraticando Collections\n");
			System.out.println("0) Voltar");
			System.out.println("1) ArrayList");
			System.out.println("2) LinkedList");
			System.out.println("3) HashSet");
			System.out.println("4) HashMap");
			System.out.println("--------------------------------------------------------");
			System.out.print(  "Escola uma opção válida:");

			opcao = input.nextByte();
			
			switch (opcao) {
					
			case 1:
			ArrayList.praticingArrayList();
			break;
			
			case 2:
			LinkedList.praticingLinkedList();
			break;
			
			case 3:
			HashSet.praticingHashSet();
			break;

			case 4:
			new HashMap().praticingHashMap();
			break;

			default:
			System.out.println("-Escolha um opção correta-");
			break;
			}

		}while(opcao != 0);
	}
}
