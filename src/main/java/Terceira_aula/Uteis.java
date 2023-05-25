package Terceira_aula;

import java.util.List;

import javax.swing.JOptionPane;

public class Uteis {
	List<Time> artilheiros;

	static int escolheOP() {
		String menu = "1 – Cadastrar time\r\n" 
				+ "2 – mostrar time com mais gols \r\n"
				+ "3 - mostrar o artilheiro do campeonato \r\n" 
				+ "4 - mostrar todos os jogadores de um time \r\n"
				+ "5 - para sair \r\n";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

	public static String getArtilheiroCampe(List<Time> artilheiros) {
		Jogador artilheiroCamp = new Jogador();
		for (Time artilheiro : artilheiros) {
			if (artilheiro.getArtilheiro().getGols() > artilheiroCamp.getGols()) {
				artilheiroCamp = artilheiro.getArtilheiro();
			}
		}

		return artilheiroCamp.toString();

	}

	public static Time escolheTime(List<Time> artilheiros) {
		String menu = "Escolha um time\n";
		int pos = 1;
		for (Time time : artilheiros) {
			menu += pos + " - " + time.getNomeTime() + "\n";
			pos++;
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return artilheiros.get(op - 1);

	}

	public static String listaJogadoresTime(List<Time> artilheiros) {
		Time t = escolheTime(artilheiros);
		return t.listaJogadores();
	}

	public static String timeMaisGols(List<Time> artilheiros) {
		Time timeComMaisGols = new Time();
		for (Time time : artilheiros) {
			if (time.getGols() > timeComMaisGols.getGols()) {
				timeComMaisGols = time;
			}
		}
		return timeComMaisGols.getNomeTime();
	}

}
