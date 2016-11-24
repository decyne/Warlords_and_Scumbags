import java.util.*;

public class Game{

  public Game(int num_players){
    deck = new Deck();
    for(int i = 0; i < num_players; i++){
      String player_name = "Computer " + String.valueOf(i);
      players.add(new Human(player_name));
    }
  }

  public void deal(){
    while(!deck.isEmpty()){
      for(int i = 0; i < players.size(); i++){
        players.get(i).takeCard(deck.draw());
        if(deck.isEmpty()){
          break;
        }
      }
    }
  }

  public void playGame(){
    this.deck.shuffle();
    this.deal();
    Round round1 = new Round(deck,players);
    round1.playRound();
  }

  private void showPlayerHands(){
    for(int i = 0; i < players.size(); i++){
      players.get(i).showHand();
    }
  }

  private Vector<Player> players = new Vector<Player>();
  private Deck deck;
}
