public class Card {

  public Card(Suit suit, Rank rank){
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Rank getRank(){
    return this.rank;
  }

  public int getIntRank(){
    return rank.getValue();
  }

  public String sayCard(){
    return rank + " of " + suit;
  }

  private Suit suit;
  private Rank rank;
}
