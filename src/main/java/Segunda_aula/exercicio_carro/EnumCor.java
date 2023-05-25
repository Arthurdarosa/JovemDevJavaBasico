package Segunda_aula.exercicio_carro;

public enum EnumCor {
	BRANCO( "branco", 1),
	PRETO( "preto", 2),
	AZUL( "azul", 3),
	VERMELHO( "vermelho", 4),
	
	public String descricao;
	public int codigo;
	
	private EnumCor(String descricao, int codigo) {
		this.descricao = descricao;
		this.codigo = codigo;
	}
}
