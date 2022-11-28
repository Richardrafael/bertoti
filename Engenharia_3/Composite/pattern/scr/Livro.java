package pattern;

public class Livro implements Produto {
	@Override
	public void buy() {
		System.out.println("Comprando livro...");
	}
}