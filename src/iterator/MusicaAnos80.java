package iterator;

import java.util.ArrayList; 
import java.util.Iterator;  


public class MusicaAnos80 implements MusicaIterator {
	
	ArrayList<InformacaoMusica> Melhores;
	
	public MusicaAnos80(){ 
		Melhores = new ArrayList<InformacaoMusica>();
		
		adicionarMusica("Roam", "B52s", 1989);
		adicionarMusica("Cruel Summer", "Bananarama", 1984);
		adicionarMusica("Head over Heels", "Tears for Fears", 1985);
	}

	public void adicionarMusica(String nome, String banda, int anolancamento) {
		InformacaoMusica InfoMusica= new InformacaoMusica(nome, banda, anolancamento);
		
		Melhores.add(InfoMusica);
		
	}
	
	/*
	public ArrayList<InformacaoMusica> getMelhores(){
		return Melhores;
	}
	*/
	
	@Override
	public Iterator createIterator() {
		
		return Melhores.iterator();
	}
	
}
