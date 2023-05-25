package Terceira_aula;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Jogador {
	private String nome;
	private int numeroCamisa;
	private int gols;
	
	public void cadastrarJogador() {
		nome = JOptionPane.showInputDialog("digite o nome do atleta");
		numeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("digite o numero da camisa"));
		gols = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de gols"));
	}
	
	static int escolheOP() {
		String opcao = "1 - para cadastrar jogador"
			+ "2 - para sair";
		return Integer.parseInt(JOptionPane.showInputDialog(opcao));
	}
	
	
	@Override
	public String toString() {
		return "jogador: " + nome + "\n" 
				+ "numero da camisa : " + numeroCamisa + "\n" 
				+ "gols: " + gols + "\n" 
				+ "__________\n";
		
	}
}
