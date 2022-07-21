package br.com.entra21.java.avancado.aula09;

public class ExercicioWrappers {
	public static void executar() {

		byte variavelByte = Byte.parseByte("100");
		System.out.println("Recebeu uma string e retornou um byte " + variavelByte);

		short variavelShort = Short.parseShort("10000");
		System.out.println("Recebeu uma string e retornou um short " + variavelShort);

		int variavelInt = Integer.parseInt("300000");
		System.out.println("Recebeu uma string e retornou um Int" + variavelInt);

		long variavelLong = Long.parseLong("400000000");
		System.out.println("Recebeu uma string e retornou um long " + variavelLong);

		float variavelFloat = Float.parseFloat("100.123");
		System.out.println("Recebeu uma string e retornou um float " + variavelFloat);

		double variavelDouble = Double.parseDouble("123456.4321");
		System.out.println("Recebeu uma string e retornou um double " + variavelDouble);

		char variavelChar = Character.valueOf('c');
		System.out.println("Recebeu uma char e retornou um char (NEM PECISAVA) " + variavelChar);

		boolean vetorPossivilidadesBooleans[] = {
				// usei um vetor para exemplificar melhor
				Boolean.parseBoolean("true"), // true
				Boolean.parseBoolean("TRUE"), // true
				Boolean.parseBoolean("tRuE"), // true
				Boolean.parseBoolean("tru"), // false
				Boolean.parseBoolean("1"), // false
				Boolean.valueOf("TRUE"), // true
				Boolean.valueOf("true"), // true
				Boolean.TRUE // true
		};
		for (int logico = 0; logico < vetorPossivilidadesBooleans.length; logico++) {
			System.out.println(
					"CRecebeu uma string ou ENUM e retorna valores booleanos, ver no debug os motivos dos valores "
							+ vetorPossivilidadesBooleans[logico]);
		}
	}
}
