package CardDeck;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Card {

    private SuitType suit;
    private Value number;

    private final static Map<String, Card> CARD_CACHE = initCache();

    private static Map<String, Card> initCache() {
        final Map<String, Card> cache = new HashMap<>();
        for (final SuitType suit : SuitType.values()) {
            for (final Value number : Value.values()) {
                cache.put(cardKey(number, suit), new Card(number, suit));
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static String cardKey(final Value number,
                                  final SuitType suit) {
        return number + " o " + suit;
    }

    private Card(final Value number,
                 final SuitType suit) {
        this.number = number;
        this.suit = suit;
    }

}
