/**
 * Creates instances of the requested classes to be used by the client
 */

import cards.*;

/**
 * @author laiscarvalho
 * @date 06/03/2020
 */
public class Factory {
	
	public static Card getCard(int number, String name, int cvv, String cardType) {
		if(cardType.equals("Mastercard")) {
			return new Mastercard(number, name, cvv);
		}
		else if(cardType.equals("Visa")) {
			return new Visa(number, name, cvv);
		}
		else if(cardType.equals("Maestro")) {
			return new Maestro(number, name, cvv);
		}
		return null;
	}

	
}
