package fundamentos;

public class MetodosAcessores {

	private String nome;

	//Servem para acessar atributos privados.
	
	//get tem a função de trazer a informação contida no atributo.
	public String getNome() {
		return nome;
	}

	//set tem a função de setar valor no atributo. 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
