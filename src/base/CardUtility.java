package base;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

public class CardUtility {

	private static Card cards[];
	
	public static void readCardsFromFile() {

		Gson gson = new Gson();
		JsonReader reader = null;
		try {
			reader = new JsonReader(new FileReader("cards.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		GsonBuilder gsonBldr = new GsonBuilder();
		gsonBldr.registerTypeAdapter(Card[].class, new CardJsonAdapter());

		cards = gsonBldr.create().fromJson(reader, Card[].class);
	}
	
	public static Card[] getCards() {
		return cards;
	}
}
