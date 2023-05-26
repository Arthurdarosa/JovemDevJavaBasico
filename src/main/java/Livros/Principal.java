package Livros;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		List<Livros> livros = new ArrayList<Livros>();
		List<Autor> autores = new ArrayList<Autor>();
		int op = 0;
		do {
			op = Uteis.escolherMenu();
			switch (op) {
			case 1:
				Autor a = new Autor();
				a.cadastrarAutor();
				autores.add(a);
				break;
			case 2:
				Livros l = new Livros();
				l.cadastraLivro(autores);
				livros.add(l);
				break;
			case 3:
				String resultado = "";
				for (Livros t : livros) {
					resultado += t.toString();
				}
				JOptionPane.showMessageDialog(null, resultado);
				break;
			case 4:
//				Uteis.pesquisarAutor(autores);
				break;
			case 5:
				double valorMin = Double.parseDouble(JOptionPane.showInputDialog("digite o valor minimo"));
				double valorMax = Double.parseDouble(JOptionPane.showInputDialog("digite o valor maximo"));
				String ret = Uteis.pesquisarPorValor(livros, valorMin, valorMax);
				System.out.println(ret);
				break;
			case 6:
	
				break;
			case 7:
				String genero = JOptionPane.showInputDialog("digite o genero da pessoa, m para masculino e f para feminino");
				while (!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F")){
					if(!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F")) {
						System.out.println("digite M ou F para o sexo do autor");
					}
					genero = JOptionPane.showInputDialog("digite o sexo do autor, M para masculino e F para feminino");
				}
				String gener = Uteis.pesquisarPorSexo(livros, autores, genero);
				System.out.println(gener);
				
				
				break;
				
			}
		} while (op!=8);

	}

}
