import java.util.*;

public class Deck{

  public Deck(){
    //Generate all cards in a typical playing deck
    for(int rank = 2; rank < 15; rank++){
      for(int suit = 0; suit < 4; suit++){
        cards.addElement(new Card(Suit.fromInt(suit),Rank.fromInt(rank)));
      }
    }
  }

  public Card draw(){
    Card draw_card = cards.lastElement();
    cards.removeElementAt(cards.size()-1);
    return draw_card;
  }

  public void shuffle(){
    //Modern Fisher-Yates shuffle yay!
    for(int i = cards.size()-1; i >= 0; i--){
      int random_index = randomInt(0,i);
      Card random_card = cards.get(random_index);
      Card last_unshuffled_card = cards.get(i);

      //Swap a random card with the last unshuffled one
      cards.setElementAt(last_unshuffled_card,random_index);
      cards.setElementAt(random_card,i);
    }
  }

  public void printDeck(){
    for(int i = 0; i < cards.size(); i++){
      System.out.println(cards.get(i).getRank() + " of " + cards.get(i).getSuit());
    }
  }

  public Boolean isEmpty(){
    if (cards.isEmpty()){
      return true;
    }
    else{
      return false;
    }
  }

  private int randomInt(int min, int max){
      Random rand = new Random();
      int randomNum = rand.nextInt((max - min) + 1) + min;
      return randomNum;
  }

  private Vector<Card> cards = new Vector<Card>();
}
