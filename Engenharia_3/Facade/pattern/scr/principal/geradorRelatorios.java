package principal;

import java.util.List;

import facade.Facade;
import modelos.Computador;
import modelos.Resultado;

public class GeradorRelatorio {
	private Facade facade = new Facade();
	
	public List<Resultado> gerarRelatorioResultadosPorAluno(int id) {
		
		// diminui��o do acoplamento e no aumento da coes�o
		return facade.gerarRelatorioResultadosPorAluno(id);
	}
	
	public List<Computador> gerarRelatorioComputadoresMaisutilizados(int id) {

		// diminui��o do acoplamento e no aumento da coes�o
		return facade.gerarRelatorioComputadoresMaisUtilizados(id);
	}
}