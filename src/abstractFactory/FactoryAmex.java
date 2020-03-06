package abstractFactory;

import cards.Amex;
import cards.Card;

public abstract class FactoryAmex extends AbstractFactory {
	private int number;
	private String name;
	private int cvv;
	
	public FactoryAmex(int number, String name, int cvv) {
		this.number = number;
		this.name = name;
		this.cvv = cvv;	
	}

	@Override
	public Card createCard() {
		// TODO Auto-generated method stub
		return new Amex(number, name, cvv);
	}
}
