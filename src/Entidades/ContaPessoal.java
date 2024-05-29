package Entidades;

public class ContaPessoal {

	private int conta;
	private String agencia;
	private String nomeDoCliente;
	private double saldo;
	


	public int getConta() {
		return conta;
	}
	public void setConta(int numero) {
		this.conta = numero;
	}

	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
		
	public ContaPessoal(int conta, String agencia, String nomeDoCliente, double saldo) {
		this.conta = conta;
		this.agencia = agencia;
		this.nomeDoCliente = nomeDoCliente;
		this.saldo = saldo;
		
	}

	
	public String toString() {
		return "Dados do cliente:"+"\n"
				+"Conta: "+getConta()+"\n"
				+"Agencia: "+getAgencia()+"\n"
				+"Nome do cliente: "+getNomeDoCliente()+"\n"
				+"Saldo: "+getSaldo()+".";
	}
	
	
	
}
