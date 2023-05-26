package Livros;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;

@Getter

public class Livros {
	private String titulo;
	private double preco;
	
	private List<Autor> autores = new ArrayList<Autor>();

	
	public boolean somenteMulher(List<Autor> autores) {
		for (Autor autor : autores) {
			if(autor.getSexo()!="M") {
				return false;
			}
		}
		
		 return true;
	}
	
	public boolean somenteHomem(List<Autor> autores) {
		for (Autor autor : autores) {
			if(autor.getSexo()!="F") {
				return false;
			}
		}
		
		 return true;
	}
	@Override
	public String toString() {
		
		return titulo+" - R$"+preco+" - "+autores.toString();
	}
	public void cadastraLivro(List<Autor> autores) {
		titulo = JOptionPane.showInputDialog("Nome do livro");
		titulo = titulo.toLowerCase();
		preco = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do livro"));
		while(preco<1) {
			preco = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do livro (mais que 0) "));
		}
		String op = "";
		int cont = 1;
		do {
			Autor j = new Autor();
			j.escolheAutor(autores);
			
			op = JOptionPane.showInputDialog("Deseja cadastrar mais autor? (S/N)");
			cont++;
		}while(op.equalsIgnoreCase("S") && cont<=4);
	}
	
}
