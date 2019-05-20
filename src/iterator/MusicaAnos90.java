package iterator;

import java.util.Arrays; 
import java.util.Iterator;  

public class MusicaAnos90 implements MusicaIterator{
	
	InformacaoMusica[] Melhores;
	
	int contador = 0;
	
	public MusicaAnos90(){ 
		Melhores = new InformacaoMusica[3];
		
		adicionarMusica("Losing My Religion", "REM", 1991);
		adicionarMusica("Creep", "Radiohead", 1993);
		adicionarMusica("Walk on the Ocean", "Toad the Wet Sprocket ", 1991);
	}

	public void adicionarMusica(String nome, String banda, int anolancamento) {
		InformacaoMusica InfoMusica = new InformacaoMusica(nome, banda, anolancamento);
		
		Melhores[contador] = InfoMusica;
		
		contador++;
		
	}
	/*
	public InformacaoMusica[] getMelhores(){
		return Melhores;
	}
	*/

	@Override
	public Iterator createIterator() {
		
		return Arrays.asList(Melhores).iterator();
	}
	
	
}

