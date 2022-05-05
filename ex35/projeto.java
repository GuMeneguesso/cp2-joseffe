package ex35;

import java.util.Scanner;

public class projeto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		cliente[] listaCliente = new cliente[5];
		char possuiContaBancaria;
		int id;
		String nome;
		int idade;
		String email;
		ContaBancaria conta;
		char atualizaEmail;
		
		for(int i=0; i<5; i++) {
			
			cliente c = new cliente();
			
			System.out.printf("\nDigite o id do cliente: ");
			id = ler.nextInt();
				
			System.out.printf("Digite o nome do cliente: ");
			nome = ler.next();
				
			System.out.printf("Digite a idade do cliente: ");
			idade = ler.nextInt();
				
			System.out.printf("Digite o email do cliente: ");
			email = ler.next();
				
			System.out.printf("Possui conta bancária? (S/N)");
			possuiContaBancaria = ler.next().charAt(0);
			
			if (possuiContaBancaria == 's') {
				ContaBancaria ct = new ContaBancaria();
				
				System.out.printf("\nDigite a agencia da conta: ");
				ct.agencia = ler.next();
				
				System.out.printf("Digite o número da conta: ");
				ct.numero = ler.next();
				
				System.out.printf("Digite o saldo da conta: ");
				ct.saldo = ler.nextDouble();
				
				conta = ct;
			}
			else {
				conta = null;
				}
			
			c.setId(id);
			c.setNome(nome);
			c.setIdade(idade);
			c.setEmail(email);
			c.setContaBancaria(conta);
			
			listaCliente[i] = c;
			
		}
			
		for(int i=0; i<5; i++) {
			System.out.printf("\n %s", listaCliente[i].exibirNomeIdade());
			System.out.printf("\n %s \n", listaCliente[i].exibirDadosConta());
			
			}
		}

	}
	

