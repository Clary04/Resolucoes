package decorator;

public class Moderno extends Decorator {

	public Moderno(HomeRoom newRoom) {
		super(newRoom);
		
		System.out.println("Colocando piso liso bege");
		System.out.println("Pintando parede de cinza");
		System.out.println("Colocando painel de ripas");
		
	}

	public String getDecoracao() {
		return HR.getDecoracao() + ", Sala moderna";
		
	}
	
	public double getPreco() {
		return HR.getPreco() + 5599.9;
	}
	
	
}
