package site;

public class Usuario {
    private Acessar acessar;
    
   public void serAcessar(Acessar acessar){
    this.acessar = acessar;

   }

   public void realizarAcessar(){
    this.acessar.acessar();
   }



}
