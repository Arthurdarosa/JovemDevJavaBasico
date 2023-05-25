import java.util.Iterator;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		int numeroPessoas = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de pessoas que deseja calcular o imc"));
		String nome;
		String sexo;
		double altura;
		double peso;
		double imc;
		for (int i = 0; i < numeroPessoas; i++) {
			nome = JOptionPane.showInputDialog("digite o nome da pessoa");
			sexo = JOptionPane.showInputDialog("digite o sexo da pessoa, M para masculino e F para feminino");
			altura = Double.parseDouble(JOptionPane.showInputDialog("digite a altura da pessoa em metros"));
			peso = Double.parseDouble(JOptionPane.showInputDialog("digite o peso da pessoa em kilos"));
			imc = peso/(Math.pow(altura, 2));
			if (sexo=="M") {
				if (imc<20.7) {
					System.out.println(nome);
					System.out.println("imc: "+imc);
					System.out.println("Abaixo do peso");
				}else if(imc>=20.7 && imc<=26.4){
					System.out.println(nome);
					System.out.println("imc: "+imc);
					System.out.println("Peso ideal");
				}else if(imc>=26.5 && imc<=27.8){
					System.out.println(nome);
					System.out.println("imc: "+imc);
					System.out.println("Pouco acima do peso");
				}else if(imc>=27.9 && imc<=31.1){
					System.out.println(nome);
					System.out.println("imc: "+imc);
					System.out.println("Acima do peso");
				}else {
					System.out.println(nome);
					System.out.println("imc: "+imc);
					System.out.println("Obesidade");
				}
					
			}else {
				if (imc<19.1) {
					System.out.println(nome);
					System.out.println("imc: "+imc);
					System.out.println("Abaixo do peso");
				}else if(imc>=19.1 && imc<=25.8){
					System.out.println(nome);
					System.out.println("imc: "+imc);
					System.out.println("Peso ideal");
				}else if(imc>=25.9 && imc<=27.3){
					System.out.println(nome);
					System.out.println("imc: "+imc);
					System.out.println("Pouco acima do peso");
				}else if(imc>=27.4 && imc<=32.3){
					System.out.println(nome);
					System.out.println("imc: "+imc);
					System.out.println("Acima do peso");
				}else {
					System.out.println(nome);
					System.out.println("imc: "+imc);
					System.out.println("Obesidade");
				}
				System.out.println("*-------------------------*");
			}
		}
	}

}
