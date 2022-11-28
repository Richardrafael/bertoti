package pattern;

public class BancoDados {

	private static BancoDados instance;

	private BancoDados() {
	}

	public static synchronized BancoDados getInstance() {
		if (instance == null)
			instance = new BancoDados();

		return instance;
	}
	
}