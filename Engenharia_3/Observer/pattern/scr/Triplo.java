package pattern;

public class Triplo extends Observer {
	public Triplo(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Triplo: " + Integer.toString(subject.getState() * 3));		
	}    	
}