public enum Rank {
  Two(2),
  Three(3),
  Four(4),
  Five(5),
  Six(6),
  Seven(7),
  Eight(8),
  Nine(9),
  Ten(10),
  Jack(11),
  Queen(12),
  King(13),
  Ace(14),
  Joker(15);

  private final int rank;

  Rank(int rank){
    this.rank = rank;
  }

  public static Rank fromInt(int i){
    //Generate the correct card from a number input
    switch(i){
      case 2:
        return Two;
      case 3:
        return Three;
      case 4:
        return Four;
      case 5:
        return Five;
      case 6:
        return Six;
      case 7:
        return Seven;
      case 8:
        return Eight;
      case 9:
        return Nine;
      case 10:
        return Ten;
      case 11:
        return Jack;
      case 12:
        return Queen;
      case 13:
        return King;
      case 14:
        return Ace;
      case 15:
        return Joker;
      default:
        throw new Error();
    }
  }
}
