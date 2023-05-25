package Segunda_aula.exercicio_carro;

import javax.swing.JOptionPane;

public class Util {
	EnumCor escolheCor() {
		String menu = "escolha uma cor \n";
		for (EnumCor cor: EnumCor.values()) {
			menu += cor.codigo+" - "+ cor.descricao+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
	}
}
