package Q4.orig.c;

public class SistemaOperacional {
	
	private Impressora impressora;
	
	public SistemaOperacional(Impressora impressora){
		this.impressora = impressora;
		this.checaImpressora();
	}
	
	public void imprime(float totalDespesa) {
		
		String conteudo = "Relatorio de Despesas";
		conteudo+=("\n Total das despesas:" + totalDespesa);
		impressora.Imprimir(conteudo);
	}
	
	public void checaImpressora(){
		if(impressora.getClass() == ImpressoraLaser.class){
			//Faz alguma coisa
		}
		else if(impressora.getClass() == ImpressoraJato.class){
			//Faz outra coisa
		}
		else{
			//Faz outra coisa
		}		
	}
}
