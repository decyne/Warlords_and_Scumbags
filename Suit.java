public enum Suit{
  Clubs(0),
  Spades(1),
  Diamonds(2),
  Hearts(3);

  private final int suit;

  Suit(int input){
    suit = input;
  }

  public static Suit fromInt(int i){
    //Generate the correct card from a number input
    switch(i){
      case 0:
        return Clubs;
      case 1:
        return Spades;
      case 2:
        return Diamonds;
      case 3:
        return Hearts;
      default:
        throw new Error();
    }
  }
}
