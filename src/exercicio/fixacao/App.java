
/*Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade),*/

package exercicio.fixacao;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("****DIGITE OS DADOS DO ITEM****");
		System.out.print("Nome:");
		
		String nome = sc.nextLine();
		
		System.out.print("Preco Unitario:");
		double precoUnitario = sc.nextDouble();
		System.out.print("Quantidade:");
		int quantidade = sc.nextInt();

		ItemVendido novoItem = new ItemVendido(nome, precoUnitario, quantidade);
		novoItem.geraPasta();
		novoItem.geraArquivo();
		novoItem.addItem(nome, precoUnitario, quantidade);
		novoItem.mostraArquivo();
		sc.close();
		
	}

}
