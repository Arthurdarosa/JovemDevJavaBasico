package Livros;

import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;

@Getter

public class Autor {
	private String sexo;
	private String nome;
	private Double idade;
	
	boolean isSexo(String genero) {
		return sexo == genero;
	}
	
	public void cadastrarAutor() {
		nome = JOptionPane.showInputDialog("digite o nome do autor");
		while (nome.isEmpty()||!nome.contains(" ")) {
			if(nome.isEmpty()||!nome.contains(" ")) {
				System.out.println("precida digitar nome e sobrenome");
			}
			nome = JOptionPane.showInputDialog("digite o nome e sobrenome do autor do autor");
		}
		
		idade = Double.parseDouble(JOptionPane.showInputDialog("digite a idade do autor"));
		while (idade<0) {
			if(idade<0) {
				System.out.println("a idade não pode ser negativa");
			}
			idade = Double.parseDouble(JOptionPane.showInputDialog("digite a idade do autor"));
		}
		sexo = JOptionPane.showInputDialog("digite o sexo do autor, M para masculino e F para feminino");
		while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")){
			if(!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
				System.out.println("digite M ou F para o sexo do autor");
			}
			sexo = JOptionPane.showInputDialog("digite o sexo do autor, M para masculino e F para feminino");
		}
		
	}
	
	public Autor escolheAutor(List<Autor> autores) {
		String menu = "Escolha um autor\n";
		int pos = 1;
		for (Autor autor : autores) {
			menu += pos + " - " + autor.getNome() + "\n";
			pos ++;
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return autores.get(op-1);
	}
	
	public String listaLivros(List<Livros> livros) {
		String ret = "";
		for (Livros livro : livros) {
			ret += livro;
		}
		return ret;
	}
	
	@Override
	public String toString() {
		
		return nome+" - "+sexo+" - "+idade;
	}
	
}
