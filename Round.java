import java.util.*;

public class Round{

  public Round(Deck deck, Vector<Player> players){
    Collections.copy(this.players,players);
    Collections.copy(this.valid_players,players);
  }

  public void playRound(){
    //If one player is left they have won the round!
    int i = 0;
    while(valid_players.size() > 1){
      //Give player 3 tries to play a correct card, otherwise they are out
      int tries = 0;
      while(true){
        Card played_card = valid_players.get(i).play();
        if (validMove(played_card)){
          play_pile.addElement(played_card);
          break;
        }
        else{
          //If the move was invalid give the player their card back
          valid_players.get(i).takeCard(played_card);
          // If the player made too many invalid moves eliminate them
          if(i >= 3){
            valid_players.removeElementAt(i);
            break;
          }
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
