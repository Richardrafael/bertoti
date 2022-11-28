package mvc;

import java.util.*;

public class ReviewSystem {

	public static void main(String[] args) {
		final Model model = new Model();
		Controller controller = new Controller(model);
		
		
		final Timer timer = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setRelatorios("100");
	        }
	      }, 5000);
	      
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setRelatorios("300");
	        }
	      }, 10000);
	      
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setRelatorios("700");
	        }
	      }, 30000);
		
	}
	  
}