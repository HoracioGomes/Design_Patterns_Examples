package templateMethod;

public interface Desconto {

		double desconta(Orcamento orcamento);
		void setProximo(Desconto proximoDesconto);
}
