package pattern;

public class App {

	public static void main(String[] args) {
        BancoDados primeiroBanco = BancoDados.getInstance();
        
        /* AINDA A MESMA INST�NCIA DE bd */
        BancoDados novoBanco = BancoDados.getInstance();

	}

}
