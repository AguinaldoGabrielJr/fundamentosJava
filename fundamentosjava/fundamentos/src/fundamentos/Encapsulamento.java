package fundamentos;

public class Encapsulamento {

	//Serve como controlador de acesso aos atributos e métodos.
	//Como padrão se não colocarmos nada ele seta como public por trás dos panos
	
	//Acessiveis a qualquer função
	public String nome;
	
	//Acesso somento a classe, utilizamos métodos acessores para acesso e não o próprio atributo.
	private Long num;
	
	//Visível para todas as classes e subclasses que pertencem ao mesmo pacote ou namespace.
	protected char endereco;
}
