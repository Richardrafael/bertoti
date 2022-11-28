package principal;

import java.util.List;

import facade.Facade;
import modelos.Produto;
import modelos.Venda;

public class GeradorRelatorio {
	private Facade facade = new Facade();
	
	public List<Venda> gerarRelatorioVendasPorCliente(int id) {
		
		// diminui��o do acoplamento e no aumento da coes�o
		return facade.gerarRelatorioVendasPorCliente(id);
	}
	
	public List<Produto> gerarRelatorioProdutosMaisVendidos(int id) {

		// diminui��o do acoplamento e no aumento da coes�o
		return facade.gerarRelatorioProdutosMaisVendidos(id);
	}
}