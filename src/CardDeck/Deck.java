package CardDeck;

public class Deck {

     private Card cards[];

     public Deck() {
          this.cards = new Card[52];
          for (int i = 0; i < 52; i++) {
               Card card = new Card(...); //Instantiate a Card
               this.cards[i] = card; //Adding card to the Deck
     }
}
