package antipattern;

public class Teste {

	public static void main(String[] args) {
		
		Equipamento espada = new Espada();
		espada.equipar();
		System.out.println("--------------------------------");
		
		Equipamento escudo = new Escudo();
		escudo.equipar();
		
		System.out.println("--------------------------------");
		
		Equipamento machado = new Machado();
		machado.equipar();
		
		System.out.println("--------------------------------");
		
		Equipamento maca = new Maca();
		maca.equipar();
		
		System.out.println("--------------------------------");
		
		Equipamento armadura = new Armadura();
		armadura.equipar();
		
		System.out.println("--------------------------------");
			
	}
	
}
