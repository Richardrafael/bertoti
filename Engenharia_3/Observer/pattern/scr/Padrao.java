package pattern;

public class Padrao extends Observer {
	public Padrao (Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Padrao: " + Integer.toString(subject.getState()));		
	}    	
}