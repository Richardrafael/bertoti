package antipattern;

public class Dobro implements YoutubeConta  {

	public void update(int state) {
		System.out.println("Dobro: " + Integer.toString(state * 2));		
	}
	
}
