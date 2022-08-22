package fundamentos;

public class Conta {

	private String numeroConta;
	private float saldo;
	private String agencia;

	public Conta() {

	}

	public Conta(String numeroConta, float saldo, String agencia) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	public void sacar(float valor) {
		System.out.println("Saldo anterior: " + this.saldo);
		if (this.saldo >= valor) {
			
			this.saldo = this.saldo - valor;
			System.out.println("Saldo atual: " + this.saldo);
			System.out.println("Transferência concluida");
		}else {
			System.out.println("Saldo atual: " + this.saldo);
			System.out.println("Cliente não tem saldo suficiente");
		}
	}

	public void transferir(Conta contaDestino, float valor) {
		sacar(valor);
		contaDestino.depositar(valor);

	}
}
