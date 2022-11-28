package facade;

import java.util.ArrayList;
import java.util.List;

import modelos.Computador;
import modelos.Resultado;
import negocios.AlunoNegocio;
import negocios.ComputadorNegocio;
import negocios.ResultadoNegocio;

public class Facade {
	private AlunoNegocio alunoNegocio  = new AlunoNegocio();
	private ResultadoNegocio resultadoNegocio = new ResultadoNegocio();
	private ComputadorNegocio computadorNegocio = new ComputadorNegocio();
	
	public List<Resultado> gerarRelatorioResultadosPorAluno(int id) {
		
		// Apenas exemplo, sem consulta real:
		resultadoNegocio.consultarResultadosPorAluno(alunoNegocio.consultarAlunoPorId(id));
		List<Resultado> relatorioResultadosGeradaPoraluno = new ArrayList<>();
		
		return relatorioResultadosGeradaPoraluno;
	}
	
	public List<Computador> gerarRelatorioComputadoresMaisVendidos(int id) {
		
		// Apenas exemplo, sem consulta real:
		computadorNegocio.consultarComputadorPorResultado(resultadoNegocio.consultarResultadoPorAluno(alunoNegocio.consultarAlunoPorId(id)));
		List<Computador> relatorioResultadosGeradaPoraluno = new ArrayList<>();
		
		return relatorioResultadosGeradaPoraluno;
	}
}