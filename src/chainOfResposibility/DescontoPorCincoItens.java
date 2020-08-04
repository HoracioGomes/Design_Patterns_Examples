package chainOfResposibility;

public class DescontoPorCincoItens implements Desconto {
	private Desconto proximoDesconto;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
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
