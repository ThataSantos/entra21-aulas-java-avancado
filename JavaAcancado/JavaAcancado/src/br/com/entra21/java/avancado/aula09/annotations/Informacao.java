package br.com.entra21.java.avancado.aula09.annotations;

/*
* Anota��o usada para organiza��o do projeto
*/
public @interface Informacao {
	
	public enum Informacoes{
		TODO, DO, DOING, DONE
	};
	
	Informacoes informacoes() default Informacoes.DONE;

	String value();
}
