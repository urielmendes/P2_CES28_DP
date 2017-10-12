package Q4.orig.c;

import java.util.Iterator;

public class RelatorioDespesas {
	
	private Calculadora calculadora;
	private SistemaOperacional so;
	
	public RelatorioDespesas(Calculadora calc, SistemaOperacional so){
		this.calculadora = calc;
		this.so = so;
	}
	
	public void ImprimirRelatorio(Iterator<Despesa> despesas) {
		float totalDespesa = calculadora.calculaDespesas(despesas);
		
		so.imprime(totalDespesa);
	}
	
}