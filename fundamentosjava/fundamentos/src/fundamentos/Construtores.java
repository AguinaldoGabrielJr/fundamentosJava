package fundamentos;

public class Construtores {

	// Métodos utilizados para construir da maneira que queremos o nosso objeto.
	// Por padrão se não criamos ele cria um vazio, como vai ser o primeiro exemplo.
	// E podem ser criados vários construtores, desde que não repitam certos
	// detalhes.
	// Alguns exemplos abaixo, OBS: deve ter o mesmo nome da classe.

	private String nome;
	private int idade;
	private String email;

	// Segue sempre o padrão de modificador de acesso(public).
	// Nome da classe.
	public Construtores() {

	}

	// E também parametros... os parametros, quantidades e tipos devem ser sempre
	// diferentes
	public Construtores(String nome, int idade, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}

	public Construtores(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
