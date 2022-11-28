package antipattern;

public class Dobro implements Conta  {

	public void update(int state) {
		System.out.println("Dobro: " + Integer.toString(state * 2));		
	}
	
}
