package iterator;

public class Radio {

	public static void main(String[] args) {
		MusicaAnos80 Musica80 = new MusicaAnos80();
		MusicaAnos90 Musica90 = new MusicaAnos90(); 
		
		Selecao selecao = new Selecao(Musica80, Musica90);
		
		selecao.ListarMusicas();
		
	}
}
