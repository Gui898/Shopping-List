
public class Compras {

	private double preco;
	private String nome;
	
	public Compras(double preco, String nome) {
		this.preco = preco;
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Produto: " + this.nome + " - Preço: R$" + this.preco;
	}
	
}
