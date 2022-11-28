package antipattern;

public class Teste {

	public static void main(String args[]){
		Notificados notificados = new Notificados();
		
	    YoutubeConta padrao = new Padrao();
	    notificados.add(padrao);
	    
	    YoutubeConta dobro = new Dobro();
	    notificados.add(dobro);
	    
	    YoutubeConta triplo = new Triplo();
	    notificados.add(triplo);

	    notificados.setState(10);
	    System.out.println("Estado mudado para: 10");	
	    notificados.notificarTodos();
	    
	    notificados.setState(33);
	    System.out.println("Estado mudado para:: 33");	
	    notificados.notificarTodos();
	    
	    notificados.setState(102);
	    System.out.println("Estado mudado para: 102");	
	    notificados.notificarTodos();
	}
	
}
