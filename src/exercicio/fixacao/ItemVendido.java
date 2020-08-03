package exercicio.fixacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ItemVendido {
	private String nome;
	private double precoUnitario;
	private int quantidade;

	public ItemVendido() {

	}

	public ItemVendido(String nome, double precoUnitario, int quantidade) {

		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// ---------------------------------------------------------
	public void geraPasta() {
		String path = "C:\\\\Users\\\\Convidado\\\\eclipse-workspace\\\\CNAArquivos\\\\";
		boolean success = new File(path + "\\out").mkdir();
		System.out.println("Directory created successfully: " + success);
	}

	public void geraArquivo() {
		String path = "C:\\\\Users\\\\Convidado\\\\eclipse-workspace\\\\CNAArquivos\\\\\\out\\\\summary.csv";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addItem(String nome, double precoUnitario, int quantidade) {
		String path = "C:\\\\Users\\\\Convidado\\\\eclipse-workspace\\\\CNAArquivos\\\\\\out\\\\summary.csv";
		String[] lines = new String[] { nome + "," + String.valueOf((precoUnitario * quantidade)) };
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void mostraArquivo(){
		String path = "C:\\\\Users\\\\Convidado\\\\eclipse-workspace\\\\CNAArquivos\\\\\\out\\\\summary.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		String line = br.readLine();
		while (line != null) {
		System.out.println(line);
		line = br.readLine();
		}
		} catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
		}
	}
}
