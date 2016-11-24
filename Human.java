import java.util.*;

public class Human extends Player {

  public Human(String name){
    this.name = name;
  }

  public Card play(){
    this.showHand();
    Scanner reader = new Scanner(System.in);
    System.out.println("Please enter the number of the card you wish to play");
    int i = reader.nextInt();
    // If the player wants to pass on the round and play no card they select the
    // last option is selected and null is returned
    if (i == hand.size()){
      return null;
    }
    // Otherwise return card selected
    else{
      Card played_card = hand.get(i);
      hand.removeElementAt(i);
      return played_card;
    }
  }
}
