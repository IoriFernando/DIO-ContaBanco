package Aplicacao;

import java.util.Scanner;

import Entidades.ContaPessoal;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Cadastro de conta: \nDigite o numero da sua conta:");
		int conta = sc.nextInt();

		sc.nextLine();
		System.out.println("Digite o número da Agência !");
		String agencia = sc.nextLine();
		
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();	
		
		System.out.println("Imforme seu saldo:");
		double saldo = sc.nextDouble();
		
		
		ContaPessoal conta1 = new ContaPessoal(conta, agencia,nome, saldo);
				
		System.out.println("Olá, "+conta1.getNomeDoCliente()
					+ " obrigado por criar uma conta em nosso banco, sua agência é , "+ conta1.getAgencia()
					+ " conta "+ conta1.getConta() + " e seu saldo "+conta1.getSaldo() +" já está disponível para saque.");
	
		
		
		
		
		
		
		sc.close();
	}

}
