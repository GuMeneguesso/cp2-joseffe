package ex36;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		produto[] listaProdutos = new produto[5];
		int id;
		String nome;
		double preço;
		int quantidade;
		Categoria cat;
		char possuiCategoria;
		
		for(int i=0; i<5; i++) {
			
			produto c = new produto();
			
			System.out.printf("\nDigite o id do produto: ");
			id = ler.nextInt();
				
			System.out.printf("Digite o nome do produto: ");
			nome = ler.next();
				
			System.out.printf("Digite o preço do produto: ");
			preço = ler.nextDouble();
				
			System.out.printf("Digite a quantidade do produto: ");
			quantidade = ler.nextInt();
			
			System.out.printf("Possui categoria? (S/N)");
			possuiCategoria = ler.next().charAt(0);
			
			if (possuiCategoria == 's') {
				Categoria ct = new Categoria();
				
				System.out.printf("\nDigite o id do produto: ");
				ct.id = ler.nextInt();
				
				System.out.printf("Digite o nome do produto: ");
				ct.nome = ler.next();
				
				cat = ct;
			}
			
			else {
				cat = null;
			}
			
			
			
			c.setId(id);
			c.setNome(nome);
			c.setPreço(preço);
			c.setQuantidade(quantidade);
			c.setCategoria(cat);
			
			
			listaProdutos[i] = c;
			
		}
			
		for(int i=0; i<5; i++) {
			System.out.printf("\n %s \n", listaProdutos[i].exibirProdutos());
			
			
			}
		}

	}