package pattern;

public class Teste {
	
	public static void main(String[] args) {
		
			Compra arroz = new Compra();
			arroz.setComprar(new ComprarUm());
			arroz.colocarCompra();
			
			System.out.println("--------------------------------");
			
			Compra feijao = new Compra();
			feijao.setComprar(new ComprarUm());
			feijao.colocarCompra();
			
			System.out.println("--------------------------------");
			
			Compra maca = new Compra();
			maca.setComprar(new ComprarDuas());
			maca.colocarCompra();
			
			System.out.println("--------------------------------");
			
			Compra uva = new Compra();
			uva.setComprar(new Comprartres());
			uva.colocarCompra();
			
			System.out.println("--------------------------------");
				
		}
}
