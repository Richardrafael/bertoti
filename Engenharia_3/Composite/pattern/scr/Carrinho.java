package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Caderneta> caderneta = new ArrayList<Caderneta>();
	private List<Livro> livros = new ArrayList<Livro
	public void buy() {
		for(Caderneta can: caderneta)
		{
			can.buy();
		}
		for(Livro cad: livros)
		{
			cad.buy();
		}
		System.out.println("Compra realizada!");
		livros.clear();
		caderneta.clear();
	}

	public void addLivros(Livro c){
		this.livros.add(c);
	}
	
	public void addCaderneta(Caderneta c){
		this.caderneta.add(c);
	}
	
	public void removeLivro(Livro c){
		livros.remove(c);
	}
	
	public void removeCaderneta(Caderneta c){
		caderneta.remove(c);
	}
	
}