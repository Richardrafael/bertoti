package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Livro> livros = new ArrayList<Livro>();
	private List<Cardeneta> cardenetas = new ArrayList<Cardeneta>();
	
	public void buy() {
		for(Livro can: livros)
		{
			can.buy();
		}
		for(Cardeneta cad: cardenetas)
		{
			cad.buy();
		}
		System.out.println("Compra realizada!");
		livros.clear();
		cardenetas.clear();
	}

	public void addLivro(Livro c){
		this.livro.add(c);
	}
	
	public void addCardeneta(Cad c){
		this.cardenetas.add(c);
	}
	
	public void removeLivro(Livro c){
		livros.remove(c);
	}
	
	public void removeCardeneta(Cardeneta c){
		cardenetas.remove(c);
	}
	
}