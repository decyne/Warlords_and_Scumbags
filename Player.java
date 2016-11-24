import java.util.*;

public class Player{

  public Player(){
  }

  public Player(String name){
    this.name = name;
  }

  public Card play(){
    return null;
  }

  public void takeCard(Card card){
    hand.addElement(card);
  }

  public void showHand(){
    System.out.println("Hand of " + name);
    System.out.println("------------------------");
    for(int i = 0; i < hand.size(); i++){
      System.out.println(String.valueOf(i) + ") " + hand.get(i).sayCard());
    }
    System.out.println(hand.size() + ") Pass round");
    System.out.println();
  }

  public String getName(){
    return name;
  }

  protected String name;
  protected Vector<Card> hand = new Vector<Card>();
}
