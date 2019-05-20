package decorator;

public class MoveisModernos extends Decorator {


	public MoveisModernos(HomeRoom newRoom) {
		super(newRoom);
		
		System.out.println("Colocando dois sofás modernos");
		System.out.println("Estante moderna");
		System.out.println("Tapete cinza (EXTRA)");
		System.out.println("Quadro da banda The 1975 (EXTRA)");
		
	}

	public String getDecoracao() {
		return HR.getDecoracao() + ", Moveis modernos";
		
	}
	
	public double getPreco() {
		return HR.getPreco() + 8899.9;
	}
}

