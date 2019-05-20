package decorator;

public class Rustico extends Decorator{

	public Rustico(HomeRoom newRoom) {
		super(newRoom);
		
		System.out.println("Colocando madeira na parede");
		System.out.println("Colocando piso de madeira");
		
	}

	public String getDecoracao() {
		return HR.getDecoracao() + ", Sala rústica";
		
	}
	
	public double getPreco() {
		return HR.getPreco() + 5000.0;
	}
	
}
