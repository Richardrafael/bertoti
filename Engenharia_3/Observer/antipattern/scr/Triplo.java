package antipattern;

public class Triplo implements YoutubeConta {

	public void update(int state) {
		System.out.println("Triplo: " + Integer.toString(state * 3));		
	}
	
}
