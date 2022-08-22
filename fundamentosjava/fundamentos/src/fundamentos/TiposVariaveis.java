package fundamentos;

public class TiposVariaveis {
	
//	Variáveis primitivas Java...
//	Variáveis númericas apenas setamos seguindo do número ex: Byte b1 = 5;
//	Char setamos com '', ex: char c1 = 'a';
//	String setamos com "", ex: String nome = "Guina";
	
	//Valor inteiro de 8 bits, -128 a 127.
	Byte by1;
	
	//Único caracter unicode de 16 bits.
	char c1;
	
	//Valor inteiro de 16 bits,  -23768 a 32767.
	Short s1;
	
	//Número inteiro de 16 bits, -2.147.483.648 a 2.147.483.647.
	int i1;
	
	//Número inteiro de 32 bits, -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.
	Long l1;
	
	//Números de 6 e 7 casas, com ponto flutuante de 32 bits. Não é utilizado em operações matemáticas.
	Float f1;
	
	//Número inteiro de 64 bits, até 15 casas decimais.
	Double d1;
	
	//Verdade ou falso, por pádrão inicia como false.
	Boolean bo1;
	
	//Variáveis constantes Java...
	
	static Byte by2; //Uma constante...
	final char c2 = 0; // O mesmo que acima basicamente, porém o valor deve ser setado...
	
	//Uma classe para juntar vários chars...
	
	//Ele é uma classe que concatena os chars passados.
	String nome;
	
}
