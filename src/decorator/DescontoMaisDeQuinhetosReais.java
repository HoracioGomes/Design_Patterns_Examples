package decorator;

public class DescontoMaisDeQuinhetosReais implements Desconto {
	private Desconto proximoDesconto;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return proximoDesconto.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
		// TODO Auto-generated method stub
		
	}
}
