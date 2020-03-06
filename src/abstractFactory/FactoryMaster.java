package abstractFactory;

import cards.*;

public class FactoryMaster extends AbstractFactory {
	private int number;
	private String name;
	private int cvv;
	
	public FactoryMaster(int number, String name, int cvv) {
		this.number = number;
		this.name = name;
		this.cvv = cvv;	
	}

	@Override
	public Card createCard() {
		return new Mastercard(number, name, cvv);
	}


}
