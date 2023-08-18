package MyHeroicTeddyUniverse.model;

public class SpecificTeddy {

	
	private String nomeTeddy;
	private int valor;
	private String aparencia;
	
	
	
	public SpecificTeddy(String nomeTeddy, int valor, String aparencia) {
		this.nomeTeddy = nomeTeddy;
		this.valor = valor;
		this.aparencia = aparencia;
	}



	public String getNomeTeddy() {
		return nomeTeddy;
	}



	public void setNomeTeddy(String nomeTeddy) {
		this.nomeTeddy = nomeTeddy;
	}



	public int getValor() {
		return valor;
	}



	public void setValor(int valor) {
		this.valor = valor;
	}



	public String getAparencia() {
		return aparencia;
	}



	public void setAparencia(String aparencia) {
		this.aparencia = aparencia;
	}
	
	
	public static void listarTodas() {

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do pedido:");
		System.out.println("***********************************************************");
		System.out.println("Nome do seu Super Herói: " + this.nomeTeddy);
		System.out.println("Escolha os detalhes do seu Super Heròi: " + this.aparencia);
		System.out.println("Valor dacompra: " + this.valor);

	}



	
}
