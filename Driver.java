class Driver{
  public static void main(String[] args){

    Deck example = new Deck();
    example.printDeck();
    System.out.println("--------------------------------------");
    example.shuffle();
    example.printDeck();
  }
}
