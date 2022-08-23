package site;

public class Teste {

    public static void main(String[] args) {
        Usuario professor = new Usuario ();
        Usuario aluno = new Usuario();
        aluno.setAcessar(new Acesso());
        aluno.realizarAcessar();



System.out.println("--------------------------------");

professor.setAcessar(new Acessar());
professor.realizarAcessar();


    }

    
}
