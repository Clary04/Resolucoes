package decorator;

public class SalaDecorada {

	public static void main(String[] args) {
		
		HomeRoom Room = new ParedeAmarela(new Tijolos(new MoveisModernos(new RoomBasic())));
	
		System.out.println("Resultado final: "+Room.getDecoracao());
		System.out.println("Valor em R$: "+Room.getPreco());
	}

}
