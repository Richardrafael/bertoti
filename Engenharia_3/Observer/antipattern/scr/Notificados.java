package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Notificados {
	List<YoutubeConta> YoutubeContas = new ArrayList<>(); 
	private int state;
	
   public int getState() {
	      return state;
   }
	 
   public void setState(int state) {
      this.state = state;
   }
 
   public void add(YoutubeConta youtubeConta){
      youtubeConta.add(youtubeConta);		
   }
 
   public void notificarTodos(){
      for (YoutubeConta youtubeConta: youtubeContas) {
         youtubeConta.update(state);
      }
   } 
}
