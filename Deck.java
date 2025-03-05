import java.util.*;
class Deck{
     ArrayList<Card> deck;

      public Deck(){
            this.deck = new ArrayList<>();
      }

      public void createDeck(){
         String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
         String[] suits = {"Clubs", "Diamonds","Hearts","Spades"};     
      

      for(String rank : ranks){
         for(String suit : suits){
              deck.add(new Card(rank, suit));
         }
      }
}
     public void displayDeck(){
		for (Card card : deck){
			System.out.println(card);
		}
	}

     public void displayCard(String rank, String suit){
         System.out.println("Card is "+rank+" of "+suit);
     }


     public void sameCard(String rank, String suit) {
       System.out.println("Cards with the same suit as " + rank + " of " + suit + ":");
    
       for (Card card : deck) {
           if (card.suit.equals(suit) && !card.rank.equals(rank)) {
                System.out.println(card);
           } 
       }
     }

     public void compareCard(String rank, String suit) {
    System.out.println("Cards with the same rank as " + rank + " of " + suit + ":");
    
    for (Card card : deck) {
        if (card.rank.equals(rank) && !card.suit.equals(suit)) {
            System.out.println(card);
        }
    }
}
  
    public void findCard(String rank, String suit) {
    for (Card card : deck) {
        if (card.rank.equals(rank) && card.suit.equals(suit)) {
            System.out.println("Card found: " + card);
            return;
        }
    }
    System.out.println("Card not found in the deck.");
}

    public void dealCard() {
    if (deck.size() < 5) {
        System.out.println("Not enough cards in the deck.");
        return;
    }

    Random rand = new Random();
    HashSet<Integer> selectedIndices = new HashSet<>();
    
    System.out.println("5 Randomly selected cards:");
    while (selectedIndices.size() < 5) {
        int index = rand.nextInt(deck.size());
        if (!selectedIndices.contains(index)) {
            selectedIndices.add(index);
            System.out.println(deck.get(index));
        }
    }
}

    public void shuffleDeck(){
       Collections.shuffle(deck);
    }
 
}