package decorator;

public class ParedeAmarela extends Decorator {


	public ParedeAmarela(HomeRoom newRoom) {
		super(newRoom);
		
		System.out.println("Pintando a parede de amarelo");
		
	}

	public String getDecoracao() {
		return HR.getDecoracao() + ", Parede amarela";
		
	}
	
	public double getPreco() {
		return HR.getPreco() + 60.0;
	}
	
}
