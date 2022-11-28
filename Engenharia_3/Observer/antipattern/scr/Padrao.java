package antipattern;

public class Padrao implements YoutubeConta  {

	public void update(int state) {
		System.out.println("Triplo: " + Integer.toString(state));		
	}

}
