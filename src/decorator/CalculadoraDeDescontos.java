package decorator;

public class CalculadoraDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		
	Desconto d1 = new DescontoPorCincoItens();
    Desconto d2 = new DescontoMaisDeQuinhetosReais();
    Desconto d3 = new SemDesconto();

    d1.setProximo(d2);
    d2.setProximo(d3);
    
    return d1.desconta(orcamento);
    
	}
    

}
