package iterator;

import java.util.ArrayList; 
import java.util.Iterator; 

public class Selecao {
	
	MusicaAnos80 Musicas80;
	MusicaAnos90 Musicas90;
	
	MusicaIterator iter80;
	MusicaIterator iter90; 
	
	public Selecao(MusicaIterator Musica80, MusicaIterator Musica90) {
		iter80=Musica80; 
		iter90=Musica90;
	}
	
	public void ListarMusicas(){
		Iterator Musicas80=iter80.createIterator();
		Iterator Musicas90=iter90.createIterator();
		
		System.out.println("Melhores musicas anos 80\n");
		printMusicas(Musicas80);
		System.out.println();
		System.out.println("Melhores musicas anos 90\n");
		printMusicas(Musicas90);
		
	}

	public void printMusicas(Iterator iterator) {
		 
		while(iterator.hasNext()) {
			InformacaoMusica InfoMusica = (InformacaoMusica) iterator.next();
		
		System.out.println(InfoMusica.getNome());
		System.out.println(InfoMusica.getBanda());
		System.out.println(InfoMusica.getAnolancamento());
		
		}
	}
}
