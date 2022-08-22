package fundamentos;

public class ComposicaoObjetos {

	public static void main(String[] args) {
		
		//Serão utilizadas duas classes para demonstrar,
		//Conta e cliente....1 cliente pode ter uma conta ou mais.
		
		
		//Utilizando construtor vazio
		Conta c1 = new Conta();
		c1.setAgencia("002");
		c1.setSaldo(3000);
		c1.setNumeroConta("1050");
		
		//Utilizando construtor passando valores aos objetos
		Conta c2 = new Conta("001", 1000, "1630");
		
		//Fiz o cliente ter uma conta
		Cliente cl1 = new Cliente("Guina", c2);
		
		//Terão métodos de transferencia e saque na classe conta e serão testados aqui.
		
//		System.out.println(c1.getSaldo());
//		c1.depositar(500);
//		System.out.println(c1.getSaldo());
//		c1.sacar(200);
//		System.out.println(c1.getSaldo());
		
		System.out.println("=====================================");
		//System.out.println(c1.getSaldo());
		//System.out.println(c2.getSaldo());
		c1.transferir(c2, 1000);
		System.out.println("=================");
		//System.out.println(c1.getSaldo());
		//System.out.println(c2.getSaldo());
		c1.transferir(c2, 5000);
	}

}
