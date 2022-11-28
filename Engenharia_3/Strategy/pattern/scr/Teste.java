package pattern;

public class Teste {
	
	public static void main(String[] args) {
		
			Equipamento espada = new Equipamento();
			espada.setEquipar(new EquiparUmaMao());
			espada.colocarEquipamento();
			
			System.out.println("--------------------------------");
			
			Equipamento escudo = new Equipamento();
			escudo.setEquipar(new EquiparUmaMao());
			escudo.colocarEquipamento();
			
			System.out.println("--------------------------------");
			
			Equipamento machado = new Equipamento();
			machado.setEquipar(new EquiparDuasMaos());
			machado.colocarEquipamento();
			
			System.out.println("--------------------------------");
			
			Equipamento maca = new Equipamento();
			maca.setEquipar(new EquiparDuasMaos());
			maca.colocarEquipamento();
			
			System.out.println("--------------------------------");
			
			Equipamento armadura = new Equipamento();
			armadura.setEquipar(new EquiparCorpo());
			armadura.colocarEquipamento();
			
			System.out.println("--------------------------------");
				
		}
}
