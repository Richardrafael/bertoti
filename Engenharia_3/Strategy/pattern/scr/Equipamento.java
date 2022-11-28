package pattern;

public class Equipamento {
	
	private Equipar equipar;

	public void setEquipar(Equipar equipar) {
		this.equipar = equipar;
	}
	
	public void colocarEquipamento() {
		this.equipar.colocarEquip();
	}
	
}
