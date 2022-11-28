package principal;

import java.util.ArrayList;
import java.util.List;

import modelos.Computador;
import modelos.Resultado;
import negocios.AlunoNegocio;
import negocios.ComputadorNegocio;
import negocios.ResultadoNegocio;

public class GeradorResultado {
	private AlunoNegocio alunoNegocio  = new AlunoNegocio();
	private ResultadoNegocio resultadoNegocio = new ResultadoNegocio();
	private ComputadorNegocio computadorNegocio = new ComputadorNegocio();
	
	public List<Resultado> gerarResultadoComputadorPorAluno(int id) {
		
		// Apenas exemplo, sem consulta real:
		ResultadoNegocio.consultarResultadoPorAluno(alunoNegocio.consultarAlunoPorId(id));
		List<Resultado> relatorioGeradaPoraluno = new ArrayList<>();
		
		return relatorioGeradaPoraluno;
	}
	
	public List<Computador> gerarResultadosComputadoresMaisAlunos(int id) {
		
		// Apenas exemplo, sem consulta real:
		ComputadorNegocio.consultarComputadorPorResultado(ResultadoNegocio.consultarResultadoPorAluno(alunoNegocio.consultarAlunoPorId(id)));
		List<Computador> resultadoGeradaPoraluno = new ArrayList<>();
		
		return resultadoGeradaPoraluno;
	}
}