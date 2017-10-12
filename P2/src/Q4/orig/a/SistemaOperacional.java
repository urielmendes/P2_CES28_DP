package Q4.orig.a;

public class SistemaOperacional {
	
	private Impressora impressora;
	
	public SistemaOperacional(Impressora impressora){
		this.impressora = impressora;
	}
	
	public void imprime(float totalDespesa) {
		String conteudo = "Relatório de Despesas";
		conteudo+=("\n Total das despesas:" + totalDespesa);
		impressora.Imprimir(conteudo);
	}
	
}
