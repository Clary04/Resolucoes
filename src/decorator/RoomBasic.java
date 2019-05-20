package decorator;

public class RoomBasic implements HomeRoom{

	@Override
	public String getDecoracao() {
		return "Paredes lixadas";
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 40.0;
	}

	
}
