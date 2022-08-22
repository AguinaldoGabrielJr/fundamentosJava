package fundamentos;

public class Funcoes {

	// Servem para fazer rotinas etc, como o nome diz.
	// Existem com ou sem retorno etc.
	
	//Na classe testeFuncoesNumFinal temos o primeiro contato com referência de objetos,
	//Na linha 8 a referência e na linha 9 chamei o valor que foi setado no objeto.
	
	private String nome;
	private int num1;
	private int num2;
	private int numFinal;

	public int soma(int num, int num2) {

		this.numFinal = num + num2;
		return numFinal;
	}

	// Com retorno
	public String getNome() {
		return nome;
	}

	// Sem retorno e com parametros, seguem as mesmas regras dos construtores
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

}
