package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Notificados {
	List<Conta> contas = new ArrayList<>(); 
	private int state;
	
   public int getState() {
	      return state;
   }
	 
   public void setState(int state) {
      this.state = state;
   }
 
   public void add(Conta conta){
     contas.add(conta);		
   }
 
   public void notificarTodos(){
      for (Conta conta: contas) {
        conta.update(state);
      }
   } 
}
