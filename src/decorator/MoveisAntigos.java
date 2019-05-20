package decorator;

public class MoveisAntigos extends Decorator {


	public MoveisAntigos(HomeRoom newRoom) {
		super(newRoom);
		
		System.out.println("Colocando poltrona antiga");
		System.out.println("Coloando sofá largo antigo");
		System.out.println("Pintura antiga (EXTRA)");
		System.out.println("Colocando tapete vermelho (EXTRA)");
	
	}

	public String getDecoracao() {
		return HR.getDecoracao() + ", Moveis antigos";
		
	}
	
	public double getPreco() {
		return HR.getPreco() + 7000.0;
	}
	
}
