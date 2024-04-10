package Base;

public abstract class Card {
	private int id;
	private Symbol cardType;
	private Side side [];//0:front, 1:back
	
	public Card(int id, Symbol cardType, Side front, Side back) {
		this.id=id;
		this.cardType = cardType;
		side = new Side [2];
		side[0]=front;
		side[1]=back;
	}
}