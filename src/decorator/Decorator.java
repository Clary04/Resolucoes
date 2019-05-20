package decorator;

abstract class Decorator implements HomeRoom {
	
	protected HomeRoom HR; 
	
	public Decorator(HomeRoom newRoom) {
	
		HR= newRoom; 
	}

	public String getDecoracao() {
		return HR.getDecoracao();
	}
	
	public double getPreco(){
		return HR.getPreco();
	}
}
