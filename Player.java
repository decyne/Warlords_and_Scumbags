import java.util.*;

public class Player{

  public Player(String name){
    this.name = name;
  }

  //public Card play(){
  //}

  public void takeCard(Card card){
    hand.addElement(card);
  }

  public void showHand(){
    System.out.println("Hand of " + name);
    System.out.println("------------------------");
    for(int i = 0; i < hand.size(); i++)
    System.out.println(hand.get(i).getRank() + " of " + hand.get(i).getSuit());
    System.out.println();
  }

  private String name;
  private Vector<Card> hand = new Vector<Card>();
}
