import java.util.*;


// Classe para representar um carro
class Carro {
    private String marca;
    private int ano;
    private Cor cor;
    
    public Carro(String marca, int ano, Cor cor) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getAno() {
        return ano;
    }
    
    public Cor getCor() {
        return cor;
    }
}
