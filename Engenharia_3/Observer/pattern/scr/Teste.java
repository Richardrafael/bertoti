package pattern;

public class Teste {
	
	  public static void main(String args[]){
	      Subject subject = new Subject();
	 
	      new Padrao(subject);
	      new Dobro(subject);
	      new Triplo(subject);
	 
	      System.out.println("Estado mudado para: 10");	
	      subject.setState(10);
	      System.out.println("Estado mudado para: 33");	
	      subject.setState(33);
	      System.out.println("Estado mudado para: 102");	
	      subject.setState(102);
	  }
	  
}