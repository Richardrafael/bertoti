package pattern;

public class Dobro extends Observer {
	public Dobro(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Dobro: " + Integer.toString(subject.getState() * 2));		
	}    	
}
