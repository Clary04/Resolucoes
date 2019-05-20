package iterator;

public class InformacaoMusica {

	String nome, banda;
	int anolancamento;
	
	
	public InformacaoMusica(String nome, String banda, int anolancamento) {
		this.nome=nome;
		this.banda=banda;
		this.anolancamento=anolancamento; 
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getBanda() {
		return banda;
	}
	
	public int getAnolancamento() {
		return anolancamento;
	}
	
	
	
	
	
}
