import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o limite do seu cartão.\n");
		double limite = teclado.nextDouble();
		
		Cartao cartao = new Cartao(limite);
		
		int sair = 1;
		
		while(sair !=0) {
			System.out.println("Digite o nome do produto");
			String nome = teclado.next();
			System.out.println("Digite o valor do produto");
			double preco = teclado.nextDouble();
			System.out.println();
			
			Compras compra = new Compras(preco, nome);
			boolean compraRealizada = cartao.lancaCompra(compra);
			
			if(compraRealizada) {
				System.out.println("Compra realizada!");
				System.out.println();
				System.out.println("Digite 0 para sair e 1 para continuar");
				sair = teclado.nextInt();
			} else {
				System.out.println("Saldo insuficiente!");
			}
			
			if(sair == 0) {
				System.out.println("***********************************");
				System.out.println();
				
				System.out.println("COMPRAS REALIZADAS:");
				System.out.println();
				
				cartao.getLista().sort(Comparator.comparing(Compras::getPreco));
				
				for(Compras p : cartao.getLista()) {
					System.out.println(p);
				}
				System.out.println();
				
				System.out.println("Saldo atual: " + cartao.getSaldo());
				
				System.out.println();
				System.out.println("***********************************");
			}
			
		}
		
		teclado.close();
	}

}
