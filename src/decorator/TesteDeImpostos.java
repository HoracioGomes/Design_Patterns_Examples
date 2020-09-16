package decorator;

public class TesteDeImpostos {
public static void main(String[] args) {
	Imposto icms = new ICMS();
	Imposto iss = new ISS();
	
	Orcamento orcamento = new Orcamento(500);
	CalculadorDeImpostos calculador = new CalculadorDeImpostos();
	
	calculador.realizaCalculo(orcamento, icms);
	calculador.realizaCalculo(orcamento, iss);
}
}
