package decorator;

public class Tijolos extends Decorator {


	public Tijolos(HomeRoom newRoom) {
		super(newRoom);
		
		System.out.println("Colocando tijolos na parede");
				
	}

	public String getDecoracao() {
		return HR.getDecoracao() + ", Parede de Tijolos";
		
	}
	
	public double getPreco() {
		return HR.getPreco() + 600.0;
	}
	
}
