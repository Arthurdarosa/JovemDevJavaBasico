package Terceira_aula;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lombok.ToString;

public class Main {

	public static void main(String[] args) {
		List<Time> lista = new ArrayList<Time>();
		List<Jogador> jogador = new ArrayList<Jogador>();
		int op = 0;
		do {
			op = Uteis.escolheOP();
			switch (op) {
			case 1:
				Time c = new Time();
				c.cadastroTime();
				lista.add(c);
				op = Jogador.escolheOP();
				do {
					Jogador j = new Jogador();
					j.cadastrarJogador();
					jogador.add(j);
					op = Jogador.escolheOP();
				} while (op!=2);
				op = Uteis.escolheOP();
				break;
			case 2:
				Uteis.timeMaisGols(lista);
				break;
			case 3:
				Uteis.getArtilheiroCampe(lista);
				break;
			case 4:
				Uteis.listaJogadoresTime(lista);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "By");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}while(op != 5);
	}

}
