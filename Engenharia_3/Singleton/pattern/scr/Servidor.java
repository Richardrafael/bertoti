package pattern;

public class Servidor {

	private static Servidor instance;

	private Servidor() {
	}

	public static synchronized Servidor getInstance() {
		if (instance == null)
			instance = new Servidor();

		return instance;
	}
	
}