
import java.util.LinkedList;
import java.util.List;

public class Cartao {

	private double limite;
	private double saldo;
	private List<Compras> compras;
	
	public Cartao(double limite) {
		this.limite = limite;
		this.saldo = limite;
		this.compras = new LinkedList<>();
	}
	
	public double getlimite() {
		return limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public List<Compras> getLista(){
		return compras;
	}
	
	public boolean lancaCompra(Compras compra) {
		if(this.saldo > compra.getPreco()) {
			this.saldo -= compra.getPreco();
			this.compras.add(compra);
			return true;
		}
		
		return false;
	}
}
