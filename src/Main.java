import abstractFactory.CardFactory;
import abstractFactory.FactoryVisa;
import cards.Card;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		Card myMaster = Factory.getCard(43197993, "Steven McAvoy", 731, "Visa");
		System.out.println(myMaster);
		
		Card mySecondCard = CardFactory.getCard(new FactoryVisa(123456, "Manuel Silva", 555));
		System.out.println(mySecondCard);
	}

}
