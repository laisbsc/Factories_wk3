package cards;

public class Amex extends Card{

	public Amex(int number, String name, int cvv) {
		this.number = number;
		this.name = name;
		this.cvv = cvv;
		
	}
	
	// Specific implementation for Amex
	@Override
	public String toString() {
		return "Type: Amex, Number: " + getNumber() + ", Name: " + getName()+", CVV: "+ getCvv();
		
	}

}
