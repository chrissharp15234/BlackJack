package cardGameLibrary;

public class Player{
	
	public Hand hand = new Hand();
	private boolean isDealer;

	public Player(boolean isDealer) {
		this.isDealer = isDealer;
	}
	
	public boolean isDealer() {
		return isDealer;
	}
	
}