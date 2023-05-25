package Segunda_aula.exercicio_carro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro {
	EnumCor cores;
	String marcas;
	int ano;
		
	void cadastrar() {
		marcas = JOptionPane.showInputDialog("marca");
		ano = Integer.parseInt(JOptionPane.showInputDialog("ano"));
	}
	
}
