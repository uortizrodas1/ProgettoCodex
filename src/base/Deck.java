package base;

import java.util.*;

public class Deck {
	private List<Card> deck;

	public Deck(List<Card> deck) {
		if(deck != null)
			this.deck = deck;
		else
			deck = new ArrayList<Card>();
	}

	/**
	 * shuffle the cards in the deck
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}

	/**
	 * true if the deck is empty, false if not
	 *
	 * @return
	 */
	public boolean isEmpty() {
		if (deck.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public Card drawCard() throws Exception {
		if (!this.isEmpty()) {
			Card draw = deck.get(0);
			deck.remove(0);
			return draw;
		} else {
			throw new Exception();
		}
	}

	public void addCard(Card card) {
		deck.add(card);
		shuffle();
	}

	@Override
	public String toString() {
		return String.format("Remaining cards %s \n",deck.size());
	}
}
