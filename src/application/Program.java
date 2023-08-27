package application;

import java.util.Scanner;

import model.ContaTerminal;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com as informações da conta:");
		System.out.print("Informe o número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Informe o número da agencia: ");
		String numeroAgencia = sc.next();
		System.out.print("Informe o nome do cliente: ");
		sc.nextLine();
		String nomeCliente = sc.nextLine();
		System.out.print("Informe o saldo da conta: ");
		double saldoConta = sc.nextDouble();
		
		ContaTerminal conta = new ContaTerminal(numeroConta, numeroAgencia, nomeCliente, saldoConta);
		
		System.out.println("Olá "+ conta.getNomeCliente() +", obrigado por criar uma conta em nosso banco, sua agência é "+ conta.getAgencia() +",\n conta " + conta.getNumero() +" e seu saldo "+ conta.getSaldo() +" já está disponível para saque.");
		
		
		sc.close();
	}
}
