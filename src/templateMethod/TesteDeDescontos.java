package templateMethod;

public class TesteDeDescontos {
public static void main(String[] args) {
	CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
	Orcamento orcamento = new Orcamento(600);
	
	orcamento.adicionaItem(new Item("Barbeador", 100));
	orcamento.adicionaItem(new Item("Bermuda", 40));
	orcamento.adicionaItem(new Item("Cadeira", 500));
	
	double descontoFinal = calculadora.calcula(orcamento);
	
	System.out.println("Desconto final: "+descontoFinal);
}
}
