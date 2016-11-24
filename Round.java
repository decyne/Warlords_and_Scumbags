import java.util.*;

public class Round{

  public Round(Deck deck, Vector<Player> players){
    this.players = players;
    valid_players = (Vector<Player>) players.clone();
  }

  public void playRound(){
    //If one player is left they have won the round!
    int i = 0;
    int no_invalid_moves = 3;
    Boolean first_turn = true;
    while(valid_players.size() > 1){
      //Give player 3 tries to play a correct card, otherwise they are out
      int tries = 0;
      while(true){
        Card played_card = valid_players.get(i).play();
        if (played_card == null){
          System.out.println(valid_players.get(i).getName() + " has passed");
          valid_players.removeElementAt(i);
          break;
        }
        else if ((first_turn == true) || (validMove(played_card))){
          first_turn = false;
          play_pile.addElement(played_card);
          System.out.println("Card played is: " + played_card.sayCard());
          break;
        }
        else{
          //If the move was invalid give the player their card back
          System.out.println(played_card.sayCard() + " cannot be played, try another card");
          valid_players.get(i).takeCard(played_card);
          // If the player made too many invalid moves eliminate them
          if(i >= no_invalid_moves){
            valid_players.removeElementAt(i);
            break;
          }
        }
      }
      //If last player has taken their move, the first player takes theirs again, otherwise the next player takes their mmove
      if (i == valid_players.size()-1){
        i = 0;
      }
      else{
        i++;
      }
    }
    System.out.println("The winner is: " + valid_players.get(0).getName());
  }

  // Check the move by the player is valid
  private Boolean validMove(Card played_card){
    if (played_card.getIntRank() > play_pile.lastElement().getIntRank()){
      return true;
    }
    else{
      return false;
    }
  }

  private Vector<Player> players = new Vector<Player>();
  private Vector<Player> valid_players = new Vector<Player>();
  private Vector<Card> play_pile = new Vector<Card>();
  private Deck deck;
}
