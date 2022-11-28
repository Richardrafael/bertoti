package pattern;

public class App {

	public static void main(String[] args) {
        Servidor primeiroServico = Servidor.getInstance();
        
        /* AINDA A MESMA INST�NCIA DE Servidor */
        Servidor novoServico = Servidor.getInstance();

	}

}
