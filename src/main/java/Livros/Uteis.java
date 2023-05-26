package Livros;

import java.util.List;

import javax.swing.JOptionPane;

public class Uteis {
	
	public static int escolherMenu() {
			String menu = "1 - Cadastrar autor \r\n"
					+ "2 - cadastrar livro \r\n"
					+ "3 - listar todos os livros \r\n"
					+ "4 - pesquisar por autor \r\n"
					+ "5 - pesquisar por faixa de valor \\r\\n"
					+ "6 - listar livros feitos por crianças \r\n"
					+ "7 - listar livros por sexo, M masculino e F feminino \r\n"
					+ "8 - sair";
			return Integer.parseInt(JOptionPane.showInputDialog(menu));
		
	}
	
	public String listaLivros(List<Livros> livros) {
		String ret = "";
		for (Livros livro : livros) {
			ret += livro.toString();
		}
		return ret;
	}
	
	
	
//	public static pesquisarAutor(List<Autor> autor) {
//		Autor t = escolheAutor(autor);
//		return t.listaLivros(null);
//	}
	
	public static Autor escolheAutor(List<Autor> autores) {
		String menu = "Escolha um autor\n";
		int pos = 1;
		for (Autor autor : autores) {
			menu += pos + " - " + autor.getNome() + "\n";
			pos ++;
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return autores.get(op-1);
	}
	
	public static String pesquisarPorValor(List<Livros> livros, double valorMin, double valorMax) {
		String ret = "" ;
		for (Livros livro : livros) {
			if (valorMin<=livro.getPreco()&&valorMax>=livro.getPreco()) {
			ret += livro.toString();
			}
		}
		return ret;
	}
//	public static String pesquisarPorIdade(List<Livros> livros) {
//		String ret = "" ;
//		for (Livros livro : livros) {
//			if (livro.) {
//			ret += livro;
//			}
//		}
//		return ret;
//	}
//	
	public static  String pesquisarPorSexo(List<Livros> livros, List<Autor> autor, String genero) {
		boolean ajuda;
		String ret = "";
		for (Livros livros2 : livros) {
			for (Autor autor2 : autor) {
				if(autor2.getSexo().equalsIgnoreCase(genero)) {
					ajuda = true;
				}else {
				 ajuda = false;
				 break;
				}
				
			}
			if (ajuda=true) {
				ret += livros.toString();
			}
		}
		return ret;
	}

	
}
