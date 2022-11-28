package mvc;

public class Controller implements controllerInterface{

	View view;
	Subject model;
	
	public Controller(Subject mo){
		this.model = mo;
		view = new View(model, this);
		view.createView();
		view.desabilitarBotaoCancelar();
		
	}
	
	public void registrar(){
		
		model.registerObserver(view);
		System.out.println("O relatorio com os valores atualizados foram registrados");
		view.desabilitarBotaoRegistrar();
		view.habilitarBotaoCancelar();
		
	}
	
	public void cancelar(){
		
		model.removeObserver(view);
		System.out.println("Assinatura cancelada");
		view.desabilitarBotaoCancelar();
		view.habilitarBotaoRegistrar();
		
	}
	
}