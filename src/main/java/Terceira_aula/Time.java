package Terceira_aula;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Time {
	private String nomeTime;
	List<Jogador> jogadores = new ArrayList<Jogador>();

	void cadastroTime() {
		String menu = "digite o nome do time";
		nomeTime = JOptionPane.showInputDialog(menu);
	}

	public String listaJogadores() {
		String ret = "Jogadores do time: " + nomeTime + "\n";
		for (Jogador jogador : jogadores) {
			ret += jogador;
		}
		return ret;
	}

	public int getGols() {
		int gols = 0;
		for (Jogador jogador : jogadores) {
			gols += jogador.getGols();
		}
		return gols;
	}

	public Jogador getArtilheiro() {
		Jogador artilheiro = jogadores.get(0);
		for (Jogador jogador : jogadores) {
			if (jogador.getGols() > artilheiro.getGols()) {
				artilheiro = jogador;
			}
		}
		return artilheiro;
	}

	
}
